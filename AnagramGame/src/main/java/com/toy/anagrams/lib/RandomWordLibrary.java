/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/* Anagram Game Application */

package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 */
final class RandomWordLibrary extends WordLibrary {
    private static final String[] WORD_LIST = {
            "abstraction",
            "ambiguous",
            "arithmetic",
            "backslash",
            "bitmap",
            "circumstance",
            "combination",
            "consequently",
            "consortium",
            "decrementing",
            "dependency",
            "disambiguate",
            "dynamic",
            "encapsulation",
            "equivalent",
            "expression",
            "facilitate",
            "fragment",
            "hexadecimal",
            "implementation",
            "indistinguishable",
            "inheritance",
            "internet",
            "java",
            "localization",
            "microprocessor",
            "navigation",
            "optimization",
            "parameter",
            "patrick",
            "pickle",
            "polymorphic",
            "rigorously",
            "simultaneously",
            "specification",
            "structure",
            "lexical",
            "likewise",
            "management",
            "manipulate",
            "mathematics",
            "hotjava",
            "vertex",
            "unsigned",
            "traditional"};

    private static final String[] SCRAMBLED_WORD_LIST = {
            "batsartcoin",
            "maibuguos",
            "ratimhteci",
            "abkclssha",
            "ibmtpa",
            "iccrmutsnaec",
            "ocbmnitaoni",
            "ocsnqeeutnyl",
            "ocsnroitmu",
            "edrcmeneitgn",
            "edepdnneyc",
            "idasbmgiauet",
            "ydanicm",
            "neacsplutaoni",
            "qeiuaveltn",
            "xerpseisno",
            "aficilatet",
            "rfgaemtn",
            "ehaxedicalm",
            "milpmeneatitno",
            "niidtsniugsiahleb",
            "niehiratcen",
            "nietnret",
            "ajav",
            "olacilazitno",
            "imrcpoorecssro",
            "anivagitno",
            "poitimazitno",
            "aparemert",
            "aprtcki",
            "ipkcel",
            "opylomprich",
            "irogorsuyl",
            "isumtlnaoesuyl",
            "psceficitaoni",
            "tsurtcreu",
            "elixalc",
            "ilekiwse",
            "amanegemtn",
            "aminupalet",
            "amhtmetacsi",
            "ohjtvaa",
            "evtrxe",
            "nuisngde",
            "rtdatioialn"
    };

    static {
        for(int i = 0; i < WORD_LIST.length; i++) {
            double random = Math.random();
            double randomLength = random * WORD_LIST.length; // length of 15, randomLength 0..14.999999
            int to = (int)(randomLength);
            System.out.println("Swapping " + i + " with " + to);
            String correct = WORD_LIST[to];
            String scrambled = SCRAMBLED_WORD_LIST[to];
            WORD_LIST[to] = WORD_LIST[i];
            SCRAMBLED_WORD_LIST[to] = SCRAMBLED_WORD_LIST[i];
            WORD_LIST[i] = correct;
            SCRAMBLED_WORD_LIST[i] = scrambled;
        }
    }

    /**
     * Gets the word at a given index.
     *
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     *
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     *
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }
}