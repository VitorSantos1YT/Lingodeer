package fr;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.network.model.ApiResponse;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public int M;
    public final /* synthetic */ v1 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse f27668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1 f27669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f27670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f27671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LeaderBoardUser f27673f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f27674t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(v1 v1Var, vy.d dVar) {
        super(2, dVar);
        this.N = v1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new l1(this.N, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00de  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:27:0x013c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x013c -> B:28:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
