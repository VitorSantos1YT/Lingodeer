package ad;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.lingo.lingoskill.object.PdWord;
import fr.n3;
import hh.c0;
import java.util.ArrayList;
import java.util.List;
import jt.s0;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f568a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f573f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f574t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i11, List list, List list2, n3 n3Var, List list3, vy.d dVar) {
        super(2, dVar);
        this.f570c = i11;
        this.f572e = list;
        this.f573f = list2;
        this.f574t = n3Var;
        this.H = list3;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f568a) {
            case 0:
                return new b0((a0) this.f572e, (Context) this.f573f, (s) this.f574t, (b1) this.H, dVar);
            case 1:
                return new b0((cu.u) this.f574t, (cu.g) this.H, dVar);
            case 2:
                b0 b0Var = new b0((fr.i) this.f574t, this.f570c, (ArrayList) this.H, dVar);
                b0Var.f573f = obj;
                return b0Var;
            case 3:
                b0 b0Var2 = new b0(this.f570c, (List) this.f572e, (List) this.f573f, (n3) this.f574t, (List) this.H, dVar);
                b0Var2.f571d = obj;
                return b0Var2;
            case 4:
                return new b0((c0) this.f571d, (PdWord) this.f572e, (View) this.f573f, (View) this.f574t, (PopupWindow) this.H, this.f570c, dVar);
            default:
                return new b0((s0) this.H, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f568a) {
            case 0:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((b0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:369:0x0aee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:370:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:375:0x0b14 A[PHI: r0 r1
      0x0b14: PHI (r0v23 int) = (r0v35 int), (r0v36 int) binds: [B:374:0x0b12, B:369:0x0aee] A[DONT_GENERATE, DONT_INLINE]
      0x0b14: PHI (r1v3 java.lang.Throwable) = (r1v8 java.lang.Throwable), (r1v9 java.lang.Throwable) binds: [B:374:0x0b12, B:369:0x0aee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:380:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:381:0x0b28 A[Catch: all -> 0x0baf, TryCatch #10 {all -> 0x0baf, blocks: (B:376:0x0b16, B:378:0x0b20, B:381:0x0b28, B:384:0x0b32), top: B:467:0x0b16 }] */
    /* JADX WARN: Code duplicated, block: B:384:0x0b32 A[Catch: all -> 0x0baf, TRY_LEAVE, TryCatch #10 {all -> 0x0baf, blocks: (B:376:0x0b16, B:378:0x0b20, B:381:0x0b28, B:384:0x0b32), top: B:467:0x0b16 }] */
    /* JADX WARN: Code duplicated, block: B:389:0x0b43  */
    /* JADX WARN: Code duplicated, block: B:390:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:394:0x0b4e A[Catch: all -> 0x0ba7, TRY_LEAVE, TryCatch #2 {all -> 0x0ba7, blocks: (B:391:0x0b46, B:394:0x0b4e), top: B:451:0x0b46 }] */
    /* JADX WARN: Code duplicated, block: B:401:0x0b65  */
    /* JADX WARN: Code duplicated, block: B:515:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v3, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.lang.Throwable, vy.d] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:401:0x0b65 -> B:463:0x0b66). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r66) {
        /*
            Method dump skipped, instruction units count: 3084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, Context context, s sVar, b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f572e = a0Var;
        this.f573f = context;
        this.f574t = sVar;
        this.H = b1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(cu.u uVar, cu.g gVar, vy.d dVar) {
        super(2, dVar);
        this.f574t = uVar;
        this.H = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(fr.i iVar, int i11, ArrayList arrayList, vy.d dVar) {
        super(2, dVar);
        this.f574t = iVar;
        this.f570c = i11;
        this.H = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, PdWord pdWord, View view, View view2, PopupWindow popupWindow, int i11, vy.d dVar) {
        super(2, dVar);
        this.f571d = c0Var;
        this.f572e = pdWord;
        this.f573f = view;
        this.f574t = view2;
        this.H = popupWindow;
        this.f570c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s0 s0Var, vy.d dVar) {
        super(2, dVar);
        this.H = s0Var;
    }
}
