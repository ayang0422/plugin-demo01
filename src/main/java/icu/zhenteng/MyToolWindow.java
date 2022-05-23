package icu.zhenteng;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年05月19日
 */
public class MyToolWindow {
    private JPanel rootPanel;
    private JTextPane helloWorldTextPane;

    public MyToolWindow(ToolWindow toolWindow){

    }

    public JPanel getContent(){
        return rootPanel;
    }
}
