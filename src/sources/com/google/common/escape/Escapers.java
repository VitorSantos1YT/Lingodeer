package com.google.common.escape;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Escapers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17313a = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f17314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public char f17315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17316c;

        /* JADX INFO: renamed from: com.google.common.escape.Escapers$Builder$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends ArrayBasedCharEscaper {
        }

        public /* synthetic */ Builder(int i11) {
            this();
        }

        public final void a() {
            char[][] cArr;
            HashMap map = this.f17314a;
            map.getClass();
            if (map.isEmpty()) {
                cArr = ArrayBasedEscaperMap.f17312a;
            } else {
                char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
                for (Character ch2 : map.keySet()) {
                    cArr2[ch2.charValue()] = ((String) map.get(ch2)).toCharArray();
                }
                cArr = cArr2;
            }
            new AnonymousClass1();
            int length = cArr.length;
            String str = this.f17316c;
            if (str != null) {
                str.toCharArray();
            }
        }

        private Builder() {
            this.f17314a = new HashMap();
            this.f17315b = (char) 65535;
            this.f17316c = null;
        }
    }

    static {
        new CharEscaper() { // from class: com.google.common.escape.Escapers.1
        };
    }

    private Escapers() {
    }
}
