/*
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.florianingerl.util.regex;

import java.util.HashMap;
import java.util.Locale;

enum UnicodeProp {

    ALPHABETIC {

        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    LETTER {

        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    IDEOGRAPHIC {

        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    LOWERCASE {

        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    UPPERCASE {

        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    TITLECASE {

        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    WHITE_SPACE {

        // \p{Whitespace}
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    CONTROL {

        // \p{gc=Control}
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    PUNCTUATION {

        // \p{gc=Punctuation}
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    HEX_DIGIT {

        // \p{gc=Decimal_Number}
        // \p{Hex_Digit} -> PropList.txt: Hex_Digit
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    ASSIGNED {

        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    NONCHARACTER_CODE_POINT {

        // PropList.txt:Noncharacter_Code_Point
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    DIGIT {

        // \p{gc=Decimal_Number}
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    ALNUM {

        // \p{alpha}
        // \p{digit}
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    BLANK {

        // \p{Whitespace} --
        // [\N{LF} \N{VT} \N{FF} \N{CR} \N{NEL} -> 0xa, 0xb, 0xc, 0xd, 0x85
        // \p{gc=Line_Separator}
        // \p{gc=Paragraph_Separator}]
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    GRAPH {

        // [^
        // \p{space}
        // \p{gc=Control}
        // \p{gc=Surrogate}
        // \p{gc=Unassigned}]
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    PRINT {

        // \p{graph}
        // \p{blank}
        // -- \p{cntrl}
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    WORD {

        // \p{alpha}
        // \p{gc=Mark}
        // \p{digit}
        // \p{gc=Connector_Punctuation}
        // \p{Join_Control} 200C..200D
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    JOIN_CONTROL {

        // 200C..200D PropList.txt:Join_Control
        public boolean is(int ch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ;

    private final static HashMap<String, String> posix = new HashMap<String, String>();

    private final static HashMap<String, String> aliases = new HashMap<String, String>();

    static {
        posix.put("ALPHA", "ALPHABETIC");
        posix.put("LOWER", "LOWERCASE");
        posix.put("UPPER", "UPPERCASE");
        posix.put("SPACE", "WHITE_SPACE");
        posix.put("PUNCT", "PUNCTUATION");
        posix.put("XDIGIT", "HEX_DIGIT");
        posix.put("ALNUM", "ALNUM");
        posix.put("CNTRL", "CONTROL");
        posix.put("DIGIT", "DIGIT");
        posix.put("BLANK", "BLANK");
        posix.put("GRAPH", "GRAPH");
        posix.put("PRINT", "PRINT");
        aliases.put("WHITESPACE", "WHITE_SPACE");
        aliases.put("HEXDIGIT", "HEX_DIGIT");
        aliases.put("NONCHARACTERCODEPOINT", "NONCHARACTER_CODE_POINT");
        aliases.put("JOINCONTROL", "JOIN_CONTROL");
    }

    public static UnicodeProp forName(String propName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static UnicodeProp forPOSIXName(String propName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public abstract boolean is(int ch);
}
