package com.asxy.composite;

import com.asxy.composite.file.ImageFile;
import com.asxy.composite.file.TextFile;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("|==> 文件夹内容如下： --------------------------------------------------------|");
        // 构造如下的文件目录层次
        System.out.println("    =文档资料");
        System.out.println("        =杂项");
        System.out.println("            梦一样的早晨.txt");
        System.out.println("            身份证正反面.png");
        System.out.println("        =参考资料汇总");
        System.out.println("            =01-招投标书");
        System.out.println("                XXX项目标书模板.doc");
        System.out.println("            =02-设计方案");
        System.out.println("            参考链接汇总.txt");
        System.out.println("        备忘事项.jpg");

        AbstractFile root = new Folder("文档资料");
        Folder node_1_1 = new Folder("杂项");
        TextFile test = new TextFile("test");
        node_1_1.add(new TextFile("梦一样的早晨.txt"));
        node_1_1.add(new ImageFile("身份证正反面.png"));
        Folder node_1_2 = new Folder("参考资料汇总");
        Folder node_2_1 = new Folder("01-招投标书");
        node_2_1.add(new TextFile("XXX项目标书模板.doc"));
        node_1_2.add(node_2_1);
        node_1_2.add(new Folder("02-设计方案"));
        node_1_2.add(new TextFile("参考链接汇总.txt"));

        ((Folder) root).add(node_1_1);
        ((Folder) root).add(node_1_2);
        ((Folder) root).add(new ImageFile("备忘事项.jpg"));

        System.out.println("|==> 开始杀毒： -------------------------------------------------------------|");
        root.destroyVirus();
    }
}
