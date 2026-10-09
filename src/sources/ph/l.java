package ph;

import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonFav;
import java.util.Iterator;
import java.util.List;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f46885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f46886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PdLessonFav f46887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PdLesson f46888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f46890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, vy.d dVar) {
        super(2, dVar);
        this.f46890f = oVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new l(this.f46890f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:21:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0174 A[DONT_INVERT, PHI: r1 r7 r8
      0x0174: PHI (r1v15 com.lingo.lingoskill.object.PdLesson) = 
      (r1v14 com.lingo.lingoskill.object.PdLesson)
      (r1v30 com.lingo.lingoskill.object.PdLesson)
      (r1v30 com.lingo.lingoskill.object.PdLesson)
      (r1v32 com.lingo.lingoskill.object.PdLesson)
     binds: [B:18:0x00e4, B:29:0x0152, B:25:0x013c, B:26:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r7v8 java.util.Iterator) = (r7v7 java.util.Iterator), (r7v9 java.util.Iterator), (r7v9 java.util.Iterator), (r7v9 java.util.Iterator) binds: [B:18:0x00e4, B:29:0x0152, B:25:0x013c, B:26:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r8v4 java.util.List) = (r8v3 java.util.List), (r8v5 java.util.List), (r8v5 java.util.List), (r8v5 java.util.List) binds: [B:18:0x00e4, B:29:0x0152, B:25:0x013c, B:26:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0176  */
    /* JADX WARN: Code duplicated, block: B:35:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:36:0x01da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e4 -> B:32:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0123 -> B:22:0x0126). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
