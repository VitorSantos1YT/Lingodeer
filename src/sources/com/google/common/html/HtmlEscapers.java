package com.google.common.html;

import com.google.common.escape.Escapers;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class HtmlEscapers {
    static {
        int i11 = Escapers.f17313a;
        Escapers.Builder builder = new Escapers.Builder(0);
        HashMap map = builder.f17314a;
        map.put('\"', "&quot;");
        map.put('\'', "&#39;");
        map.put('&', "&amp;");
        map.put('<', "&lt;");
        map.put('>', "&gt;");
        builder.a();
    }

    private HtmlEscapers() {
    }
}
