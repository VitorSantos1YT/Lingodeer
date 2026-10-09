package sr;

import android.os.Bundle;
import android.webkit.WebView;
import com.google.api.Service;
import com.lingo.lingoskill.ui.review.ReviewTestActivity;
import com.lingodeer.data.model.ChineseToneLastVisited;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.LastSyncTime;
import com.lingodeer.data.model.SubLearnProgress;
import java.util.ArrayList;
import java.util.List;
import l1.b1;
import rz.b0;
import sv.j;
import tp.i0;
import tu.m0;
import tu.r;
import ui.h0;
import vt.d1;
import vt.f0;
import vt.s0;
import vt.z0;
import vz.t;
import w9.g0;
import w9.s;
import wt.o0;
import wu.k0;
import wu.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f51757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f51758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f51755a = i11;
        this.f51757c = obj;
        this.f51758d = obj2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f51755a) {
            case 0:
                return new d(0, (e) this.f51757c, (CoursePracticeType) this.f51758d, dVar);
            case 1:
                return new d(1, (j) this.f51757c, (sv.f) this.f51758d, dVar);
            case 2:
                return new d((i0) this.f51758d, dVar, 2);
            case 3:
                return new d(3, (ReviewTestActivity) this.f51757c, (Bundle) this.f51758d, dVar);
            case 4:
                return new d((m0) this.f51758d, dVar, 4);
            case 5:
                return new d(5, (r) this.f51757c, (m0) this.f51758d, dVar);
            case 6:
                return new d(6, (List) this.f51757c, (b1) this.f51758d, dVar);
            case 7:
                return new d((h0) this.f51758d, dVar, 7);
            case 8:
                d dVar2 = new d((uz.i) this.f51758d, dVar, 8);
                dVar2.f51757c = obj;
                return dVar2;
            case 9:
                d dVar3 = new d((t) this.f51758d, dVar, 9);
                dVar3.f51757c = obj;
                return dVar3;
            case 10:
                return new d(10, (vb.i) this.f51757c, (gc.i) this.f51758d, dVar);
            case 11:
                return new d(11, (vt.r) this.f51757c, (List) this.f51758d, dVar);
            case 12:
                return new d(12, (f0) this.f51757c, (ChineseToneLastVisited) this.f51758d, dVar);
            case 13:
                return new d(13, (s0) this.f51757c, (LastSyncTime) this.f51758d, dVar);
            case 14:
                return new d(14, (z0) this.f51757c, (List) this.f51758d, dVar);
            case 15:
                return new d(15, (d1) this.f51757c, (SubLearnProgress) this.f51758d, dVar);
            case 16:
                return new d(16, (d1) this.f51757c, (ArrayList) this.f51758d, dVar);
            case 17:
                d dVar4 = new d((vz.d) this.f51758d, dVar, 17);
                dVar4.f51757c = obj;
                return dVar4;
            case 18:
                d dVar5 = new d((vz.e) this.f51758d, dVar, 18);
                dVar5.f51757c = obj;
                return dVar5;
            case 19:
                return new d(19, (uz.i) this.f51757c, (vz.r) this.f51758d, dVar);
            case 20:
                d dVar6 = new d((uz.j) this.f51758d, dVar, 20);
                dVar6.f51757c = obj;
                return dVar6;
            case 21:
                return new d(21, (s) this.f51757c, (String[]) this.f51758d, dVar);
            case 22:
                return new d(22, (g0) this.f51757c, (fz.a) this.f51758d, dVar);
            case 23:
                d dVar7 = new d((wb.i) this.f51758d, dVar, 23);
                dVar7.f51757c = obj;
                return dVar7;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new d(24, (wg.r) this.f51757c, (WebView) this.f51758d, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new d(25, (wl.a) this.f51757c, (String) this.f51758d, dVar);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                d dVar8 = new d((o0) this.f51758d, dVar, 26);
                dVar8.f51757c = obj;
                return dVar8;
            case 27:
                return new d(27, (wu.j) this.f51757c, (wu.e) this.f51758d, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                d dVar9 = new d((v) this.f51758d, dVar, 28);
                dVar9.f51757c = obj;
                return dVar9;
            default:
                d dVar10 = new d((k0) this.f51758d, dVar, 29);
                dVar10.f51757c = obj;
                return dVar10;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f51755a) {
            case 0:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((d) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((d) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((d) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((d) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((d) create(obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((d) create((gc.i) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((d) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((d) create((String) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((d) create((String) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:326:0x0617  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:325:0x0615 -> B:328:0x0619). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:315:0x05e3
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f51755a = i11;
        this.f51758d = obj;
    }
}
