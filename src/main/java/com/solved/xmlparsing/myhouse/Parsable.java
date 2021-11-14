package com.solved.xmlparsing.myhouse;

import java.io.IOException;

public interface Parsable {

    House parse(String fileName) throws IOException;

}
