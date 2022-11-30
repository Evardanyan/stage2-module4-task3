package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser{
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        System.out.println("word parser");
        char[] arr = string.toCharArray();

        for (char x : arr) {
            abstractTextComponent.add(new SymbolLeaf(x, TextComponentType.WORD));
        }
    }
}