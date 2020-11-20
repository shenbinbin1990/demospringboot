package com.example.demospringboot.service;

import com.example.demospringboot.entity.*;
import com.example.demospringboot.mapper.PoInfoMapper;
import com.example.demospringboot.mapper.SysEdgeMapper;
import com.example.demospringboot.mapper.SysNodeRoleMapper;
import com.example.demospringboot.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NodeService {

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysNodeRoleMapper sysNodeRoleMapper;
    @Autowired
    private PoInfoMapper poInfoMapper;
    @Autowired
    private SysEdgeMapper sysEdgeMapper;
    public SysRole selectSysRoleByPrimaryKey(String jsbh){
        return sysRoleMapper.selectByPrimaryKey(jsbh);
    }
    public List<String> selectSysNodeCodeListByRoleId(String jsbh){
        return sysNodeRoleMapper.selectSysNodeCodeListByRoleId(jsbh);
    }

    public List<PoInfo> selectPoInfoIdListByNodeCodeList(List<String> nodeCodeList) {
        PoInfoExample example = new PoInfoExample();
        example.createCriteria().andDqjdztIn(nodeCodeList);
        List<PoInfo> poInfoList = poInfoMapper.selectByExample(example);
        return poInfoList;
    }

    public List<String> getGotoByStart(String dqjdzt) {
        SysEdgeExample example = new SysEdgeExample();
        example.createCriteria().andFromNodeEqualTo(dqjdzt);
        List<SysEdgeKey> sysEdgeKeyList = sysEdgeMapper.selectByExample(example);
        return sysEdgeKeyList.stream().map(SysEdgeKey::getToNode).collect(Collectors.toList());
    }

    public void updatePoInfoById(PoInfo poInfo) {
        poInfoMapper.updateByPrimaryKey(poInfo);
    }
}
