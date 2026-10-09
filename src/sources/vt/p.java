package vt;

import com.lingodeer.database.model.BookmarkFolderEntity;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.i implements fz.c {
    public int H;
    public int K;
    public int L;
    public int M;
    public int N;
    public final /* synthetic */ r O;
    public final /* synthetic */ String P;
    public final /* synthetic */ Set Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f54270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f54271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f54272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f54273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BookmarkFolderEntity f54274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f54275f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public BookmarkFolderEntity f54276t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, String str, Set set, vy.d dVar) {
        super(1, dVar);
        this.O = rVar;
        this.P = str;
        this.Q = set;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new p(this.O, this.P, this.Q, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((p) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x0239  */
    /* JADX WARN: Code duplicated, block: B:58:0x023e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0288  */
    /* JADX WARN: Code duplicated, block: B:65:0x028d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01da -> B:50:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x028d -> B:8:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
