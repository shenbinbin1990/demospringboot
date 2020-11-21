package com.example.demospringboot.test;

import com.example.demospringboot.entity.PoInfo;
import com.example.demospringboot.entity.SysRole;
import com.example.demospringboot.service.NodeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Scanner;

@RunWith(SpringRunner.class)
@SpringBootTest()

public class NodeTest {
    @Autowired
    private NodeService nodeService;
    @Test
    public void getUserByIdTest(){
<<<<<<< HEAD
    //修改master同样存在的问题
=======
>>>>>>> dev
        System.out.println("开始:");
        Scanner scanner = new Scanner(System.in);
        while(true){
            //提示输入相应的登录角色编号进行登录
            System.out.println("输入相应的登录角色编号进行登录:");
            String roleId = scanner.nextLine();
            //登录后获取角色名缓存
            SysRole sysRole = nodeService.selectSysRoleByPrimaryKey(roleId);
            System.out.println(sysRole);
            //获取当前角色所拥有的权限的相应事件
            List<String> nodeCodeList = nodeService.selectSysNodeCodeListByRoleId(sysRole.getJsbh());
            for (String nodeCode: nodeCodeList) {
                System.out.println(nodeCode);
            }
            while (true){
                List<PoInfo> poInfoList = nodeService.selectPoInfoIdListByNodeCodeList(nodeCodeList);
                //4-提示用户进行选择权限内事件进行处理,或者退出
                System.out.print("请选择权限内事件进行处理:");
                poInfoList.stream().forEach(poInfo -> System.out.print(" "+poInfo.getPobh()+","));
                System.out.println("或者按0退出");
                String poInfoIdChoosed = scanner.nextLine();
                if("0".equals(poInfoIdChoosed)){
                    break;
                }
                PoInfo poInfoChoosed = new PoInfo();
                for (PoInfo poInfo:poInfoList
                     ) {
                    if(poInfo.getPobh().equals(poInfoIdChoosed)){
                        poInfoChoosed = poInfo;
                    }
                }
                //修改主分支上的同样的bug
                //显示所选择事件的可能去向,提供选择.或者退出
                List<String> goToList = nodeService.getGotoByStart(poInfoChoosed.getDqjdzt());
                System.out.print("请选择事件的去向:  ");
                goToList.forEach(goTo -> System.out.print(goTo+" ,"));
                String goToChoosed = scanner.nextLine();
                //进行操作,改变事件节点状态然后返回步骤4
                poInfoChoosed.setDqjdzt(goToChoosed);
                nodeService.updatePoInfoById(poInfoChoosed);
//测试rebase
            }

        }
    }
}
