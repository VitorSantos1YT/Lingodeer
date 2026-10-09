package jt;

import android.content.Context;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public int M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ g P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ List R;
    public final /* synthetic */ rz.b0 S;
    public final /* synthetic */ String T;
    public final /* synthetic */ String U;
    public final /* synthetic */ int V;
    public final /* synthetic */ CourseSentence W;
    public final /* synthetic */ vt.n0 X;
    public final /* synthetic */ av.i Y;
    public final /* synthetic */ Context Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f37016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f37017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f37018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CourseWord f37019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CourseWord f37020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l1.b1 f37021f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f37022t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String str, List list, rz.b0 b0Var, String str2, String str3, int i11, CourseSentence courseSentence, vt.n0 n0Var, av.i iVar, Context context, vy.d dVar) {
        super(2, dVar);
        this.P = gVar;
        this.Q = str;
        this.R = list;
        this.S = b0Var;
        this.T = str2;
        this.U = str3;
        this.V = i11;
        this.W = courseSentence;
        this.X = n0Var;
        this.Y = iVar;
        this.Z = context;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        l lVar = new l(this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, dVar);
        lVar.O = obj;
        return lVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x02be  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0300 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0301  */
    /* JADX WARN: Code duplicated, block: B:79:0x0363  */
    /* JADX WARN: Code duplicated, block: B:80:0x0365  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0301 -> B:76:0x0306). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jt.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
