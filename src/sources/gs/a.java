package gs;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bp.a0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import g2.v0;
import h1.k7;
import h1.p7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.u;
import j0.z1;
import j3.p0;
import js.x;
import js.y;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.c3;
import l1.q1;
import l1.t;
import l1.x1;
import qy.b0;
import rt.cb;
import rt.db;
import rt.eb;
import rt.fb;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f29763a = new t1.d(new dt.f(21), false, -537595605);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f29764b = new t1.d(new dt.f(22), false, -1500191377);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f29765c = new t1.d(new dt.f(23), false, -664037443);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f29766d = new t1.d(new dt.f(24), false, 174355375);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f29767e = new t1.d(new dt.f(25), false, -897337283);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-538550276);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                bs.f fVar = new bs.f(bs.h.FIRST_TONE, R.string.chinese_tone_lesson_1st_tone, R.string.chinese_tone_first_tone_subtitle, R.string.chinese_tone_first_tone_desc, ns.o.L(new bs.e("ā", 0, "a", 1, defpackage.e.m(xt.b.a().b(), fv.f.f(1, "a"))), new bs.e("ō", 0, "o", 1, defpackage.e.m(xt.b.a().b(), fv.f.f(1, "o"))), new bs.e("ē", 0, "e", 1, defpackage.e.m(xt.b.a().b(), fv.f.f(1, "e"))), new bs.e("ī", 0, "i", 1, defpackage.e.m(xt.b.a().b(), fv.f.f(1, "i"))), new bs.e("ū", 0, "u", 1, defpackage.e.m(xt.b.a().b(), fv.f.f(1, "u"))), new bs.e("ǖ", 0, "ü", 1, defpackage.e.m(xt.b.a().b(), fv.f.f(1, "ü")))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new x(yVar3, fVar, dVar, 0), 3);
                sVar.o0(fVar);
                objQ = fVar;
            }
            bs.f fVar2 = (bs.f) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(2047018974);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 0);
                    sVar.o0(objQ2);
                }
                b(fVar2, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(2144256783);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, 2144240141, false);
                }
                sVar.d0(2144259851);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 0);
        }
    }

    public static final void b(bs.f toneData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(toneData, "toneData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1534527253);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(toneData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(toneData.f5127b, onBackClick, t1.e.d(2004405408, new d(0, toneData, onPracticeClick, onPlayAudioFile, str), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(toneData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-767694842);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                bs.f fVar = new bs.f(bs.h.FOURTH_TONE, R.string.chinese_tone_lesson_4th_tone, R.string.chinese_tone_fourth_tone_subtitle, R.string.chinese_tone_fourth_tone_desc, ns.o.L(new bs.e("à", 0, "a", 4, defpackage.e.m(xt.b.a().b(), fv.f.f(4, "a"))), new bs.e("ò", 0, "o", 4, defpackage.e.m(xt.b.a().b(), fv.f.f(4, "o"))), new bs.e("è", 0, "e", 4, defpackage.e.m(xt.b.a().b(), fv.f.f(4, "e"))), new bs.e("ì", 0, "i", 4, defpackage.e.m(xt.b.a().b(), fv.f.f(4, "i"))), new bs.e("ù", 0, "u", 4, defpackage.e.m(xt.b.a().b(), fv.f.f(4, "u"))), new bs.e("ǜ", 0, "ü", 4, defpackage.e.m(xt.b.a().b(), fv.f.f(4, "ü")))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new x(yVar3, fVar, dVar, 1), 3);
                sVar.o0(fVar);
                objQ = fVar;
            }
            bs.f fVar2 = (bs.f) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(304261843);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 1);
                    sVar.o0(objQ2);
                }
                d(fVar2, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(979660185);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, 979643512, false);
                }
                sVar.d0(979663253);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 1);
        }
    }

    public static final void d(bs.f toneData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(toneData, "toneData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1240017113);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(toneData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(toneData.f5127b, onBackClick, t1.e.d(1821357988, new d(1, toneData, onPracticeClick, onPlayAudioFile, str), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(toneData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 1);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void e(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1382982500);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                bs.f fVar = new bs.f(bs.h.NEUTRAL_TONE, R.string.chinese_tone_neutral_tone_title, R.string.chinese_tone_neutral_tone_subtitle, 0, ns.o.L(new bs.e("a", 0, "a", 0, defpackage.e.m(xt.b.a().b(), fv.f.f(0, "a"))), new bs.e("o", 0, "o", 0, defpackage.e.m(xt.b.a().b(), fv.f.f(0, "o"))), new bs.e("e", 0, "e", 0, defpackage.e.m(xt.b.a().b(), fv.f.f(0, "e"))), new bs.e("i", 0, "i", 0, defpackage.e.m(xt.b.a().b(), fv.f.f(0, "i"))), new bs.e("u", 0, "u", 0, defpackage.e.m(xt.b.a().b(), fv.f.f(0, "u"))), new bs.e("ü", 0, "ü", 0, defpackage.e.m(xt.b.a().b(), fv.f.f(0, "ü")))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new x(yVar3, fVar, dVar, 2), 3);
                sVar.o0(fVar);
                objQ = fVar;
            }
            bs.f fVar2 = (bs.f) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(1190063739);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 2);
                    sVar.o0(objQ2);
                }
                f(fVar2, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(-1901259473);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, -1901276208, false);
                }
                sVar.d0(-1901256405);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 2);
        }
    }

    public static final void f(bs.f toneData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(toneData, "toneData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-138631001);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(toneData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(toneData.f5127b, onBackClick, t1.e.d(184201394, new d(2, toneData, onPracticeClick, onPlayAudioFile, str), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(toneData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 2);
        }
    }

    public static final void g(int i11, fz.a onClick, String text, l1.n nVar, z1.r rVar) {
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1907805022);
        int i12 = (sVar.f(text) ? 4 : 2) | i11 | (sVar.h(onClick) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            iu.k.e(onClick, j0.c.C(e2.e(rVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), false, 0L, null, t1.e.d(2070235891, new a0(text, 7), sVar), sVar, ((i12 >> 3) & 14) | 196608, 28);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(text, onClick, rVar, i11, 0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void h(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1810258);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                bs.f fVar = new bs.f(bs.h.SECOND_TONE, R.string.chinese_tone_lesson_2nd_tone, R.string.chinese_tone_second_tone_subtitle, R.string.chinese_tone_second_tone_desc, ns.o.L(new bs.e("á", 0, "a", 2, defpackage.e.m(xt.b.a().b(), fv.f.f(2, "a"))), new bs.e("ó", 0, "o", 2, defpackage.e.m(xt.b.a().b(), fv.f.f(2, "o"))), new bs.e("é", 0, "e", 2, defpackage.e.m(xt.b.a().b(), fv.f.f(2, "e"))), new bs.e("í", 0, "i", 2, defpackage.e.m(xt.b.a().b(), fv.f.f(2, "i"))), new bs.e("ú", 0, "u", 2, defpackage.e.m(xt.b.a().b(), fv.f.f(2, "u"))), new bs.e("ǘ", 0, "ü", 2, defpackage.e.m(xt.b.a().b(), fv.f.f(2, "ü")))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new x(yVar3, fVar, dVar, 3), 3);
                sVar.o0(fVar);
                objQ = fVar;
            }
            bs.f fVar2 = (bs.f) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(-1904730074);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 3);
                    sVar.o0(objQ2);
                }
                i(fVar2, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(1739686405);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, 1739669701, false);
                }
                sVar.d0(1739689473);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 3);
        }
    }

    public static final void i(bs.f toneData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(toneData, "toneData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1380403431);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(toneData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(toneData.f5127b, onBackClick, t1.e.d(-799062556, new d(3, toneData, onPracticeClick, onPlayAudioFile, str), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(toneData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 3);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void j(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2063237020);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                bs.f fVar = new bs.f(bs.h.THIRD_TONE, R.string.chinese_tone_lesson_3rd_tone, R.string.chinese_tone_third_tone_subtitle, R.string.chinese_tone_third_tone_desc, ns.o.L(new bs.e("ǎ", 0, "a", 3, defpackage.e.m(xt.b.a().b(), fv.f.f(3, "a"))), new bs.e("ǒ", 0, "o", 3, defpackage.e.m(xt.b.a().b(), fv.f.f(3, "o"))), new bs.e("ě", 0, "e", 3, defpackage.e.m(xt.b.a().b(), fv.f.f(3, "e"))), new bs.e("ǐ", 0, "i", 3, defpackage.e.m(xt.b.a().b(), fv.f.f(3, "i"))), new bs.e("ǔ", 0, "u", 3, defpackage.e.m(xt.b.a().b(), fv.f.f(3, "u"))), new bs.e("ǚ", 0, "ü", 3, defpackage.e.m(xt.b.a().b(), fv.f.f(3, "ü")))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new x(yVar3, fVar, dVar, 4), 3);
                sVar.o0(fVar);
                objQ = fVar;
            }
            bs.f fVar2 = (bs.f) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(617536445);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 4);
                    sVar.o0(objQ2);
                }
                k(fVar2, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(-1504086161);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, -1504102834, false);
                }
                sVar.d0(-1504083093);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 4);
        }
    }

    public static final void k(bs.f toneData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(toneData, "toneData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1174785575);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(toneData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(toneData.f5127b, onBackClick, t1.e.d(1644663730, new d(4, toneData, onPracticeClick, onPlayAudioFile, str), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(toneData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0160  */
    /* JADX WARN: Code duplicated, block: B:48:0x016c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void l(final int i11, int i12, final int i13, final int i14, l1.n nVar, z1.r rVar) {
        int i15;
        final int i16;
        boolean z11;
        l1.s sVar;
        final z1.r rVar2;
        x1 x1VarT;
        z1.o oVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        z1.o oVar2;
        boolean z12;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(516329993);
        if ((i13 & 6) == 0) {
            i15 = (sVar2.d(i11) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i15 | 48;
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                i16 = i12;
                i17 |= sVar2.d(i16) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i17 & 1, z11)) {
                if (i18 != 0) {
                    i16 = 0;
                }
                oVar = z1.o.f58481a;
                z1.r rVarE = e2.e(oVar, 1.0f);
                u uVarA = j0.t.a(j0.i.g(8), z1.c.O, sVar2, 6);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarE);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(y2.j.f56917f, uVarA, sVar2);
                t.J(y2.j.f56916e, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                t.J(y2.j.f56915d, rVarC, sVar2);
                if (i11 != 0) {
                    sVar2.d0(-1658266732);
                    z12 = false;
                    oVar2 = oVar;
                    ua.c(y(ub.a.e0(sVar2, i11), sVar2), e2.e(oVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, sVar2, 48, 0, 262140);
                    sVar = sVar2;
                } else {
                    oVar2 = oVar;
                    sVar = sVar2;
                    z12 = false;
                    sVar.d0(-1666766653);
                }
                sVar.p(z12);
                if (i16 != 0) {
                    sVar.d0(-1658056676);
                    l1.s sVar3 = sVar;
                    ua.c(y(ub.a.e0(sVar, i16), sVar), e2.e(oVar2, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, sVar3, 48, 0, 262140);
                    sVar = sVar3;
                } else {
                    sVar.d0(-1666766653);
                }
                sVar.p(z12);
                sVar.p(true);
                rVar2 = oVar2;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar2 = rVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: gs.p
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = t.M(i13 | 1);
                        a.l(i11, i16, iM, i14, (l1.n) obj, rVar2);
                        return b0.f48488a;
                    }
                };
            }
        }
        i17 = i15 | 432;
        i16 = i12;
        if ((i17 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i17 & 1, z11)) {
            if (i18 != 0) {
                i16 = 0;
            }
            oVar = z1.o.f58481a;
            z1.r rVarE2 = e2.e(oVar, 1.0f);
            u uVarA2 = j0.t.a(j0.i.g(8), z1.c.O, sVar2, 6);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarE2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, uVarA2, sVar2);
            t.J(y2.j.f56916e, q1VarL2, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC2, sVar2);
            if (i11 != 0) {
                sVar2.d0(-1658266732);
                z12 = false;
                oVar2 = oVar;
                ua.c(y(ub.a.e0(sVar2, i11), sVar2), e2.e(oVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, sVar2, 48, 0, 262140);
                sVar = sVar2;
            } else {
                oVar2 = oVar;
                sVar = sVar2;
                z12 = false;
                sVar.d0(-1666766653);
            }
            sVar.p(z12);
            if (i16 != 0) {
                sVar.d0(-1658056676);
                l1.s sVar4 = sVar;
                ua.c(y(ub.a.e0(sVar, i16), sVar), e2.e(oVar2, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, sVar4, 48, 0, 262140);
                sVar = sVar4;
            } else {
                sVar.d0(-1666766653);
            }
            sVar.p(z12);
            sVar.p(true);
            rVar2 = oVar2;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: gs.p
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = t.M(i13 | 1);
                    a.l(i11, i16, iM, i14, (l1.n) obj, rVar2);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void m(bs.c cVar, boolean z11, fz.a onPlayClick, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onPlayClick, "onPlayClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-693958649);
        int i12 = i11 | (sVar.f(cVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onPlayClick) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            a2 a2VarA = z1.a(j0.i.g(8), z1.c.L, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, a2VarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            float f5 = 72;
            z1.r rVarG = e2.g(new i1(1.0f, true), f5);
            float f11 = 1;
            c3 c3Var = v1.f31180a;
            k7.d(rVarG, r0.f.d(9), null, null, d0.n.a(((s1) sVar.j(c3Var)).A, f11), t1.e.d(-1987129379, new a00.b(cVar, 14), sVar), sVar, 196608, 12);
            boolean z12 = (i12 & 896) == 256;
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new et.p(12, onPlayClick);
                sVar.o0(objQ);
            }
            iu.k.l((fz.a) objQ, j0.c.y(e2.n(oVar, f5), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1), false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(((s1) sVar.j(c3Var)).A, f11), t1.e.d(-603714771, new m(z11, cVar, 1), sVar), sVar, 805306416, 252);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.b0(cVar, z11, onPlayClick, i11, 6);
        }
    }

    public static final void n(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1297652498);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                objQ = new bs.a(ns.o.L(new bs.c(215L, "yǔ + sǎn", "[yú] sǎn", BuildConfig.VERSION_NAME, 0, defpackage.e.m(xt.b.a().b(), v10.c.m(215L))), new bs.c(276L, "nǐ + hǎo", "[ní] hǎo", BuildConfig.VERSION_NAME, 0, defpackage.e.m(xt.b.a().b(), v10.c.m(276L))), new bs.c(217L, "shuǐ + guǒ", "[shuí] guǒ", BuildConfig.VERSION_NAME, 0, defpackage.e.m(xt.b.a().b(), v10.c.m(217L)))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new gu.b(25, yVar3, objQ, dVar), 3);
                sVar.o0(objQ);
            }
            bs.a aVar = (bs.a) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(-634594315);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 5);
                    sVar.o0(objQ2);
                }
                o(aVar, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(1503564389);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, 1503547158, false);
                }
                sVar.d0(1503567457);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 5);
        }
    }

    public static final void o(bs.a thirdToneData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(thirdToneData, "thirdToneData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(131679360);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(thirdToneData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(R.string.chinese_tone_3rd_tone_change_title, onBackClick, t1.e.d(-1861303019, new br.j(thirdToneData, str, onPlayAudioFile, onPracticeClick, 2), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(thirdToneData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 2);
        }
    }

    public static final void p(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1574642492);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                objQ = new bs.b(ns.o.L(new bs.c(3331L, "bù + duì", "[bú] duì", "不对", R.string.chinese_tone_not_correct, defpackage.e.m(xt.b.a().b(), v10.c.m(3331L))), new bs.c(3332L, "bù + hui", "[bú] huì", "不会", R.string.chinese_tone_cant, defpackage.e.m(xt.b.a().b(), v10.c.m(3332L))), new bs.c(3349L, "bù + cuò", "[bú] cuò", "不错", R.string.chinese_tone_not_bad, defpackage.e.m(xt.b.a().b(), v10.c.m(3349L)))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new gu.b(26, yVar3, objQ, dVar), 3);
                sVar.o0(objQ);
            }
            bs.b bVar = (bs.b) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(542123870);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 6);
                    sVar.o0(objQ2);
                }
                q(bVar, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(1402975119);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, 1402958477, false);
                }
                sVar.d0(1402978187);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 6);
        }
    }

    public static final void q(bs.b buData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(buData, "buData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(470350682);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(buData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(R.string.chinese_tone_bu_title, onBackClick, t1.e.d(793183077, new br.j(buData, str, onPlayAudioFile, onPracticeClick, 3), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(buData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 3);
        }
    }

    public static final void r(fz.a onBackClick, fz.a onPracticeClick, y yVar, l1.n nVar, int i11) {
        y yVar2;
        int i12;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-741647204);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                objQ = new bs.d(ns.o.L(new bs.c(3321L, "yī + qiè", "[yí] qiè", "一切", R.string.chinese_tone_everything, defpackage.e.m(xt.b.a().b(), v10.c.m(3321L))), new bs.c(3322L, "yī + bàn", "[yí] bàn", "一半", R.string.chinese_tone_half, defpackage.e.m(xt.b.a().b(), v10.c.m(3322L)))), ns.o.L(new bs.c(3323L, "yī + tiān", "[yì] tiān", "一天", R.string.chinese_tone_one_day, defpackage.e.m(xt.b.a().b(), v10.c.m(3323L))), new bs.c(3324L, "yī + nián", "[yì] nián", "一年", R.string.chinese_tone_one_year, defpackage.e.m(xt.b.a().b(), v10.c.m(3324L))), new bs.c(3325L, "yī + diǎn", "[yì] diǎn", "一点", R.string.chinese_tone_a_little, defpackage.e.m(xt.b.a().b(), v10.c.m(3325L)))), ns.o.L(new bs.c(3320L, "shí [yī]", BuildConfig.VERSION_NAME, "十一", R.string.chinese_tone_eleven, defpackage.e.m(xt.b.a().b(), v10.c.m(3320L))), new bs.c(3319L, "dì [yī]", BuildConfig.VERSION_NAME, "第一", R.string.chinese_tone_first, defpackage.e.m(xt.b.a().b(), v10.c.m(3319L)))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new gu.b(27, yVar3, objQ, dVar), 3);
                sVar.o0(objQ);
            }
            bs.d dVar2 = (bs.d) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(-1099630704);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 7);
                    sVar.o0(objQ2);
                }
                s(dVar2, str, onBackClick, onPracticeClick, (fz.c) objQ2, sVar, (i12 << 6) & 8064);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(241638063);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, 241619995, false);
                }
                sVar.d0(241641131);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(onBackClick, onPracticeClick, yVar2, i11, 7);
        }
    }

    public static final void s(bs.d yiData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(yiData, "yiData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1600168477);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(yiData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            u(R.string.chinese_tone_yi_title, onBackClick, t1.e.d(1923000872, new br.j(yiData, str, onPlayAudioFile, onPracticeClick, 4), sVar), sVar, ((i13 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(yiData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, 4);
        }
    }

    public static final void t(bs.e eVar, boolean z11, fz.a onPlayClick, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onPlayClick, "onPlayClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-686961194);
        int i12 = i11 | (sVar2.f(eVar) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(onPlayClick) ? 256 : 128) | (sVar2.f(rVar) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = i12 >> 6;
            sVar = sVar2;
            iu.k.l(onPlayClick, rVar, false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(((s1) sVar2.j(v1.f31180a)).A, 1), t1.e.d(2105304276, new m(eVar, z11, 0), sVar2), sVar, (i13 & 14) | 805306368 | (i13 & 112), 252);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(eVar, z11, onPlayClick, rVar, i11, 6);
        }
    }

    public static final void u(int i11, fz.a onBackClick, t1.d dVar, l1.n nVar, int i12) {
        int i13;
        l1.s sVar;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-498185956);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(onBackClick) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar2.h(dVar) ? 256 : 128;
        }
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            sVar = sVar2;
            p7.a(null, t1.e.d(977769688, new fu.m(onBackClick, i11, 5, (byte) 0), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(-54344339, new br.l(dVar, 3), sVar2), sVar, 805306416, 509);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o(i11, onBackClick, dVar, i12, 0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void v(fz.a onBackClick, fz.a onPracticeClick, y yVar, int i11, l1.n nVar, int i12) {
        y yVar2;
        int i13;
        y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1344314153);
        int i14 = i12 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onPracticeClick) ? 32 : 16) | 128 | (sVar.d(i11) ? 2048 : 1024);
        if (sVar.T(i14 & 1, (i14 & 1171) != 1170)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i13 = i14 & (-897);
                yVar3 = (y) viewModelA;
            } else {
                sVar.W();
                i13 = i14 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                yVar3.getClass();
                bs.f fVar = new bs.f(bs.h.FIRST_TONE, R.string.chinese_tone_title_overview_title, 0, R.string.chinese_tone_desc_introduction, ns.o.L(new bs.e("ā", R.string.chinese_tone_1st_tone, "a", 1, defpackage.e.m(xt.b.a().b(), fv.f.f(1, "a"))), new bs.e("á", R.string.chinese_tone_2nd_tone, "a", 2, defpackage.e.m(xt.b.a().b(), fv.f.f(2, "a"))), new bs.e("ǎ", R.string.chinese_tone_3rd_tone, "a", 3, defpackage.e.m(xt.b.a().b(), fv.f.f(3, "a"))), new bs.e("à", R.string.chinese_tone_4th_tone, "a", 4, defpackage.e.m(xt.b.a().b(), fv.f.f(4, "a"))), new bs.e("a", R.string.chinese_tone_neutral_tone_label, "a", 0, defpackage.e.m(xt.b.a().b(), fv.f.f(0, "a")))));
                e0.B(ViewModelKt.getViewModelScope(yVar3), null, null, new x(yVar3, fVar, null, 5), 3);
                sVar.o0(fVar);
                objQ = fVar;
            }
            bs.f fVar2 = (bs.f) objQ;
            b1 b1VarO = t.o(yVar3.f36854f, sVar);
            fb fbVar = (fb) t.o(yVar3.f36852d, sVar).getValue();
            if (kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                sVar.d0(-2106537115);
                String str = ((bs.g) b1VarO.getValue()).f5132b;
                boolean zH = sVar.h(yVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new b(yVar3, 8);
                    sVar.o0(objQ2);
                }
                w(fVar2, str, onBackClick, onPracticeClick, (fz.c) objQ2, i11, sVar, (i13 << 6) & 466816);
                sVar.p(false);
            } else if (fbVar instanceof db) {
                sVar.d0(-899220516);
                tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                sVar.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    throw nv.p.x(sVar, -899239514, false);
                }
                sVar.d0(-899217448);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(onBackClick, onPracticeClick, yVar2, i11, i12);
        }
    }

    public static final void w(bs.f introData, String str, fz.a onBackClick, fz.a onPracticeClick, fz.c onPlayAudioFile, int i11, l1.n nVar, int i12) {
        int i13;
        int i14;
        kotlin.jvm.internal.m.f(introData, "introData");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(onPlayAudioFile, "onPlayAudioFile");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1964422340);
        if ((i12 & 6) == 0) {
            i13 = (sVar.h(introData) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(onPracticeClick) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(onPlayAudioFile) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i14 = i11;
            i13 |= sVar.d(i14) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        } else {
            i14 = i11;
        }
        int i15 = i13;
        if (sVar.T(i15 & 1, (74899 & i15) != 74898)) {
            sVar.Y();
            if ((i12 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            u(introData.f5127b, onBackClick, t1.e.d(-781786105, new fu.q(i14, introData, onPracticeClick, onPlayAudioFile, str), sVar), sVar, ((i15 >> 3) & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.n(introData, str, onBackClick, onPracticeClick, onPlayAudioFile, i11, i12, 2);
        }
    }

    public static final void x(int i11, int i12, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(611015997);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            k7.d(j0.c.j(e2.e(rVar, 1.0f), 1.4963504f), r0.f.d(20), k7.p(((s1) sVar.j(v1.f31180a)).f31026h, sVar, 0), null, null, t1.e.d(1663638411, new fu.b0(i11, 1), sVar), sVar, 196608, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.c3(i11, rVar, i12, 1);
        }
    }

    public static final j3.h y(String str, l1.n nVar) {
        String str2 = str;
        l1.s sVar = (l1.s) nVar;
        sVar.d0(743577632);
        long j11 = ((s1) sVar.j(v1.f31180a)).f31017a;
        boolean z11 = false;
        if (str2.length() == 0) {
            j3.h hVar = new j3.h(BuildConfig.VERSION_NAME);
            sVar.p(false);
            return hVar;
        }
        j3.e eVar = new j3.e();
        int i11 = 0;
        while (i11 < str2.length()) {
            char cCharAt = str2.charAt(i11);
            if (cCharAt == '[') {
                i11++;
                int iH0 = oz.q.H0(str2, ']', i11, 4);
                if (iH0 != -1) {
                    String strSubstring = str2.substring(i11, iH0);
                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                    int i12 = eVar.i(new p0(j11, 0L, n3.s.L, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65530));
                    try {
                        eVar.d(strSubstring);
                        eVar.f(i12);
                        i11 = iH0 + 1;
                    } catch (Throwable th2) {
                        eVar.f(i12);
                        throw th2;
                    }
                } else {
                    eVar.b(cCharAt);
                }
            } else {
                eVar.b(cCharAt);
                i11++;
            }
            str2 = str;
            z11 = false;
        }
        j3.h hVarJ = eVar.j();
        sVar.p(false);
        return hVarJ;
    }
}
