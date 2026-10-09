package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QueryParams;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class OperationSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final OperationSource f19392d = new OperationSource(Source.User, null, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final OperationSource f19393e = new OperationSource(Source.Server, null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f19394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QueryParams f19395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19396c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Source {
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source Server;
        public static final Source User;

        static {
            Source source = new Source("User", 0);
            User = source;
            Source source2 = new Source("Server", 1);
            Server = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public OperationSource(Source source, QueryParams queryParams, boolean z11) {
        this.f19394a = source;
        this.f19395b = queryParams;
        this.f19396c = z11;
        if (z11) {
            b();
        }
        char[] cArr = Utilities.f19432a;
    }

    public static OperationSource a(QueryParams queryParams) {
        return new OperationSource(Source.Server, queryParams, true);
    }

    public final boolean b() {
        return this.f19394a == Source.Server;
    }

    public final boolean c() {
        return this.f19394a == Source.User;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperationSource{source=");
        sb2.append(this.f19394a);
        sb2.append(", queryParams=");
        sb2.append(this.f19395b);
        sb2.append(", tagged=");
        return a.l(sb2, this.f19396c, '}');
    }
}
