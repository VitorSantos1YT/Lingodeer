package cj;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import com.lingodeer.data.model.LearnProgress;
import hh.c0;
import java.util.List;
import kotlin.jvm.internal.x;
import ot.e0;
import ot.f2;
import uz.j;
import vt.z0;
import wt.b0;
import wt.m;
import xy.i;
import zr.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7170f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f7171t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, List list, z0 z0Var, List list2, vy.d dVar) {
        super(2, dVar);
        this.f7165a = 9;
        this.f7167c = i11;
        this.f7171t = list;
        this.f7169e = z0Var;
        this.f7170f = list2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f7165a) {
            case 0:
                return new b((List) this.f7171t, (ScDetailAdapter) this.f7169e, dVar, 0);
            case 1:
                b bVar = new b((DayStreakWidgetReceiver) this.f7169e, (Context) this.f7170f, this.f7167c, (Bundle) this.f7171t, dVar, 1);
                bVar.f7168d = obj;
                return bVar;
            case 2:
                b bVar2 = new b((DayStreakWidgetReceiver) this.f7169e, (Context) this.f7170f, this.f7167c, (String) this.f7171t, dVar, 2);
                bVar2.f7168d = obj;
                return bVar2;
            case 3:
                return new b((x) this.f7168d, (c0) this.f7169e, (View) this.f7170f, (PdWord) this.f7171t, this.f7167c, dVar);
            case 4:
                b bVar3 = new b((e0) this.f7169e, this.f7167c, (List) this.f7171t, (LearnProgress) this.f7170f, dVar);
                bVar3.f7168d = obj;
                return bVar3;
            case 5:
                return new b((po.a) this.f7169e, (String) this.f7170f, (f2) this.f7171t, dVar);
            case 6:
                return new b((qv.e) this.f7171t, dVar, 6);
            case 7:
                return new b((rm.d) this.f7171t, dVar, 7);
            case 8:
                return new b((List) this.f7171t, (z0) this.f7169e, dVar, 8);
            case 9:
                b bVar4 = new b(this.f7167c, (List) this.f7171t, (z0) this.f7169e, (List) this.f7170f, dVar);
                bVar4.f7168d = obj;
                return bVar4;
            case 10:
                b bVar5 = new b(this.f7167c, dVar, (m) this.f7170f, (b0) this.f7171t);
                bVar5.f7169e = obj;
                return bVar5;
            case 11:
                b bVar6 = new b((Context) this.f7170f, (String) this.f7171t, dVar);
                bVar6.f7169e = obj;
                return bVar6;
            default:
                b bVar7 = new b((n) this.f7170f, dVar);
                bVar7.f7169e = obj;
                return bVar7;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7165a) {
            case 0:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((b) create((j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((b) create((j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, vy.d dVar, m mVar, b0 b0Var) {
        super(2, dVar);
        this.f7165a = 10;
        this.f7170f = mVar;
        this.f7171t = b0Var;
        this.f7167c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x066a A[PHI: r3 r5 r6
      0x066a: PHI (r3v40 int) = (r3v39 int), (r3v41 int) binds: [B:219:0x0662, B:224:0x0693] A[DONT_GENERATE, DONT_INLINE]
      0x066a: PHI (r5v20 qv.e) = (r5v19 qv.e), (r5v21 qv.e) binds: [B:219:0x0662, B:224:0x0693] A[DONT_GENERATE, DONT_INLINE]
      0x066a: PHI (r6v20 uz.i1) = (r6v19 uz.i1), (r6v21 uz.i1) binds: [B:219:0x0662, B:224:0x0693] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:225:0x0695  */
    /* JADX WARN: Code duplicated, block: B:299:0x08da  */
    /* JADX WARN: Code duplicated, block: B:334:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:336:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:341:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:442:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x060e -> B:207:0x0611). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x068a -> B:223:0x068d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x06b8 -> B:229:0x06bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 3186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, vy.d dVar) {
        super(2, dVar);
        this.f7165a = 11;
        this.f7170f = context;
        this.f7171t = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ViewModel viewModel, vy.d dVar, int i11) {
        super(2, dVar);
        this.f7165a = i11;
        this.f7171t = viewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DayStreakWidgetReceiver dayStreakWidgetReceiver, Context context, int i11, Object obj, vy.d dVar, int i12) {
        super(2, dVar);
        this.f7165a = i12;
        this.f7169e = dayStreakWidgetReceiver;
        this.f7170f = context;
        this.f7167c = i11;
        this.f7171t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(List list, Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f7165a = i11;
        this.f7171t = list;
        this.f7169e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, c0 c0Var, View view, PdWord pdWord, int i11, vy.d dVar) {
        super(2, dVar);
        this.f7165a = 3;
        this.f7168d = xVar;
        this.f7169e = c0Var;
        this.f7170f = view;
        this.f7171t = pdWord;
        this.f7167c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e0 e0Var, int i11, List list, LearnProgress learnProgress, vy.d dVar) {
        super(2, dVar);
        this.f7165a = 4;
        this.f7169e = e0Var;
        this.f7167c = i11;
        this.f7171t = list;
        this.f7170f = learnProgress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(po.a aVar, String str, f2 f2Var, vy.d dVar) {
        super(2, dVar);
        this.f7165a = 5;
        this.f7169e = aVar;
        this.f7170f = str;
        this.f7171t = f2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, vy.d dVar) {
        super(2, dVar);
        this.f7165a = 12;
        this.f7170f = nVar;
    }
}
