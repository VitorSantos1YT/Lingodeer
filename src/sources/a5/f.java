package a5;

import am.rVFB.LwKl;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.recyclerview.widget.m1;
import b0.d0;
import b0.t;
import b7.f0;
import cf.x;
import com.google.api.Service;
import com.lingo.course.ui.CourseFlashCardIndexActivity;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOSyllableIntroductionActivity;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hh.c0;
import hj.b4;
import hj.r5;
import hj.x3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jp.p0;
import jp.w0;
import kr.g1;
import kr.l1;
import l1.b1;
import n9.f2;
import n9.i2;
import ob.u;
import rz.e0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements t, tx.c, ki.a, o3.p, t7.j, av.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f378b;

    public /* synthetic */ f(int i11, boolean z11) {
        this.f377a = i11;
    }

    public static hd.d d() {
        return new hd.d(new BitSet(), 10);
    }

    public static f o(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11, z12), 0);
    }

    @Override // ki.a
    public void B() {
        Intent intent = new Intent();
        CourseFlashCardIndexActivity courseFlashCardIndexActivity = (CourseFlashCardIndexActivity) this.f378b;
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", courseFlashCardIndexActivity.getPackageName());
        courseFlashCardIndexActivity.startActivity(intent);
    }

    @Override // av.l
    public void a() {
        l1 l1Var = (l1) this.f378b;
        e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new g1(2, l1Var, null), 3);
    }

    @Override // tx.c
    public void accept(Object obj) {
        ArrayList arrayList;
        switch (this.f377a) {
            case 3:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication);
                com.bumptech.glide.c.c(lingoSkillApplication).b();
                String string = ((bp.l) this.f378b).getString(R.string.success);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                ff.h.C(string);
                return;
            case 10:
                ArrayList arrayList2 = (ArrayList) obj;
                KOSyllableIntroductionActivity kOSyllableIntroductionActivity = (KOSyllableIntroductionActivity) this.f378b;
                int size = arrayList2.size();
                if (size <= 0) {
                    kOSyllableIntroductionActivity.v(false);
                    kOSyllableIntroductionActivity.u(1.0f, true);
                    return;
                } else {
                    kOSyllableIntroductionActivity.v(true);
                    fv.c cVar = kOSyllableIntroductionActivity.P;
                    kotlin.jvm.internal.m.c(cVar);
                    cVar.c(arrayList2, new fn.b(kOSyllableIntroductionActivity, size, 0), false);
                    return;
                }
            case 13:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                c0 c0Var = (c0) this.f378b;
                if (!c0Var.S.get()) {
                    return;
                }
                PopupWindow popupWindow = c0Var.X;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                PdLearnDetailAdapter pdLearnDetailAdapter = c0Var.P;
                if (pdLearnDetailAdapter == null || (arrayList = pdLearnDetailAdapter.f21634i) == null) {
                    return;
                }
                int size2 = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        PdLearnDetailAdapter pdLearnDetailAdapter2 = c0Var.P;
                        if ((pdLearnDetailAdapter2 != null ? pdLearnDetailAdapter2.f21630e : null) == null) {
                            View view = (View) arrayList.get(0);
                            Object tag = view.getTag(R.id.tag_item_view);
                            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) tag;
                            Object tag2 = view.getTag(R.id.tag_word);
                            kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
                            PdWord pdWord = (PdWord) tag2;
                            Object tag3 = view.getTag(R.id.tag_adapter_pos);
                            kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) tag3).intValue();
                            PdLearnDetailAdapter pdLearnDetailAdapter3 = c0Var.P;
                            if (pdLearnDetailAdapter3 != null) {
                                pdLearnDetailAdapter3.c(view, view2, pdWord, iIntValue, false);
                                return;
                            }
                            return;
                        }
                        int i14 = i12 + 1;
                        if (i14 >= arrayList.size()) {
                            c0Var.A(false);
                            return;
                        }
                        View view3 = (View) arrayList.get(i14);
                        Object tag4 = view3.getTag(R.id.tag_item_view);
                        kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type android.view.View");
                        View view4 = (View) tag4;
                        Object tag5 = view3.getTag(R.id.tag_word);
                        kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
                        PdWord pdWord2 = (PdWord) tag5;
                        Object tag6 = view3.getTag(R.id.tag_adapter_pos);
                        kotlin.jvm.internal.m.d(tag6, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue2 = ((Integer) tag6).intValue();
                        PdLearnDetailAdapter pdLearnDetailAdapter4 = c0Var.P;
                        if (pdLearnDetailAdapter4 != null) {
                            pdLearnDetailAdapter4.c(view3, view4, pdWord2, iIntValue2, false);
                            return;
                        }
                        return;
                    }
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    int i15 = i11 + 1;
                    if (i11 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    View view5 = (View) obj2;
                    PdLearnDetailAdapter pdLearnDetailAdapter5 = c0Var.P;
                    if (kotlin.jvm.internal.m.a(view5, pdLearnDetailAdapter5 != null ? pdLearnDetailAdapter5.f21630e : null)) {
                        i12 = i11;
                    }
                    i11 = i15;
                }
                break;
            case 16:
                List list = (List) obj;
                MutableLiveData mutableLiveData = ((jh.r) this.f378b).f36381a;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(list);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("allVocabularyList");
                    throw null;
                }
            case 18:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ta.a aVar = ((p0) this.f378b).f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((x3) aVar).f33572e.setVisibility(8);
                return;
            case 19:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ta.a aVar2 = ((w0) this.f378b).f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((r5) aVar2).f33229b.setVisibility(8);
                return;
            case 20:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                km.f fVar = (km.f) this.f378b;
                ta.a aVar3 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                z4.w0 w0VarB = s0.b(((b4) aVar3).f32392j);
                w0VarB.j(CropImageView.DEFAULT_ASPECT_RATIO);
                w0VarB.e(400L);
                w0VarB.i();
                ta.a aVar4 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                z4.w0 w0VarB2 = s0.b(((b4) aVar4).m);
                w0VarB2.j(CropImageView.DEFAULT_ASPECT_RATIO);
                w0VarB2.e(400L);
                w0VarB2.i();
                ta.a aVar5 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                z4.w0 w0VarB3 = s0.b(((b4) aVar5).f32385c);
                w0VarB3.h(300L);
                w0VarB3.j(CropImageView.DEFAULT_ASPECT_RATIO);
                w0VarB3.e(400L);
                w0VarB3.i();
                th.j.a(qx.h.m(700L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.d(fVar, 24), km.d.f38165b), fVar.f36401t);
                return;
            default:
                Long it5 = (Long) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                oo.g gVar = (oo.g) this.f378b;
                FrameLayout frameLayout = (FrameLayout) gVar.f45663h.f32797f;
                kotlin.jvm.internal.m.c(frameLayout);
                frameLayout.setVisibility(8);
                FrameLayout frameLayout2 = (FrameLayout) gVar.f45663h.f32800i;
                kotlin.jvm.internal.m.c(frameLayout2);
                frameLayout2.setVisibility(8);
                return;
        }
    }

    public void b(i2 i2Var) {
        n9.q qVar = ((n9.w0) this.f378b).f43722e;
        qVar.getClass();
        ((ob.i) qVar.f43673b).r(i2Var instanceof f2 ? (f2) i2Var : null, new a0.h(i2Var, 7));
    }

    @Override // t7.j
    public void c(t7.l lVar, long j11, long j12) {
        t7.q qVar = (t7.q) lVar;
        i7.g gVar = (i7.g) this.f378b;
        long j13 = qVar.f52100a;
        d7.p pVar = qVar.f52103d;
        Uri uri = pVar.f23255c;
        p7.s sVar = new p7.s(pVar.f23256d);
        gVar.m.getClass();
        gVar.f34204q.d(sVar, qVar.f52102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        j7.c cVar = (j7.c) qVar.f52105f;
        j7.c cVar2 = gVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j14 = cVar.a(0).f36132b;
        int i11 = 0;
        while (i11 < size && gVar.H.a(i11).f36132b < j14) {
            i11++;
        }
        if (cVar.f36101d) {
            if (size - i11 > cVar.m.size()) {
                b7.a.B("Loaded out of sync manifest");
            } else {
                long j15 = gVar.N;
                if (j15 == -9223372036854775807L || cVar.f36105h * 1000 > j15) {
                    gVar.M = 0;
                } else {
                    b7.a.B("Loaded stale dynamic manifest: " + cVar.f36105h + ", " + gVar.N);
                }
            }
            int i12 = gVar.M;
            gVar.M = i12 + 1;
            if (i12 < gVar.m.w(qVar.f52102c)) {
                gVar.D.postDelayed(gVar.f34209v, Math.min((gVar.M - 1) * 1000, 5000));
                return;
            } else {
                gVar.C = new DashManifestStaleException();
                return;
            }
        }
        gVar.H = cVar;
        gVar.I = cVar.f36101d & gVar.I;
        gVar.J = j11 - j12;
        gVar.K = j11;
        gVar.O += i11;
        synchronized (gVar.f34207t) {
            if (qVar.f52101b.f23224a.equals(gVar.F)) {
                Uri uriA = gVar.H.f36108k;
                if (uriA == null) {
                    uriA = t7.f.a(qVar.f52103d.f23255c);
                }
                gVar.F = uriA;
            }
        }
        j7.c cVar3 = gVar.H;
        if (!cVar3.f36101d || gVar.L != -9223372036854775807) {
            gVar.w(true);
            return;
        }
        u uVar = cVar3.f36106i;
        if (uVar == null) {
            gVar.t();
            return;
        }
        String str = (String) uVar.f44891b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.L = f0.N((String) uVar.f44892c) - gVar.K;
                gVar.w(true);
                return;
            } catch (ParserException e8) {
                gVar.v(e8);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            gVar.x(uVar, new i7.e());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            gVar.x(uVar, new p20.c(14));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.t();
        } else {
            gVar.v(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // t7.j
    public f9.e e(t7.l lVar, long j11, long j12, IOException iOException, int i11) {
        long jMin;
        t7.q qVar = (t7.q) lVar;
        i7.g gVar = (i7.g) this.f378b;
        long j13 = qVar.f52100a;
        d7.p pVar = qVar.f52103d;
        Uri uri = pVar.f23255c;
        p7.s sVar = new p7.s(pVar.f23256d);
        int i12 = qVar.f52102c;
        gVar.m.getClass();
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException instanceof Loader$UnexpectedLoaderException)) {
            int i13 = DataSourceException.f2114b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i11 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f2115a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        f9.e eVar = jMin == -9223372036854775807L ? t7.n.f52096e : new f9.e(0 == true ? 1 : 0, jMin, 0 == true ? 1 : 0);
        int i14 = eVar.f27021b;
        gVar.f34204q.e(sVar, i12, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !(i14 == 0 || i14 == 1));
        return eVar;
    }

    @Override // o3.p
    public int f(int i11) {
        b10.b bVar = (b10.b) this.f378b;
        if (i11 <= bVar.f3846a - 1) {
            return i11;
        }
        if (i11 <= bVar.f3847b - 1) {
            return i11 - 1;
        }
        int i12 = bVar.f3848c;
        return i11 <= i12 + 1 ? i11 - 2 : i12;
    }

    @Override // t7.j
    public void g(t7.l lVar, long j11, long j12, boolean z11) {
        ((i7.g) this.f378b).u((t7.q) lVar);
    }

    @Override // b0.t
    public d0 get(int i11) {
        return (b0.e0) this.f378b;
    }

    public void h(byte b3) {
        ((Parcel) this.f378b).writeByte(b3);
    }

    public void i(float f5) {
        ((Parcel) this.f378b).writeFloat(f5);
    }

    public void j(long j11) {
        long jB = v3.o.b(j11);
        byte b3 = 0;
        if (!v3.p.a(jB, 0L)) {
            if (v3.p.a(jB, 4294967296L)) {
                b3 = 1;
            } else if (v3.p.a(jB, 8589934592L)) {
                b3 = 2;
            }
        }
        h(b3);
        if (v3.p.a(v3.o.b(j11), 0L)) {
            return;
        }
        i(v3.o.c(j11));
    }

    public List k(String repeatRegex, boolean z11) throws Throwable {
        Throwable th2;
        String str;
        int i11;
        kotlin.jvm.internal.m.f(repeatRegex, "repeatRegex");
        this.f378b = t(repeatRegex, BuildConfig.VERSION_NAME);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = (List) this.f378b;
        Throwable th3 = null;
        String str2 = "mTestModels";
        if (list == null) {
            kotlin.jvm.internal.m.n("mTestModels");
            throw null;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i12 >= size) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 5) {
                    List list2 = (List) this.f378b;
                    if (list2 != null) {
                        return list2;
                    }
                    kotlin.jvm.internal.m.n("mTestModels");
                    throw null;
                }
                if (i13 < 2 && !ry.l.D(new Integer[]{13, 12, 0, 11, 47, 48, 49, 50, 53, 54, 51, 55, 57, 21, 61, 63, 65, 19, 18, 69}, Integer.valueOf(x.n().keyLanguage)) && z11) {
                    String str3 = "get(...)";
                    if (arrayList.size() > 1) {
                        int[] iArrO = j3.O(arrayList.size());
                        int length = iArrO.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                th2 = th3;
                                str = str2;
                                i11 = i14;
                                break;
                            }
                            int i16 = iArrO[i15];
                            List list3 = (List) this.f378b;
                            if (list3 == null) {
                                Throwable th4 = th3;
                                kotlin.jvm.internal.m.n(str2);
                                throw th4;
                            }
                            Object obj = arrayList.get(i16);
                            kotlin.jvm.internal.m.e(obj, str3);
                            qi.a aVar = (qi.a) list3.get(((Number) obj).intValue());
                            th2 = th3;
                            str = str2;
                            if (arrayList2.contains(Long.valueOf(aVar.f47799b))) {
                                i11 = i14;
                            } else {
                                qi.a aVar2 = new qi.a();
                                aVar2.f47798a = aVar.f47798a;
                                i11 = i14;
                                aVar2.f47799b = aVar.f47799b;
                                aVar2.f47800c = 13;
                                List list4 = (List) this.f378b;
                                if (list4 == null) {
                                    kotlin.jvm.internal.m.n(str);
                                    throw th2;
                                }
                                list4.add(aVar2);
                                List list5 = (List) this.f378b;
                                if (list5 == null) {
                                    kotlin.jvm.internal.m.n(str);
                                    throw th2;
                                }
                                arrayList.add(Integer.valueOf(list5.size() - i11));
                                arrayList2.add(Long.valueOf(aVar.f47799b));
                                i13++;
                            }
                            if (i13 >= 2) {
                                break;
                            }
                            i15++;
                            th3 = th2;
                            str3 = str3;
                            i14 = i11;
                            str2 = str;
                        }
                    } else {
                        if (arrayList.size() == 1) {
                            List list6 = (List) this.f378b;
                            if (list6 == null) {
                                kotlin.jvm.internal.m.n("mTestModels");
                                throw null;
                            }
                            Object obj2 = arrayList.get(0);
                            kotlin.jvm.internal.m.e(obj2, "get(...)");
                            Object obj3 = arrayList.get(((Number) obj2).intValue());
                            kotlin.jvm.internal.m.e(obj3, "get(...)");
                            qi.a aVar3 = (qi.a) list6.get(((Number) obj3).intValue());
                            qi.a aVar4 = new qi.a();
                            aVar4.f47798a = aVar3.f47798a;
                            aVar4.f47799b = aVar3.f47799b;
                            aVar4.f47800c = 13;
                            List list7 = (List) this.f378b;
                            if (list7 == null) {
                                kotlin.jvm.internal.m.n("mTestModels");
                                throw null;
                            }
                            list7.add(aVar4);
                        }
                        List list8 = (List) this.f378b;
                        if (list8 != null) {
                            return list8;
                        }
                        kotlin.jvm.internal.m.n("mTestModels");
                        throw null;
                    }
                } else {
                    th2 = th3;
                    str = str2;
                    i11 = i14;
                    break;
                }
                if (oz.q.v0("release", "debug", false) && xt.b.f56282d) {
                    List list9 = (List) this.f378b;
                    if (list9 == null) {
                        kotlin.jvm.internal.m.n(str);
                        throw th2;
                    }
                    this.f378b = list9.subList(0, i11);
                }
                List list10 = (List) this.f378b;
                if (list10 != null) {
                    return list10;
                }
                kotlin.jvm.internal.m.n(str);
                throw th2;
            }
            List list11 = (List) this.f378b;
            if (list11 == null) {
                kotlin.jvm.internal.m.n("mTestModels");
                throw null;
            }
            qi.a aVar5 = (qi.a) list11.get(i12);
            int i17 = aVar5.f47798a;
            if (i17 == 1 && aVar5.f47800c == 13) {
                i13++;
                arrayList2.add(Long.valueOf(aVar5.f47799b));
            } else if (i17 == 1 && !arrayList2.contains(Long.valueOf(aVar5.f47799b))) {
                arrayList.add(Integer.valueOf(i12));
            }
            i12++;
        }
    }

    public String l(String charStr) {
        kotlin.jvm.internal.m.f(charStr, "charStr");
        HashMap map = (HashMap) this.f378b;
        if (map.containsKey(charStr)) {
            String str = (String) map.get(charStr);
            return str == null ? BuildConfig.VERSION_NAME : str;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = charStr.length();
        for (int i11 = 0; i11 < length; i11++) {
            String strValueOf = String.valueOf(charStr.charAt(i11));
            if (map.containsKey(strValueOf)) {
                strValueOf = (String) map.get(strValueOf);
            }
            sb2.append(strValueOf);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        int length2 = string.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length2) {
            boolean z12 = kotlin.jvm.internal.m.h(string.charAt(!z11 ? i12 : length2), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length2--;
            } else if (z12) {
                i12++;
            } else {
                z11 = true;
            }
        }
        return string.subSequence(i12, length2 + 1).toString();
    }

    @Override // ki.a
    public void m() {
    }

    public hd.d n() {
        return new hd.d((BitSet) ((BitSet) this.f378b).clone(), 10);
    }

    @Override // t7.j
    public void p(t7.l lVar, long j11, long j12, int i11) {
        p7.s sVar;
        t7.q qVar = (t7.q) lVar;
        i7.g gVar = (i7.g) this.f378b;
        if (i11 == 0) {
            long j13 = qVar.f52100a;
            sVar = new p7.s(qVar.f52101b);
        } else {
            long j14 = qVar.f52100a;
            d7.p pVar = qVar.f52103d;
            Uri uri = pVar.f23255c;
            sVar = new p7.s(pVar.f23256d);
        }
        gVar.f34204q.f(sVar, qVar.f52102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
    }

    public void q() {
        jp.i iVar = (jp.i) this.f378b;
        ta.a aVar = iVar.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        m1 layoutManager = ((hj.a) aVar).f32324g.getLayoutManager();
        if (layoutManager != null) {
            int size = iVar.f36485o.size() - 1;
            AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
            if (absDialogModelAdapter == null) {
                kotlin.jvm.internal.m.n("mAdapter");
                throw null;
            }
            View viewFindViewByPosition = layoutManager.findViewByPosition(absDialogModelAdapter.getHeaderLayoutCount() + size);
            if (viewFindViewByPosition != null) {
                ArrayList arrayList = iVar.f36485o;
                Object obj = arrayList.get(arrayList.size() - 1);
                kotlin.jvm.internal.m.e(obj, "get(...)");
                ((Sentence) obj).setHasChecked(true);
                ImageView imageView = (ImageView) viewFindViewByPosition.findViewById(R.id.iv_audio);
                if (imageView != null) {
                    imageView.setBackgroundResource(R.drawable.ic_pinyin_audio_ls);
                    imageView.setEnabled(true);
                    imageView.performClick();
                    iVar.f36489s = true;
                }
            }
        }
    }

    public void r() {
        ((b1) this.f378b).setValue(Boolean.FALSE);
    }

    @Override // o3.p
    public int s(int i11) {
        b10.b bVar = (b10.b) this.f378b;
        if (i11 < bVar.f3846a) {
            return i11;
        }
        if (i11 < bVar.f3847b) {
            return i11 + 1;
        }
        int i12 = bVar.f3848c;
        return i11 <= i12 ? i11 + 2 : i12 + 2;
    }

    public /* synthetic */ f(Object obj, int i11) {
        this.f377a = i11;
        this.f378b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x025b A[Catch: Exception -> 0x0290, TryCatch #1 {Exception -> 0x0290, blocks: (B:102:0x0241, B:104:0x025b, B:106:0x0266, B:107:0x026f, B:109:0x0275), top: B:235:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0266 A[Catch: Exception -> 0x0290, TryCatch #1 {Exception -> 0x0290, blocks: (B:102:0x0241, B:104:0x025b, B:106:0x0266, B:107:0x026f, B:109:0x0275), top: B:235:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0275 A[Catch: Exception -> 0x0290, TRY_LEAVE, TryCatch #1 {Exception -> 0x0290, blocks: (B:102:0x0241, B:104:0x025b, B:106:0x0266, B:107:0x026f, B:109:0x0275), top: B:235:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:265:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public List t(String repeatRegex, String lessonID) throws Throwable {
        List listK;
        List listT;
        Throwable th2;
        String strQ0;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        ry.r rVar;
        int i11;
        String str;
        int i12;
        int i13;
        Integer num;
        String str2;
        int i14;
        char c11;
        boolean z11;
        List listK4;
        List listT4;
        char c12;
        int i15;
        qi.a aVar;
        qi.a aVar2;
        List listK5;
        List listT5;
        char c13;
        ArrayList arrayListU;
        f fVar = this;
        Integer num2 = 2;
        kotlin.jvm.internal.m.f(repeatRegex, "repeatRegex");
        kotlin.jvm.internal.m.f(lessonID, "lessonID");
        fVar.f378b = new ArrayList();
        Pattern patternCompile = Pattern.compile(IMCc.xvCmJOSH);
        String str3 = "compile(...)";
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        int i16 = 0;
        oz.q.U0(0);
        Matcher matcher = patternCompile.matcher(repeatRegex);
        int i17 = 10;
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = nv.p.c(matcher, repeatRegex, iC, arrayList);
            } while (matcher.find());
            nv.p.B(iC, repeatRegex, arrayList);
            listK = arrayList;
        } else {
            listK = ns.o.K(repeatRegex.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        ry.r rVar2 = ry.r.f50854a;
        int i18 = 1;
        if (zIsEmpty) {
            listT = rVar2;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar2;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = b7.e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        int length = strArr.length;
        int i19 = 0;
        while (true) {
            String str4 = LwKl.epzhmA;
            if (i19 >= length) {
                List list = (List) fVar.f378b;
                if (list != null) {
                    return list;
                }
                kotlin.jvm.internal.m.n(str4);
                throw null;
            }
            String str5 = strArr[i19];
            if (oz.x.s0(str5, "3:", i16)) {
                th2 = null;
                strQ0 = oz.x.q0(oz.x.q0(str5, ":-", ":0-"), ":;", ":0;");
            } else {
                th2 = null;
                strQ0 = str5;
            }
            Matcher matcherW = nv.p.w(i16, ";", str3, strQ0);
            if (matcherW.find()) {
                ArrayList arrayList2 = new ArrayList(i17);
                int iC2 = i16;
                do {
                    iC2 = nv.p.c(matcherW, strQ0, iC2, arrayList2);
                } while (matcherW.find());
                nv.p.B(iC2, strQ0, arrayList2);
                listK2 = arrayList2;
            } else {
                listK2 = ns.o.K(strQ0.toString());
            }
            if (listK2.isEmpty()) {
                listT2 = rVar2;
                break;
            }
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT2 = rVar2;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = b7.e0.t(listIterator2, i18, listK2);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT2.toArray(new String[i16]);
            int i21 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : i18;
            String str6 = strArr2[i16];
            Matcher matcher2 = b7.e0.u(i16, "-", str3, str6, "input").matcher(str6);
            if (matcher2.find()) {
                ArrayList arrayList3 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = nv.p.c(matcher2, str6, iC3, arrayList3);
                } while (matcher2.find());
                nv.p.B(iC3, str6, arrayList3);
                listK3 = arrayList3;
            } else {
                listK3 = ns.o.K(str6.toString());
            }
            if (listK3.isEmpty()) {
                listT3 = rVar2;
                break;
            }
            ListIterator listIterator3 = listK3.listIterator(listK3.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT3 = rVar2;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT3 = b7.e0.t(listIterator3, 1, listK3);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT3.toArray(new String[0]);
            ArrayList arrayList4 = new ArrayList();
            int length2 = strArr3.length;
            int i22 = length;
            int i23 = 0;
            while (true) {
                rVar = rVar2;
                i11 = i19;
                str = str4;
                i12 = i21;
                if (i23 >= length2) {
                    break;
                }
                String str7 = strArr3[i23];
                int i24 = length2;
                Matcher matcher3 = b7.e0.u(0, ":", str3, str7, "input").matcher(str7);
                if (matcher3.find()) {
                    ArrayList arrayList5 = new ArrayList(10);
                    int iC4 = 0;
                    do {
                        iC4 = nv.p.c(matcher3, str7, iC4, arrayList5);
                    } while (matcher3.find());
                    nv.p.B(iC4, str7, arrayList5);
                    listK5 = arrayList5;
                } else {
                    listK5 = ns.o.K(str7.toString());
                }
                if (listK5.isEmpty()) {
                    listT5 = rVar;
                    break;
                }
                ListIterator listIterator4 = listK5.listIterator(listK5.size());
                while (true) {
                    if (!listIterator4.hasPrevious()) {
                        listT5 = rVar;
                        break;
                    }
                    if (((String) listIterator4.previous()).length() != 0) {
                        listT5 = b7.e0.t(listIterator4, 1, listK5);
                        break;
                    }
                }
                String[] strArr4 = (String[]) listT5.toArray(new String[0]);
                if (strArr4.length >= 2) {
                    qi.a aVar3 = new qi.a();
                    try {
                        if (kotlin.jvm.internal.m.a(strArr4[0], "0")) {
                            aVar3.f47798a = 0;
                        } else {
                            if (kotlin.jvm.internal.m.a(strArr4[0], "1")) {
                                aVar3.f47798a = 1;
                                c13 = 1;
                            } else if (kotlin.jvm.internal.m.a(strArr4[0], "2")) {
                                aVar3.f47798a = 2;
                            } else if (kotlin.jvm.internal.m.a(strArr4[0], "3")) {
                                aVar3.f47798a = 3;
                            }
                            aVar3.f47799b = Integer.valueOf(strArr4[c13]).intValue();
                            arrayListU = ew.a.u(strArr4[2]);
                            if (aVar3.f47798a == 1) {
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                if (x.n().keyLanguage != 3) {
                                    arrayListU.remove(Integer.valueOf("12"));
                                }
                            }
                            if (arrayListU.size() > 0) {
                                Object obj = arrayListU.get(j3.M(arrayListU.size()));
                                kotlin.jvm.internal.m.e(obj, "get(...)");
                                aVar3.f47800c = ((Number) obj).intValue();
                                arrayList4.add(aVar3);
                            }
                        }
                        aVar3.f47799b = Integer.valueOf(strArr4[c13]).intValue();
                        arrayListU = ew.a.u(strArr4[2]);
                        if (aVar3.f47798a == 1) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            if (x.n().keyLanguage != 3) {
                                arrayListU.remove(Integer.valueOf("12"));
                            }
                        }
                        if (arrayListU.size() > 0) {
                            Object obj2 = arrayListU.get(j3.M(arrayListU.size()));
                            kotlin.jvm.internal.m.e(obj2, "get(...)");
                            aVar3.f47800c = ((Number) obj2).intValue();
                            arrayList4.add(aVar3);
                        }
                    } catch (Exception unused) {
                        ry.l.Z(strArr, str5);
                        String str8 = strArr3[i23];
                    }
                    c13 = 1;
                }
                i23++;
                rVar2 = rVar;
                i19 = i11;
                str4 = str;
                i21 = i12;
                length2 = i24;
            }
            if (arrayList4.size() == 0) {
                num = num2;
                str2 = str3;
                i14 = 1;
                c11 = 2;
                z11 = false;
                this = this;
            } else {
                int i25 = ((qi.a) arrayList4.get(0)).f47800c;
                String str9 = str5;
                if (ry.l.D(new Integer[]{num2, 3, 4}, Integer.valueOf(strArr3.length)) && ry.l.D(new Integer[]{0, num2}, Integer.valueOf(((qi.a) arrayList4.get(0)).f47798a)) && ry.l.D(new Integer[]{6, 13, 0, num2}, Integer.valueOf(i25))) {
                    if (((qi.a) arrayList4.get(0)).f47798a == 0 && i25 == 2) {
                        i13 = 0;
                    } else {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it = arrayList4.iterator();
                        kotlin.jvm.internal.m.e(it, "iterator(...)");
                        while (it.hasNext()) {
                            arrayList6.add(Long.valueOf(((qi.a) it.next()).f47799b));
                        }
                        if (i25 == 0) {
                            i25 = 6;
                        }
                        qi.a aVar4 = new qi.a();
                        aVar4.f47798a = ((qi.a) arrayList4.get(0)).f47798a;
                        aVar4.f47799b = 0L;
                        aVar4.f47800c = i25;
                        aVar4.f47801d = arrayList6;
                        this = this;
                        List list2 = (List) this.f378b;
                        if (list2 == null) {
                            kotlin.jvm.internal.m.n(str);
                            throw th2;
                        }
                        list2.add(aVar4);
                    }
                    num = num2;
                    str2 = str3;
                    i14 = 1;
                    c11 = 2;
                    z11 = false;
                } else {
                    i13 = 0;
                }
                if (((qi.a) arrayList4.get(i13)).f47798a == 3 && i25 == 0) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it2 = arrayList4.iterator();
                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        arrayList7.add(Long.valueOf(((qi.a) it2.next()).f47799b));
                    }
                    qi.a aVar5 = new qi.a();
                    aVar5.f47798a = 3;
                    aVar5.f47799b = 0L;
                    aVar5.f47800c = 14;
                    aVar5.f47801d = arrayList7;
                    List list3 = (List) this.f378b;
                    if (list3 == null) {
                        kotlin.jvm.internal.m.n(str);
                        throw th2;
                    }
                    list3.add(aVar5);
                } else {
                    int[] iArrP = j3.P(strArr3.length, i12);
                    int i26 = 0;
                    for (int length3 = iArrP.length; i26 < length3; length3 = i15) {
                        int i27 = iArrP[i26];
                        int[] iArr = iArrP;
                        String str10 = strArr3[i27];
                        String[] strArr5 = strArr3;
                        Integer num3 = num2;
                        Matcher matcher4 = b7.e0.u(0, ":", str3, str10, "input").matcher(str10);
                        if (matcher4.find()) {
                            ArrayList arrayList8 = new ArrayList(10);
                            int iC5 = 0;
                            do {
                                iC5 = nv.p.c(matcher4, str10, iC5, arrayList8);
                            } while (matcher4.find());
                            nv.p.B(iC5, str10, arrayList8);
                            listK4 = arrayList8;
                        } else {
                            listK4 = ns.o.K(str10.toString());
                        }
                        if (listK4.isEmpty()) {
                            listT4 = rVar;
                            break;
                        }
                        ListIterator listIterator5 = listK4.listIterator(listK4.size());
                        while (true) {
                            if (!listIterator5.hasPrevious()) {
                                listT4 = rVar;
                                break;
                            }
                            if (((String) listIterator5.previous()).length() != 0) {
                                listT4 = b7.e0.t(listIterator5, 1, listK4);
                                break;
                            }
                        }
                        String[] strArr6 = (String[]) listT4.toArray(new String[0]);
                        qi.a aVar6 = new qi.a();
                        if (kotlin.jvm.internal.m.a(strArr6[0], "0")) {
                            aVar6.f47798a = 0;
                            c12 = 1;
                        } else if (kotlin.jvm.internal.m.a(strArr6[0], "1")) {
                            c12 = 1;
                            aVar6.f47798a = 1;
                        } else {
                            c12 = 1;
                            if (kotlin.jvm.internal.m.a(strArr6[0], "2")) {
                                aVar6.f47798a = 2;
                            }
                        }
                        try {
                            try {
                                i15 = length3;
                                try {
                                    aVar6.f47799b = Integer.valueOf(strArr6[c12]).intValue();
                                    try {
                                        ArrayList arrayListU2 = ew.a.u(strArr6[2]);
                                        aVar6.f47802e = ew.a.u(strArr6[2]);
                                        List list4 = (List) this.f378b;
                                        if (list4 == null) {
                                            kotlin.jvm.internal.m.n(str);
                                            throw th2;
                                        }
                                        if (list4.size() > 0) {
                                            try {
                                                List list5 = (List) this.f378b;
                                                if (list5 == null) {
                                                    kotlin.jvm.internal.m.n(str);
                                                    throw th2;
                                                }
                                                aVar = (qi.a) list5.get(list5.size() - 1);
                                            } catch (Exception unused2) {
                                                ry.l.Z(strArr, str9);
                                                String str11 = strArr5[i27];
                                            }
                                        } else {
                                            aVar2 = th2;
                                        }
                                        if (aVar2 != 0) {
                                            aVar2 = aVar;
                                            if (aVar2.f47798a != aVar6.f47798a) {
                                                aVar2 = aVar;
                                            } else if (arrayListU2.size() > 1) {
                                                try {
                                                    if (arrayListU2.contains(Integer.valueOf(aVar2.f47800c))) {
                                                        arrayListU2.remove(Integer.valueOf(aVar2.f47800c));
                                                    }
                                                } catch (Exception unused3) {
                                                    ry.l.Z(strArr, str9);
                                                    String str12 = strArr5[i27];
                                                }
                                            }
                                        } else {
                                            aVar2 = aVar;
                                        }
                                        Object obj3 = arrayListU2.get(j3.M(arrayListU2.size()));
                                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                                        aVar6.f47800c = ((Number) obj3).intValue();
                                        List list6 = (List) this.f378b;
                                        if (list6 == null) {
                                            kotlin.jvm.internal.m.n(str);
                                            throw th2;
                                        }
                                        list6.add(aVar6);
                                        str9 = str9;
                                        i26++;
                                        str9 = str9;
                                        iArrP = iArr;
                                        strArr3 = strArr5;
                                        num2 = num3;
                                        str3 = str3;
                                    } catch (Exception unused4) {
                                    }
                                } catch (Exception unused5) {
                                }
                            } catch (Exception unused6) {
                                i15 = length3;
                            }
                        } catch (Exception unused7) {
                            i15 = length3;
                        }
                        ry.l.Z(strArr, str9);
                        String str13 = strArr5[i27];
                        i26++;
                        str9 = str9;
                        iArrP = iArr;
                        strArr3 = strArr5;
                        num2 = num3;
                        str3 = str3;
                    }
                }
                num = num2;
                str2 = str3;
                i14 = 1;
                c11 = 2;
                z11 = false;
            }
            i19 = i11 + 1;
            i18 = i14;
            fVar = this;
            i16 = z11;
            length = i22;
            rVar2 = rVar;
            num2 = num;
            str3 = str2;
            i17 = 10;
        }
    }

    public f(int i11) {
        List listK;
        List listT;
        List listK2;
        List listT2;
        this.f377a = i11;
        switch (i11) {
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                this.f378b = new ConcurrentHashMap();
                break;
            default:
                HashMap map = new HashMap();
                this.f378b = map;
                map.clear();
                Pattern patternCompile = Pattern.compile("\n");
                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                oz.q.U0(0);
                Matcher matcher = patternCompile.matcher("ç\tc2\nğ\tg2\nı\ti\ni\ti2\nö\to2\nş\ts2\nü\tu2\nçay\tc2ay\npirinç\tpirinc2\nsağ\tsag2\ndeğil\tdeg2il\nnasıl\tnasil\nkız\tkiz\nİstanbul\ti2stanbul\nbiz\tbi2z\nköpek\tko2pek\nöğrenci\to2g2renci\nşeker\ts2eker\narkadaş\tarkadas2\nTürk\ttu2rk\nüç\tu2c2");
                if (!matcher.find()) {
                    listK = ns.o.K("ç\tc2\nğ\tg2\nı\ti\ni\ti2\nö\to2\nş\ts2\nü\tu2\nçay\tc2ay\npirinç\tpirinc2\nsağ\tsag2\ndeğil\tdeg2il\nnasıl\tnasil\nkız\tkiz\nİstanbul\ti2stanbul\nbiz\tbi2z\nköpek\tko2pek\nöğrenci\to2g2renci\nşeker\ts2eker\narkadaş\tarkadas2\nTürk\ttu2rk\nüç\tu2c2");
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = nv.p.c(matcher, "ç\tc2\nğ\tg2\nı\ti\ni\ti2\nö\to2\nş\ts2\nü\tu2\nçay\tc2ay\npirinç\tpirinc2\nsağ\tsag2\ndeğil\tdeg2il\nnasıl\tnasil\nkız\tkiz\nİstanbul\ti2stanbul\nbiz\tbi2z\nköpek\tko2pek\nöğrenci\to2g2renci\nşeker\ts2eker\narkadaş\tarkadas2\nTürk\ttu2rk\nüç\tu2c2", iC, arrayList);
                    } while (matcher.find());
                    arrayList.add("ç\tc2\nğ\tg2\nı\ti\ni\ti2\nö\to2\nş\ts2\nü\tu2\nçay\tc2ay\npirinç\tpirinc2\nsağ\tsag2\ndeğil\tdeg2il\nnasıl\tnasil\nkız\tkiz\nİstanbul\ti2stanbul\nbiz\tbi2z\nköpek\tko2pek\nöğrenci\to2g2renci\nşeker\ts2eker\narkadaş\tarkadas2\nTürk\ttu2rk\nüç\tu2c2".subSequence(iC, 207).toString());
                    listK = arrayList;
                }
                boolean zIsEmpty = listK.isEmpty();
                ry.r rVar = ry.r.f50854a;
                if (zIsEmpty) {
                    listT = rVar;
                } else {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listT = rVar;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            listT = b7.e0.t(listIterator, 1, listK);
                        }
                    }
                }
                for (String str : (String[]) listT.toArray(new String[0])) {
                    Matcher matcher2 = b7.e0.u(0, "\t", "compile(...)", str, "input").matcher(str);
                    if (matcher2.find()) {
                        ArrayList arrayList2 = new ArrayList(10);
                        int iC2 = 0;
                        do {
                            iC2 = nv.p.c(matcher2, str, iC2, arrayList2);
                        } while (matcher2.find());
                        nv.p.B(iC2, str, arrayList2);
                        listK2 = arrayList2;
                    } else {
                        listK2 = ns.o.K(str.toString());
                    }
                    if (listK2.isEmpty()) {
                        listT2 = rVar;
                    }
                    ListIterator listIterator2 = listK2.listIterator(listK2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            if (((String) listIterator2.previous()).length() != 0) {
                                listT2 = b7.e0.t(listIterator2, 1, listK2);
                            }
                        } else {
                            listT2 = rVar;
                        }
                        break;
                    }
                    break;
                    String[] strArr = (String[]) listT2.toArray(new String[0]);
                    ((HashMap) this.f378b).put(strArr[0], strArr[1]);
                }
                break;
        }
    }

    public f(hd.d dVar) {
        this.f377a = 8;
        this.f378b = (BitSet) dVar.f32187b;
    }

    public f(com.bumptech.glide.j jVar) {
        this.f377a = 6;
        this.f378b = Collections.unmodifiableMap(new HashMap(jVar.f7639a));
    }

    public f(float f5, float f11) {
        this.f377a = 2;
        this.f378b = new b0.e0(f5, f11, 0.01f);
    }
}
