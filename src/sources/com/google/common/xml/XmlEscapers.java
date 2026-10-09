package com.google.common.xml;

import com.google.common.escape.Escapers;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class XmlEscapers {
    static {
        int i11 = Escapers.f17313a;
        char c11 = 0;
        Escapers.Builder builder = new Escapers.Builder(0);
        builder.f17315b = (char) 65533;
        builder.f17316c = "�";
        while (true) {
            HashMap map = builder.f17314a;
            if (c11 > 31) {
                map.put('&', "&amp;");
                map.put('<', "&lt;");
                map.put('>', "&gt;");
                builder.a();
                map.put('\'', "&apos;");
                map.put('\"', "&quot;");
                builder.a();
                map.put('\t', "&#x9;");
                map.put('\n', "&#xA;");
                map.put('\r', "&#xD;");
                builder.a();
                return;
            }
            if (c11 != '\t' && c11 != '\n' && c11 != '\r') {
                map.put(Character.valueOf(c11), "�");
            }
            c11 = (char) (c11 + 1);
        }
    }

    private XmlEscapers() {
    }
}
