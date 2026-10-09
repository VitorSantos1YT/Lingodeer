package l1;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.google.firebase.database.DatabaseReference;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mt.r6;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import rt.k6;
import rt.o8;
import rt.ue;
import rt.w4;
import rt.x8;
import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39525c;

    public /* synthetic */ z1(int i11, Object obj, Object obj2) {
        this.f39523a = i11;
        this.f39524b = obj;
        this.f39525c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x03d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x03d6 A[LOOP:3: B:128:0x03a1->B:138:0x03d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Iterable, java.lang.Object] */
    @Override // fz.a
    public final Object invoke() {
        ArrayList arrayListG0;
        long jA;
        Http2Stream[] http2StreamArr;
        switch (this.f39523a) {
            case 0:
                y.j0 j0Var = (y.j0) this.f39524b;
                z zVar = (z) this.f39525c;
                Object[] objArr = j0Var.f56721b;
                long[] jArr = j0Var.f56720a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr[i11];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j11) < 128) {
                                    zVar.z(objArr[(i11 << 3) + i13]);
                                }
                                j11 >>= 8;
                            }
                            if (i12 == 8) {
                                if (i11 != length) {
                                    i11++;
                                }
                            }
                        } else if (i11 != length) {
                            i11++;
                        }
                    }
                }
                return qy.b0.f48488a;
            case 1:
                SwitchLanguageActivity switchLanguageActivity = (SwitchLanguageActivity) this.f39524b;
                b1 b1Var = (b1) this.f39525c;
                int i14 = SwitchLanguageActivity.M;
                b1Var.setValue(Boolean.FALSE);
                switchLanguageActivity.finish();
                return qy.b0.f48488a;
            case 2:
                ((fz.c) this.f39524b).invoke(this.f39525c);
                return qy.b0.f48488a;
            case 3:
                g0 g0Var = (g0) this.f39524b;
                m0.x xVar = (m0.x) this.f39525c;
                m0.j jVar = (m0.j) g0Var.getValue();
                return new m0.k(xVar, jVar, new ij.d((lz.g) xVar.f40653d.f39185f.getValue(), jVar));
            case 4:
                fz.e eVar = (fz.e) this.f39524b;
                CourseACK courseACK = (CourseACK) this.f39525c;
                eVar.invoke(courseACK.getBookmarkId(), Boolean.valueOf(!courseACK.isFav()));
                return qy.b0.f48488a;
            case 5:
                fz.c cVar = (fz.c) this.f39524b;
                rt.x0 x0Var = (rt.x0) this.f39525c;
                cVar.invoke(ry.m.H0(ry.m.H0(ns.o.S(x0Var.f50610l), ns.o.S(x0Var.m)), ns.o.S(x0Var.f50611n)));
                return qy.b0.f48488a;
            case 6:
                x8 x8Var = (x8) this.f39524b;
                b1 b1Var2 = (b1) this.f39525c;
                if (((List) b1Var2.getValue()).contains(x8Var)) {
                    List list = (List) b1Var2.getValue();
                    arrayListG0 = new ArrayList();
                    for (Object obj : list) {
                        if (((x8) obj) != x8Var) {
                            arrayListG0.add(obj);
                        }
                    }
                } else {
                    arrayListG0 = ry.m.G0(x8Var, (List) b1Var2.getValue());
                }
                b1Var2.setValue(arrayListG0);
                return qy.b0.f48488a;
            case 7:
                r6 r6Var = (r6) this.f39524b;
                fz.c cVar2 = (fz.c) this.f39525c;
                if (r6Var != null) {
                    cVar2.invoke(r6Var);
                }
                return qy.b0.f48488a;
            case 8:
                ((fz.c) this.f39524b).invoke(Long.valueOf(((ue) this.f39525c).f50510a));
                return qy.b0.f48488a;
            case 9:
                ((fz.c) this.f39524b).invoke(((Map.Entry) this.f39525c).getKey());
                return qy.b0.f48488a;
            case 10:
                ((fz.c) this.f39524b).invoke((w4) this.f39525c);
                return qy.b0.f48488a;
            case 11:
                ((fz.c) this.f39524b).invoke((y8) this.f39525c);
                return qy.b0.f48488a;
            case 12:
                ((fz.c) this.f39524b).invoke(((k6) this.f39525c).f49973d);
                return qy.b0.f48488a;
            case 13:
                ((fz.e) this.f39524b).invoke(((k6) this.f39525c).f49973d, BuildConfig.VERSION_NAME);
                return qy.b0.f48488a;
            case 14:
                fz.e eVar2 = (fz.e) this.f39524b;
                o8 o8Var = (o8) this.f39525c;
                List list2 = o8Var.f50198a;
                ArrayList arrayList = new ArrayList(ry.n.W(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((k6) it.next()).f49972c);
                }
                eVar2.invoke(arrayList, o8Var.f50204g);
                return qy.b0.f48488a;
            case 15:
                return new n0.x0((w1.e) this.f39524b, ry.s.f50855a, (w1.b) this.f39525c);
            case 16:
                ph.k kVar = (ph.k) this.f39524b;
                rz.e0.B(ViewModelKt.getViewModelScope(kVar), null, null, new a0.w1(8, ((mh.i) this.f39525c).f41135a, kVar, (vy.d) null), 3);
                return qy.b0.f48488a;
            case 17:
                ((fz.c) this.f39524b).invoke((mh.b) this.f39525c);
                return qy.b0.f48488a;
            case 18:
                String str = (String) this.f39524b;
                ni.m mVar = (ni.m) this.f39525c;
                Bundle bundleE = b7.e0.e("type", str);
                if (mVar.T.length() > 0) {
                    bundleE.putString("source", mVar.T);
                }
                return bundleE;
            case 19:
                ((DatabaseReference) this.f39524b).d((lp.j) this.f39525c);
                return qy.b0.f48488a;
            case 20:
                ((fz.c) this.f39524b).invoke(new sv.e((KOSyllableLesson) ry.m.z0(((sv.h) this.f39525c).f51806b), true));
                return qy.b0.f48488a;
            case 21:
                g0 g0Var2 = (g0) this.f39524b;
                o0.t tVar = (o0.t) this.f39525c;
                o0.k kVar2 = (o0.k) g0Var2.getValue();
                return new o0.l(tVar, kVar2, new ij.d((lz.g) ((n0.g0) tVar.f44435d.f7513f).getValue(), kVar2));
            case 22:
                Http2Connection http2Connection = (Http2Connection) this.f39524b;
                Http2Stream http2Stream = (Http2Stream) this.f39525c;
                try {
                    http2Connection.f45423a.c(http2Stream);
                    break;
                } catch (IOException e8) {
                    Platform.f45527a.getClass();
                    Platform.f45528b.j("Http2Connection.Listener failure for " + http2Connection.f45427c, 4, e8);
                    try {
                        http2Stream.c(ErrorCode.PROTOCOL_ERROR, e8);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return qy.b0.f48488a;
            case 23:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.f39524b;
                Settings settings = (Settings) this.f39525c;
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.Z) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.U;
                            Settings settings3 = new Settings();
                            settings3.b(settings2);
                            settings3.b(settings);
                            yVar.f38361a = settings3;
                            jA = ((long) settings3.a()) - ((long) settings2.a());
                            http2StreamArr = (jA == 0 || http2Connection2.f45425b.isEmpty()) ? null : (Http2Stream[]) http2Connection2.f45425b.values().toArray(new Http2Stream[0]);
                            Settings settings4 = (Settings) yVar.f38361a;
                            kotlin.jvm.internal.m.f(settings4, "<set-?>");
                            http2Connection2.U = settings4;
                            TaskQueue.b(http2Connection2.L, http2Connection2.f45427c + " onSettings", new z1(24, http2Connection2, yVar), 6);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        http2Connection2.Z.a((Settings) yVar.f38361a);
                    } catch (IOException e10) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection2.a(errorCode, errorCode, e10);
                    }
                    break;
                }
                if (http2StreamArr != null) {
                    for (Http2Stream http2Stream2 : http2StreamArr) {
                        synchronized (http2Stream2) {
                            http2Stream2.f45468e += jA;
                            if (jA > 0) {
                                http2Stream2.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Http2Connection http2Connection3 = (Http2Connection) this.f39524b;
                http2Connection3.f45423a.b(http2Connection3, (Settings) ((kotlin.jvm.internal.y) this.f39525c).f38361a);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                fv.c cVar3 = (fv.c) this.f39524b;
                ot.o2 o2Var = (ot.o2) this.f39525c;
                cVar3.b();
                o2Var.f45938e.remove(cVar3);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((oz.o) this.f39524b).b((CharSequence) this.f39525c);
            case 27:
                ((fz.c) this.f39524b).invoke((ArrayList) this.f39525c);
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                CourseLesson courseLesson = (CourseLesson) this.f39524b;
                String str2 = (String) this.f39525c;
                Bundle bundle = new Bundle();
                bundle.putString("unit", "U" + courseLesson.getUnitSortIndex());
                b7.e0.v(courseLesson.getSortIndex(), bundle, "L", "lesson");
                bundle.putString("mode", str2);
                return bundle;
            default:
                ((fz.c) this.f39524b).invoke(((qv.g) ((qv.h) this.f39525c)).f48438c);
                return qy.b0.f48488a;
        }
    }
}
