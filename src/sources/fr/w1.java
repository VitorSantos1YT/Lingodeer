package fr;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.network.model.LeaderBoardResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends xy.i implements fz.e {
    public fz.e H;
    public Iterator K;
    public String L;
    public String M;
    public String N;
    public LeaderBoardUser O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final /* synthetic */ LeaderBoardResponse U;
    public final /* synthetic */ String V;
    public final /* synthetic */ String W;
    public final /* synthetic */ String X;
    public final /* synthetic */ bp.j Y;
    public final /* synthetic */ bp.h2 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f27941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f27942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LeaderBoardResponse f27943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27946f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fz.e f27947t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(LeaderBoardResponse leaderBoardResponse, String str, String str2, String str3, bp.j jVar, bp.h2 h2Var, vy.d dVar) {
        super(2, dVar);
        this.U = leaderBoardResponse;
        this.V = str;
        this.W = str2;
        this.X = str3;
        this.Y = jVar;
        this.Z = h2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new w1(this.U, this.V, this.W, this.X, this.Y, this.Z, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x012e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0138  */
    /* JADX WARN: Code duplicated, block: B:17:0x0178  */
    /* JADX WARN: Code duplicated, block: B:19:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:20:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:24:0x020b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0227  */
    /* JADX WARN: Code duplicated, block: B:30:0x0235  */
    /* JADX WARN: Code duplicated, block: B:31:0x023a  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x020b -> B:25:0x0214). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0227 -> B:26:0x0222). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
