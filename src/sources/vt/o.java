package vt;

import com.lingodeer.database.model.BookmarkFolderEntity;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.i implements fz.c {
    public int H;
    public int K;
    public int L;
    public final /* synthetic */ r M;
    public final /* synthetic */ String N;
    public final /* synthetic */ Set O;
    public final /* synthetic */ Set P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f54260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f54262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f54263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BookmarkFolderEntity f54264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f54265f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f54266t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, String str, Set set, Set set2, vy.d dVar) {
        super(1, dVar);
        this.M = rVar;
        this.N = str;
        this.O = set;
        this.P = set2;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new o(this.M, this.N, this.O, this.P, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((o) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:31:0x010b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0159  */
    /* JADX WARN: Code duplicated, block: B:38:0x015d  */
    /* JADX WARN: Code duplicated, block: B:42:0x019f  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01a3 -> B:46:0x01a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
