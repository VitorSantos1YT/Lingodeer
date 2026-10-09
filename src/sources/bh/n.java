package bh;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {
    public List H;
    public Object K;
    public Iterator L;
    public CourseWord M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final /* synthetic */ t R;
    public final /* synthetic */ long S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f4295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CourseSentence f4296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f4297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f4298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f4299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f4300f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f4301t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j11, t tVar, vy.d dVar) {
        super(2, dVar);
        this.R = tVar;
        this.S = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new n(this.S, this.R, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x017c  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01b1 -> B:40:0x01b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x021c -> B:8:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
