package com.asxy.facade;

import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.jws.WebParam;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/15
 */
public class Client {

    public static void main(String[] args) {
        ModelFacade.INSTANCE.open();
        ModelFacade.INSTANCE.familyMode();
        ModelFacade.INSTANCE.professionalMode();
        ModelFacade.INSTANCE.liveMode();
        ModelFacade.INSTANCE.close();

    }
}
