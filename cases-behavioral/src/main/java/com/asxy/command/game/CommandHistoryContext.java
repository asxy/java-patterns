package com.asxy.command.game;

import com.asxy.command.game.command.AbstractCommand;

import java.util.Stack;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class CommandHistoryContext {

    /**
     * 历史命令
     */
    private final Stack<AbstractCommand> history = new Stack<>();

    /**
     * 入栈
     * @param c 命令
     */
    public void push(AbstractCommand c) {
        history.push(c);
    }

    /**
     * 出栈
     * @return 命令
     */
    public AbstractCommand pop() {
        return history.pop();
    }

    /**
     * 栈是否为空
     * @return true是
     */
    public boolean isEmpty() {
        return history.isEmpty();
    }

    /**
     * 清空快照
     */
    public void clear() {
        history.clear();
    }
}
