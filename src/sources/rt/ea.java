package rt;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryType;
import com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ea extends xy.i implements fz.e {
    public List H;
    public Object K;
    public Object L;
    public Object M;
    public CourseTestSummaryItemStatus N;
    public Object O;
    public int P;
    public final /* synthetic */ LinkedHashMap Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ Set T;
    public final /* synthetic */ CoursePracticeType U;
    public final /* synthetic */ CourseTestFinishSummaryType V;
    public final /* synthetic */ wt.o0 W;
    public final /* synthetic */ wt.m X;
    public final /* synthetic */ vt.n0 Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oc f49689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f49690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f49691f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f49692t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(LinkedHashMap linkedHashMap, int i11, int i12, Set set, CoursePracticeType coursePracticeType, CourseTestFinishSummaryType courseTestFinishSummaryType, wt.o0 o0Var, wt.m mVar, vt.n0 n0Var, vy.d dVar) {
        super(2, dVar);
        this.Q = linkedHashMap;
        this.R = i11;
        this.S = i12;
        this.T = set;
        this.U = coursePracticeType;
        this.V = courseTestFinishSummaryType;
        this.W = o0Var;
        this.X = mVar;
        this.Y = n0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new ea(this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((ea) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0204  */
    /* JADX WARN: Code duplicated, block: B:21:0x0216  */
    /* JADX WARN: Code duplicated, block: B:24:0x0224  */
    /* JADX WARN: Code duplicated, block: B:26:0x0229  */
    /* JADX WARN: Code duplicated, block: B:27:0x0236  */
    /* JADX WARN: Code duplicated, block: B:29:0x026a  */
    /* JADX WARN: Code duplicated, block: B:30:0x026d  */
    /* JADX WARN: Code duplicated, block: B:33:0x027a  */
    /* JADX WARN: Code duplicated, block: B:35:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x0315  */
    /* JADX WARN: Code duplicated, block: B:40:0x032b  */
    /* JADX WARN: Code duplicated, block: B:42:0x03c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0229 -> B:59:0x0587). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0315 -> B:39:0x0316). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x032b -> B:41:0x0339). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x03c0 -> B:59:0x0587). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x04dd -> B:59:0x0587). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0574 -> B:59:0x0587). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r59) {
        /*
            Method dump skipped, instruction units count: 1766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.ea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
