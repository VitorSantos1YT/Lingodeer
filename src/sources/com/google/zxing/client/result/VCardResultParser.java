package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class VCardResultParser extends ResultParser {
    static {
        Pattern.compile("BEGIN:VCARD", 2);
        Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
        Pattern.compile("\r\n[ \t]");
        Pattern.compile("\\\\[nN]");
        Pattern.compile("\\\\([,;\\\\])");
        Pattern.compile("=");
        Pattern.compile(";");
        Pattern.compile("(?<!\\\\);+");
        Pattern.compile(",");
        Pattern.compile("[;,]");
    }
}
