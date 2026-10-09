package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class Joiner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16365a;

    /* JADX INFO: renamed from: com.google.common.base.Joiner$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends Joiner {
        @Override // com.google.common.base.Joiner
        public final void a(StringBuilder sb2, Iterator it) {
            Preconditions.k(it, "parts");
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
        }

        @Override // com.google.common.base.Joiner
        public final Joiner e() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Joiner$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends AbstractList<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            if (i11 == 0 || i11 == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MapJoiner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Joiner f16367a;

        public MapJoiner(Joiner joiner) {
            this.f16367a = joiner;
        }

        public final void a(StringBuilder sb2, Iterator it) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Joiner joiner = this.f16367a;
                sb2.append(joiner.d(key));
                sb2.append("=");
                sb2.append(joiner.d(entry.getValue()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) joiner.f16365a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb2.append(joiner.d(entry2.getKey()));
                    sb2.append("=");
                    sb2.append(joiner.d(entry2.getValue()));
                }
            }
        }
    }

    public Joiner(String str) {
        str.getClass();
        this.f16365a = str;
    }

    public void a(StringBuilder sb2, Iterator it) {
        if (it.hasNext()) {
            sb2.append(d(it.next()));
            while (it.hasNext()) {
                sb2.append((CharSequence) this.f16365a);
                sb2.append(d(it.next()));
            }
        }
    }

    public final void b(StringBuilder sb2, Iterator it) {
        try {
            a(sb2, it);
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public final String c(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        b(sb2, it);
        return sb2.toString();
    }

    public CharSequence d(Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner e() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            public final CharSequence d(Object obj) {
                return obj == null ? "null" : Joiner.this.d(obj);
            }

            @Override // com.google.common.base.Joiner
            public final Joiner e() {
                throw null;
            }
        };
    }

    public Joiner(Joiner joiner) {
        this.f16365a = joiner.f16365a;
    }
}
