package okhttp3.internal.publicsuffix;

import kotlin.jvm.internal.m;
import m00.a0;
import m00.i0;
import m00.o;
import n00.e;
import p20.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f45568h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f45569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f45570g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        String str = a0.f40673b;
        f45568h = c.m("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list");
    }

    public ResourcePublicSuffixList() {
        e fileSystem = o.f40738b;
        a0 path = f45568h;
        m.f(path, "path");
        m.f(fileSystem, "fileSystem");
        this.f45569f = path;
        this.f45570g = fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final i0 b() {
        return this.f45570g.y(this.f45569f);
    }
}
