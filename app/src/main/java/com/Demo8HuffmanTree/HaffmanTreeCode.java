 /**
 --  * File name:    HaffmanTree
 --  * Author:       action.zhou
 --  * Version:      1.0
 --  * Date:         2019.3.26
 --  * Description:  霍夫曼树编码
 --  * Others:
 --  * Function List:
 --  * History:
 --  */
package com.Demo8HuffmanTree;

public class HaffmanTreeCode {
    String character;
    String code;
    HaffmanTreeCode(String character,String code){
        this.character=character;
        this.code=code;
    }
    HaffmanTreeCode(String code){
        this.code= code;
    }

    void setCharacter(String character){
        this.character=character;
    }

    void setCode(String code){
        this.code=code;
    }

    String getCharacter(){
        return character;
    }

    String getCode(){
        return code;
    }

    //
}
