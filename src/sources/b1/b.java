package b1;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.lifecycle.ViewModelKt;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import bp.g1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.characterstroke.CharacterStroke;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.h0;
import fr.o0;
import fr.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import jr.i0;
import js.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import n9.f0;
import n9.r0;
import n9.y1;
import qa.z;
import qy.b0;
import rt.fd;
import rt.hd;
import rt.jd;
import rt.jf;
import rt.mf;
import rz.e0;
import uz.i1;
import vt.g0;
import vt.k0;
import vt.n0;
import vt.q0;
import ys.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3767b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f3766a = i11;
        this.f3767b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object a(List list, vy.d dVar) {
        gp.l lVar;
        List list2;
        Object obj;
        LanguageHistoryEntity languageHistoryEntity;
        boolean z11;
        gp.m mVar = (gp.m) this.f3767b;
        i1 i1Var = mVar.f29445d;
        q0 q0Var = mVar.f29442a;
        n0 n0Var = mVar.f29443b;
        if (dVar instanceof gp.l) {
            lVar = (gp.l) dVar;
            int i11 = lVar.f29426d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f29426d = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new gp.l(this, dVar);
            }
        } else {
            lVar = new gp.l(this, dVar);
        }
        Object objR = lVar.f29424b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = lVar.f29426d;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objR);
            k0 k0Var = mVar.f29444c;
            list2 = list;
            lVar.f29423a = list2;
            lVar.f29426d = 1;
            objR = g1.r(n0Var, k0Var, lVar);
            if (objR != obj2) {
            }
            return obj2;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objR);
            return b0Var;
        }
        list2 = lVar.f29423a;
        com.bumptech.glide.e.F(objR);
        boolean zBooleanValue = ((Boolean) objR).booleanValue();
        List listA = gp.m.a(mVar, list2, zBooleanValue);
        if (!listA.isEmpty()) {
            gp.i iVar = new gp.i(listA);
            i1Var.getClass();
            i1Var.l(null, iVar);
            return b0Var;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        int[] iArr = bq.r.f4959a;
        Env env = ((o0) n0Var).f27733a;
        String strX = bq.m.x(env.locateLanguage);
        ep.c cVar = new ep.c(q0Var, null, null);
        cVar.q(-1, lingoSkillApplication, strX);
        Iterable iterable = (ArrayList) cVar.H.getValue();
        ry.r rVar = ry.r.f50854a;
        if (iterable == null) {
            iterable = rVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : iterable) {
            if (obj3 instanceof LanguageExpandableItem2) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj4 = arrayList.get(i13);
            i13++;
            List<MultiItemEntity> subItems = ((LanguageExpandableItem2) obj4).getSubItems();
            ry.m.d0(arrayList2, subItems == null ? rVar : subItems);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj5 = arrayList2.get(i14);
            i14++;
            if (obj5 instanceof LanguageItem) {
                arrayList3.add(obj5);
            }
        }
        int size3 = arrayList3.size();
        int i15 = 0;
        do {
            if (i15 >= size3) {
                obj = null;
                break;
            }
            obj = arrayList3.get(i15);
            i15++;
            LanguageItem languageItem = (LanguageItem) obj;
            boolean z12 = env.keyLanguage == languageItem.getKeyLanguage() && env.locateLanguage == languageItem.getLocate() && env.fluentLanguage == -1 && env.scLanguage == -1 && env.handWriteLanguage == -1;
            boolean z13 = env.fluentLanguage == languageItem.getKeyLanguage() && env.locateLanguage == languageItem.getLocate();
            boolean z14 = env.scLanguage == languageItem.getKeyLanguage() && env.locateLanguage == languageItem.getLocate();
            z11 = env.handWriteLanguage == languageItem.getKeyLanguage() && env.locateLanguage == languageItem.getLocate();
            if (z12 || z13 || z14) {
                break;
            }
        } while (!z11);
        LanguageItem languageItem2 = (LanguageItem) obj;
        if (languageItem2 != null) {
            String str = languageItem2.getKeyLanguage() + "-" + languageItem2.getLocate();
            int keyLanguage = languageItem2.getKeyLanguage();
            int locate = languageItem2.getLocate();
            String name = languageItem2.getName();
            if (name == null) {
                int[] iArr2 = bq.r.f4959a;
                name = bq.m.s(lingoSkillApplication, languageItem2.getKeyLanguage());
            }
            String str2 = name;
            String description = languageItem2.getDescription();
            if (description == null) {
                description = BuildConfig.VERSION_NAME;
            }
            languageHistoryEntity = new LanguageHistoryEntity(str, keyLanguage, locate, str2, description, System.currentTimeMillis());
        } else {
            int i16 = env.fluentLanguage;
            if (i16 == -1 && (i16 = env.scLanguage) == -1 && (i16 = env.handWriteLanguage) == -1) {
                i16 = env.keyLanguage;
            }
            String str3 = i16 + "-" + env.locateLanguage;
            int i17 = env.locateLanguage;
            int[] iArr3 = bq.r.f4959a;
            languageHistoryEntity = new LanguageHistoryEntity(str3, i16, i17, bq.m.s(lingoSkillApplication, i16), BuildConfig.VERSION_NAME, System.currentTimeMillis());
        }
        List listA2 = gp.m.a(mVar, ns.o.K(languageHistoryEntity), zBooleanValue);
        gp.i iVar2 = new gp.i(listA2);
        i1Var.getClass();
        i1Var.l(null, iVar2);
        if (!mVar.f29447f && !listA2.isEmpty()) {
            mVar.f29447f = true;
            lVar.f29423a = null;
            lVar.f29426d = 2;
            if (((z0) q0Var).a(languageHistoryEntity, lVar) == obj2) {
                return obj2;
            }
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(f0 f0Var, vy.d dVar) {
        r0 r0Var;
        if (dVar instanceof r0) {
            r0Var = (r0) dVar;
            int i11 = r0Var.f43687c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r0Var.f43687c = i11 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, dVar);
            }
        } else {
            r0Var = new r0(this, dVar);
        }
        Object obj = r0Var.f43685a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = r0Var.f43687c;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                y1 y1Var = (y1) this.f3767b;
                r0Var.f43687c = 1;
                if (y1Var.f43739a.f(f0Var, r0Var) == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
        } catch (ClosedSendChannelException unused) {
        }
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r7.A(r6, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(ry.v r6, vy.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof n9.c
            if (r0 == 0) goto L13
            r0 = r7
            n9.c r0 = (n9.c) r0
            int r1 = r0.f43509e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43509e = r1
            goto L18
        L13:
            n9.c r0 = new n9.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f43507c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f43509e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r7)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ry.v r6 = r0.f43506b
            b1.b r2 = r0.f43505a
            com.bumptech.glide.e.F(r7)
            goto L53
        L3a:
            com.bumptech.glide.e.F(r7)
            java.lang.Object r7 = r5.f3767b
            a9.i r7 = (a9.i) r7
            java.lang.Object r7 = r7.f518b
            uz.w0 r7 = (uz.w0) r7
            r0.f43505a = r5
            r0.f43506b = r6
            r0.f43509e = r4
            java.lang.Object r7 = r7.emit(r6, r0)
            if (r7 != r1) goto L52
            goto L68
        L52:
            r2 = r5
        L53:
            java.lang.Object r7 = r2.f3767b
            a9.i r7 = (a9.i) r7
            java.lang.Object r7 = r7.f517a
            ij.d r7 = (ij.d) r7
            r2 = 0
            r0.f43505a = r2
            r0.f43506b = r2
            r0.f43509e = r3
            java.lang.Object r6 = r7.A(r6, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.b.e(ry.v, vy.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0298  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        Object objB;
        b0 b0Var;
        Object objE;
        Object value;
        Object value2;
        Object value3;
        jf jfVar;
        ArrayList arrayList;
        int i11;
        Object obj2;
        uz.m mVar;
        List list;
        qy.l lVar;
        String strValueOf;
        String strSubstring;
        CourseCharacterGroup courseCharacterGroup;
        Object value4;
        Object obj3 = obj;
        switch (this.f3766a) {
            case 0:
                p pVar = (p) this.f3767b;
                if (Build.VERSION.SDK_INT >= 34) {
                    g.b(pVar.z(), (View) pVar.f3800b);
                }
                return b0.f48488a;
            case 1:
                return (((Boolean) obj3).booleanValue() && (objB = cu.t.b((cu.t) this.f3767b, dVar)) == wy.a.COROUTINE_SUSPENDED) ? objB : b0.f48488a;
            case 2:
                return a((List) obj3, dVar);
            case 3:
                return g(((Boolean) obj3).booleanValue(), dVar);
            case 4:
                za.c cVar = (za.c) obj3;
                dm.a aVar = ((ia.b) this.f3767b).f34283d;
                b0 b0Var2 = b0.f48488a;
                if (aVar == null) {
                    b0Var = null;
                } else {
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) aVar.f23485b;
                    slidingPaneLayout.W = cVar;
                    qa.f fVar = new qa.f();
                    fVar.f47680c = 300L;
                    fVar.f47682d = new PathInterpolator(0.2f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                    z.a(slidingPaneLayout, fVar);
                    slidingPaneLayout.requestLayout();
                    b0Var = b0Var2;
                }
                return b0Var == wy.a.COROUTINE_SUSPENDED ? b0Var : b0Var2;
            case 5:
                if (!kotlin.jvm.internal.m.a((mv.a) obj3, mv.a.f42189a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((fz.a) this.f3767b).invoke();
                return b0.f48488a;
            case 6:
                return f((tt.a) obj3, dVar);
            case 7:
                return f((tt.a) obj3, dVar);
            case 8:
                n5.v vVar = (n5.v) this.f3767b;
                return ((vVar.f43405h.b() instanceof n5.f0) || (objE = n5.v.e(vVar, true, dVar)) != wy.a.COROUTINE_SUSPENDED) ? b0.f48488a : objE;
            case 9:
                return e((ry.v) obj3, dVar);
            case 10:
                Object objF = ((tz.w) this.f3767b).f(obj3, dVar);
                return objF == wy.a.COROUTINE_SUSPENDED ? objF : b0.f48488a;
            case 11:
                return b((f0) obj3, dVar);
            case 12:
                ((tz.h) this.f3767b).i((b0) obj3);
                return b0.f48488a;
            case 13:
                ni.m mVar2 = (ni.m) this.f3767b;
                e0.B(ViewModelKt.getViewModelScope(mVar2), null, null, new i0(15, (List) obj3, mVar2, (vy.d) null), 3);
                return b0.f48488a;
            case 14:
                ((o9.b) this.f3767b).f44750d.setValue((n9.e) obj3);
                return b0.f48488a;
            case 15:
                ps.a aVar2 = (ps.a) obj3;
                jd jdVar = (jd) this.f3767b;
                i1 i1Var = jdVar.f49945e;
                float fK = hz.b.k(aVar2.f47121d, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                if (aVar2.f47120c == 0) {
                    jdVar.M = true;
                    do {
                        value2 = i1Var.getValue();
                    } while (!i1Var.j(value2, new hd(1.0f, true, true)));
                    jdVar.a("downloaded");
                } else {
                    do {
                        value = i1Var.getValue();
                    } while (!i1Var.j(value, new hd(fK, fK >= 1.0f, false)));
                    if (fK >= 1.0f && !jdVar.M) {
                        jdVar.M = true;
                        jdVar.a("success");
                    }
                }
                return b0.f48488a;
            case 16:
                List<ps.b> list2 = (List) obj3;
                mf mfVar = (mf) this.f3767b;
                i1 i1Var2 = mfVar.f50103d;
                do {
                    value3 = i1Var2.getValue();
                    jfVar = (jf) value3;
                    arrayList = new ArrayList(ry.n.W(list2, 10));
                    for (ps.b bVar : list2) {
                        Iterator it = jfVar.f49948a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((ps.b) next).f47122a == bVar.f47122a) {
                                    obj2 = next;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        ps.b bVar2 = (ps.b) obj2;
                        arrayList.add(ps.b.a(bVar, mfVar.f50106t.contains(new Long(bVar.f47122a)) ? ps.c.f47130a : mfVar.f50105f.contains(new Long(bVar.f47122a)) ? ps.e.f47132a : bVar.f47127f, bVar2 != null ? bVar2.f47128g : CropImageView.DEFAULT_ASPECT_RATIO, bVar2 != null ? bVar2.f47129h : false, 159));
                    }
                    List list3 = jfVar.f49948a;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        int i12 = 0;
                        while (it2.hasNext()) {
                            if (((ps.b) it2.next()).f47129h && (i12 = i12 + 1) < 0) {
                                ns.o.U();
                                throw null;
                            }
                        }
                        i11 = i12;
                    } else {
                        i11 = 0;
                    }
                } while (!i1Var2.j(value3, jf.a(jfVar, arrayList, i11, CropImageView.DEFAULT_ASPECT_RATIO, false, null, 116)));
                return b0.f48488a;
            case 17:
                if (dVar instanceof uz.m) {
                    mVar = (uz.m) dVar;
                    int i13 = mVar.f53356c;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        mVar.f53356c = i13 - Integer.MIN_VALUE;
                    } else {
                        mVar = new uz.m(this, dVar);
                    }
                } else {
                    mVar = new uz.m(this, dVar);
                }
                Object obj4 = mVar.f53354a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = mVar.f53356c;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj4);
                    tz.t tVar = (tz.t) this.f3767b;
                    if (obj3 == null) {
                        obj3 = vz.b.f54329b;
                    }
                    mVar.f53356c = 1;
                    if (((tz.s) tVar).f52713d.f(obj3, mVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                }
                return b0.f48488a;
            case 18:
                wg.i iVar = (wg.i) obj3;
                if (iVar instanceof wg.g) {
                    wg.g gVar = (wg.g) iVar;
                    ((WebView) this.f3767b).loadDataWithBaseURL(gVar.f55130b, gVar.f55129a, gVar.f55131c, "utf-8", gVar.f55132d);
                } else if (!(iVar instanceof wg.h)) {
                    throw new IllegalStateException("Unknown WebContent type: " + iVar);
                }
                return b0.f48488a;
            case 19:
                if (!kotlin.jvm.internal.m.a((fd) obj3, fd.f49765a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context = (Context) this.f3767b;
                Toast.makeText(context, context.getString(R.string.exo_download_paused_for_network), 0).show();
                return b0.f48488a;
            case 20:
                ((z2.y1) this.f3767b).f58729a.m(((Number) obj3).floatValue());
                return b0.f48488a;
            default:
                String str = (String) obj3;
                zr.b bVar3 = (zr.b) this.f3767b;
                String string = oz.q.i1(str).toString();
                if (string.length() == 0) {
                    courseCharacterGroup = zr.b.a();
                } else {
                    oz.o oVar = new oz.o("[\\u4E00-\\u9FFF]");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    nz.k kVar = new nz.k(oz.o.c(oVar, string));
                    while (kVar.hasNext()) {
                        linkedHashSet.add(((oz.l) kVar.next()).c());
                    }
                    List listA1 = ry.m.a1(linkedHashSet);
                    if (listA1.isEmpty()) {
                        String strB = zr.b.b(string);
                        int length = strB.length();
                        list = ry.r.f50854a;
                        if (length != 0) {
                            String string2 = oz.q.i1(strB).toString();
                            if (string2.length() == 0) {
                                lVar = new qy.l(list, null);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                int length2 = 0;
                                while (true) {
                                    if (length2 < string2.length()) {
                                        while (length2 < string2.length() && qx.p.s(string2.charAt(length2))) {
                                            length2++;
                                        }
                                        if (length2 < string2.length()) {
                                            if (length2 + 1 < string2.length()) {
                                                int i15 = length2 + 2;
                                                strValueOf = string2.substring(length2, i15);
                                                kotlin.jvm.internal.m.e(strValueOf, "substring(...)");
                                                if (bVar3.H.contains(strValueOf)) {
                                                    length2 = i15;
                                                } else {
                                                    strValueOf = BuildConfig.VERSION_NAME;
                                                }
                                            } else {
                                                strValueOf = BuildConfig.VERSION_NAME;
                                            }
                                            if (strValueOf.length() == 0 && bVar3.K.contains(Character.valueOf(string2.charAt(length2)))) {
                                                strValueOf = String.valueOf(string2.charAt(length2));
                                                length2++;
                                            }
                                            int iMin = Math.min(4, string2.length() - length2);
                                            while (true) {
                                                if (iMin > 0) {
                                                    strSubstring = string2.substring(length2, length2 + iMin);
                                                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                                    if (!bVar3.L.contains(strSubstring)) {
                                                        iMin--;
                                                    }
                                                } else {
                                                    strSubstring = null;
                                                }
                                            }
                                            if (strSubstring != null) {
                                                arrayList2.add(strValueOf + strSubstring);
                                                length2 += strSubstring.length();
                                            } else {
                                                String strSubstring2 = string2.substring(length2);
                                                kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                                lVar = new qy.l(arrayList2, oz.q.K0(strSubstring2) ? null : defpackage.e.m(strValueOf, strSubstring2));
                                            }
                                        }
                                    }
                                    lVar = new qy.l(arrayList2, null);
                                }
                            }
                            List list4 = (List) lVar.f48495a;
                            String str2 = (String) lVar.f48496b;
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                nz.g gVar2 = new nz.g(nz.n.R(nz.n.R(ry.m.g0(bVar3.f59292e), new c3(8)), new gh.g(bVar3, (String) it3.next(), 5)));
                                while (gVar2.hasNext()) {
                                    linkedHashSet2.add(((CharacterStroke) gVar2.next()).getCharacter());
                                }
                            }
                            if (str2 != null) {
                                String str3 = oz.q.K0(str2) ? null : str2;
                                if (str3 != null) {
                                    nz.g gVar3 = new nz.g(nz.n.R(nz.n.R(ry.m.g0(bVar3.f59292e), new c3(9)), new gh.g(bVar3, str3, 6)));
                                    while (gVar3.hasNext()) {
                                        linkedHashSet2.add(((CharacterStroke) gVar3.next()).getCharacter());
                                    }
                                }
                            }
                            listA1 = ry.m.a1(ry.m.U0(linkedHashSet2, 120));
                            list = listA1;
                        }
                    } else {
                        list = listA1;
                    }
                    String strY0 = ry.m.y0(list, ";", null, null, null, 62);
                    courseCharacterGroup = new CourseCharacterGroup(0L, 0, strY0, "搜索结果", strY0, "搜索结果");
                }
                i1 i1Var3 = bVar3.f59290c;
                do {
                    value4 = i1Var3.getValue();
                } while (!i1Var3.j(value4, ((zr.v) value4) instanceof zr.u ? new zr.u(str, courseCharacterGroup) : new zr.u(str, courseCharacterGroup)));
                return b0.f48488a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:3: B:65:0x01ab->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab A[LOOP:0: B:34:0x00a5->B:36:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:60:0x019c  */
    /* JADX WARN: Code duplicated, block: B:61:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x0217  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v19, types: [js.z] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21, types: [js.a0] */
    /* JADX WARN: Type inference failed for: r7v23 */
    public Object f(tt.a aVar, vy.d dVar) {
        js.d dVar2;
        js.c cVar;
        List levels;
        js.c cVar2;
        long jLongValue;
        Object value;
        boolean z11;
        js.v vVar;
        List list;
        Long l9;
        js.u uVar;
        List<js.b0> list2;
        int i11;
        int iW;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        js.z zVar;
        ArrayList arrayList2;
        LessonState lessonState;
        int size;
        int i12;
        LessonState state;
        LessonState lessonState2;
        boolean z12;
        ?? A;
        ChineseToneLesson chineseToneLesson;
        ChineseToneLesson chineseToneLesson2;
        switch (this.f3766a) {
            case 6:
                js.g gVar = (js.g) this.f3767b;
                i1 i1Var = gVar.f36761d;
                if (dVar instanceof js.d) {
                    dVar2 = (js.d) dVar;
                    int i13 = dVar2.f36744e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        dVar2.f36744e = i13 - Integer.MIN_VALUE;
                    } else {
                        dVar2 = new js.d(this, dVar);
                    }
                } else {
                    dVar2 = new js.d(this, dVar);
                }
                Object obj = dVar2.f36742c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = dVar2.f36744e;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    js.c cVar3 = (js.c) i1Var.getValue();
                    if (cVar3 instanceof js.b) {
                        List list3 = ((js.b) cVar3).f36737a;
                        dVar2.f36740a = cVar3;
                        dVar2.f36744e = 1;
                        Object objA = js.g.a(gVar, list3, dVar2);
                        if (objA == aVar2) {
                            return aVar2;
                        }
                        cVar = cVar3;
                        obj = objA;
                    }
                    return b0.f48488a;
                }
                if (i14 == 1) {
                    cVar = dVar2.f36740a;
                    com.bumptech.glide.e.F(obj);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    levels = dVar2.f36741b;
                    cVar2 = dVar2.f36740a;
                    com.bumptech.glide.e.F(obj);
                }
                jLongValue = ((Number) obj).longValue();
                do {
                    value = i1Var.getValue();
                    z11 = ((js.b) cVar2).f36738b;
                    kotlin.jvm.internal.m.f(levels, "levels");
                } while (!i1Var.j(value, new js.b(jLongValue, levels, z11)));
                return b0.f48488a;
                List list4 = (List) obj;
                dVar2.f36740a = cVar;
                dVar2.f36741b = list4;
                dVar2.f36744e = 2;
                Object objB = js.g.b(gVar, list4, dVar2);
                if (objB == aVar2) {
                    return aVar2;
                }
                levels = list4;
                obj = objB;
                cVar2 = cVar;
                jLongValue = ((Number) obj).longValue();
                do {
                    value = i1Var.getValue();
                    z11 = ((js.b) cVar2).f36738b;
                    kotlin.jvm.internal.m.f(levels, "levels");
                } while (!i1Var.j(value, new js.b(jLongValue, levels, z11)));
                return b0.f48488a;
            default:
                js.w wVar = (js.w) this.f3767b;
                ChineseToneUnit chineseToneUnit = wVar.f36840a;
                g0 g0Var = wVar.f36841b;
                i1 i1Var2 = wVar.f36843d;
                if (dVar instanceof js.v) {
                    vVar = (js.v) dVar;
                    int i15 = vVar.f36839d;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        vVar.f36839d = i15 - Integer.MIN_VALUE;
                    } else {
                        vVar = new js.v(this, dVar);
                    }
                } else {
                    vVar = new js.v(this, dVar);
                }
                Object objA2 = vVar.f36837b;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = vVar.f36839d;
                if (i16 != 0) {
                    if (i16 == 1) {
                        com.bumptech.glide.e.F(objA2);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = vVar.f36836a;
                        com.bumptech.glide.e.F(objA2);
                    }
                    l9 = (Long) objA2;
                    uVar = (js.u) i1Var2.getValue();
                    if (uVar instanceof js.t) {
                        js.t tVar = (js.t) uVar;
                        list2 = tVar.f36834b;
                        if (!list2.isEmpty()) {
                            i11 = 10;
                            iW = ry.x.W(ry.n.W(list, 10));
                            if (iW < 16) {
                                iW = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iW);
                            for (Object obj2 : list) {
                                linkedHashMap.put(Long.valueOf(((ChineseToneLesson) obj2).getLessonId()), obj2);
                            }
                            arrayList = new ArrayList(ry.n.W(list2, 10));
                            for (js.b0 b0Var : list2) {
                                if (b0Var instanceof a0) {
                                    A = (a0) b0Var;
                                    ChineseToneLesson chineseToneLesson3 = A.f36736a;
                                    chineseToneLesson2 = (ChineseToneLesson) linkedHashMap.get(Long.valueOf(chineseToneLesson3.getLessonId()));
                                    if (chineseToneLesson2 == null && chineseToneLesson2.getState() != chineseToneLesson3.getState()) {
                                        ChineseToneLesson lesson = chineseToneLesson3.copy((16383 & 1) != 0 ? chineseToneLesson3.lessonId : 0L, (16383 & 2) != 0 ? chineseToneLesson3.lessonName : null, (16383 & 4) != 0 ? chineseToneLesson3.description : null, (16383 & 8) != 0 ? chineseToneLesson3.tDescription : null, (16383 & 16) != 0 ? chineseToneLesson3.wordList : null, (16383 & 32) != 0 ? chineseToneLesson3.sentenceList : null, (16383 & 64) != 0 ? chineseToneLesson3.characterList : null, (16383 & 128) != 0 ? chineseToneLesson3.repeatRegex : null, (16383 & 256) != 0 ? chineseToneLesson3.lastRegex : null, (16383 & 512) != 0 ? chineseToneLesson3.challengeRegex : null, (16383 & 1024) != 0 ? chineseToneLesson3.levelId : 0L, (16383 & 2048) != 0 ? chineseToneLesson3.unitId : 0L, (16383 & 4096) != 0 ? chineseToneLesson3.sortIndex : 0, (16383 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? chineseToneLesson3.normalRegex : null, (16383 & 16384) != 0 ? chineseToneLesson3.state : chineseToneLesson2.getState());
                                        kotlin.jvm.internal.m.f(lesson, "lesson");
                                        A = new a0(lesson);
                                    }
                                } else {
                                    if (b0Var instanceof js.z) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    zVar = (js.z) b0Var;
                                    List<ChineseToneLesson> list5 = zVar.f36857b;
                                    arrayList2 = new ArrayList(ry.n.W(list5, i11));
                                    for (ChineseToneLesson chineseToneLessonCopy : list5) {
                                        chineseToneLesson = (ChineseToneLesson) linkedHashMap.get(Long.valueOf(chineseToneLessonCopy.getLessonId()));
                                        if (chineseToneLesson == null && chineseToneLesson.getState() != chineseToneLessonCopy.getState()) {
                                            chineseToneLessonCopy = chineseToneLessonCopy.copy((16383 & 1) != 0 ? chineseToneLessonCopy.lessonId : 0L, (16383 & 2) != 0 ? chineseToneLessonCopy.lessonName : null, (16383 & 4) != 0 ? chineseToneLessonCopy.description : null, (16383 & 8) != 0 ? chineseToneLessonCopy.tDescription : null, (16383 & 16) != 0 ? chineseToneLessonCopy.wordList : null, (16383 & 32) != 0 ? chineseToneLessonCopy.sentenceList : null, (16383 & 64) != 0 ? chineseToneLessonCopy.characterList : null, (16383 & 128) != 0 ? chineseToneLessonCopy.repeatRegex : null, (16383 & 256) != 0 ? chineseToneLessonCopy.lastRegex : null, (16383 & 512) != 0 ? chineseToneLessonCopy.challengeRegex : null, (16383 & 1024) != 0 ? chineseToneLessonCopy.levelId : 0L, (16383 & 2048) != 0 ? chineseToneLessonCopy.unitId : 0L, (16383 & 4096) != 0 ? chineseToneLessonCopy.sortIndex : 0, (16383 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? chineseToneLessonCopy.normalRegex : null, (16383 & 16384) != 0 ? chineseToneLessonCopy.state : chineseToneLesson.getState());
                                        }
                                        arrayList2.add(chineseToneLessonCopy);
                                    }
                                    if (arrayList2.isEmpty()) {
                                        lessonState = LessonState.StateLocked;
                                    } else if (arrayList2.isEmpty()) {
                                        lessonState = LessonState.StateOpen;
                                    } else {
                                        size = arrayList2.size();
                                        i12 = 0;
                                        while (true) {
                                            if (i12 < size) {
                                                Object obj3 = arrayList2.get(i12);
                                                i12++;
                                                state = ((ChineseToneLesson) obj3).getState();
                                                lessonState2 = LessonState.StateLocked;
                                                if (state == lessonState2) {
                                                    lessonState = lessonState2;
                                                }
                                            } else {
                                                lessonState = LessonState.StateOpen;
                                            }
                                        }
                                    }
                                    if (zVar.f36859d == LessonState.StateLocked || lessonState != LessonState.StateOpen) {
                                        z12 = zVar.f36858c;
                                    } else {
                                        z12 = true;
                                    }
                                    A = js.z.a(zVar, arrayList2, z12, lessonState, 1);
                                }
                                arrayList.add(A);
                                i11 = 10;
                            }
                            list2 = arrayList;
                        }
                        js.t tVarA = js.t.a(tVar, list2, l9, 1);
                        i1Var2.getClass();
                        i1Var2.l(null, tVarA);
                    } else {
                        js.t tVar2 = new js.t(chineseToneUnit, js.w.a(wVar, list), l9);
                        i1Var2.getClass();
                        i1Var2.l(null, tVar2);
                    }
                    return b0.f48488a;
                }
                com.bumptech.glide.e.F(objA2);
                List<ChineseToneLesson> lessons = chineseToneUnit.getLessons();
                vVar.f36839d = 1;
                objA2 = ((ds.g) g0Var).a(lessons, vVar);
                if (objA2 == aVar3) {
                    return aVar3;
                }
                List list6 = (List) objA2;
                vVar.f36836a = list6;
                vVar.f36839d = 2;
                Object objB2 = ((ds.g) g0Var).b(vVar);
                if (objB2 == aVar3) {
                    return aVar3;
                }
                list = list6;
                objA2 = objB2;
                l9 = (Long) objA2;
                uVar = (js.u) i1Var2.getValue();
                if (uVar instanceof js.t) {
                    js.t tVar3 = (js.t) uVar;
                    list2 = tVar3.f36834b;
                    if (!list2.isEmpty()) {
                        i11 = 10;
                        iW = ry.x.W(ry.n.W(list, 10));
                        if (iW < 16) {
                            iW = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iW);
                        while (r4.hasNext()) {
                            linkedHashMap.put(Long.valueOf(((ChineseToneLesson) obj2).getLessonId()), obj2);
                        }
                        arrayList = new ArrayList(ry.n.W(list2, 10));
                        while (r2.hasNext()) {
                            if (b0Var instanceof a0) {
                                A = (a0) b0Var;
                                ChineseToneLesson chineseToneLesson4 = A.f36736a;
                                chineseToneLesson2 = (ChineseToneLesson) linkedHashMap.get(Long.valueOf(chineseToneLesson4.getLessonId()));
                                if (chineseToneLesson2 == null) {
                                }
                            } else {
                                if (b0Var instanceof js.z) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zVar = (js.z) b0Var;
                                List<ChineseToneLesson> list7 = zVar.f36857b;
                                arrayList2 = new ArrayList(ry.n.W(list7, i11));
                                while (r11.hasNext()) {
                                    chineseToneLesson = (ChineseToneLesson) linkedHashMap.get(Long.valueOf(chineseToneLessonCopy.getLessonId()));
                                    if (chineseToneLesson == null) {
                                    }
                                    arrayList2.add(chineseToneLessonCopy);
                                }
                                if (arrayList2.isEmpty()) {
                                    lessonState = LessonState.StateLocked;
                                } else if (arrayList2.isEmpty()) {
                                    lessonState = LessonState.StateOpen;
                                } else {
                                    size = arrayList2.size();
                                    i12 = 0;
                                    while (true) {
                                        if (i12 < size) {
                                            Object obj4 = arrayList2.get(i12);
                                            i12++;
                                            state = ((ChineseToneLesson) obj4).getState();
                                            lessonState2 = LessonState.StateLocked;
                                            if (state == lessonState2) {
                                                lessonState = lessonState2;
                                            }
                                        } else {
                                            lessonState = LessonState.StateOpen;
                                        }
                                    }
                                }
                                if (zVar.f36859d == LessonState.StateLocked) {
                                    z12 = zVar.f36858c;
                                } else {
                                    z12 = zVar.f36858c;
                                }
                                A = js.z.a(zVar, arrayList2, z12, lessonState, 1);
                            }
                            arrayList.add(A);
                            i11 = 10;
                        }
                        list2 = arrayList;
                    }
                    js.t tVarA2 = js.t.a(tVar3, list2, l9, 1);
                    i1Var2.getClass();
                    i1Var2.l(null, tVarA2);
                } else {
                    js.t tVar4 = new js.t(chineseToneUnit, js.w.a(wVar, list), l9);
                    i1Var2.getClass();
                    i1Var2.l(null, tVar4);
                }
                return b0.f48488a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(boolean z11, vy.d dVar) {
        gp.v vVar;
        gp.w wVar = (gp.w) this.f3767b;
        if (dVar instanceof gp.v) {
            vVar = (gp.v) dVar;
            int i11 = vVar.f29518d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f29518d = i11 - Integer.MIN_VALUE;
            } else {
                vVar = new gp.v(this, dVar);
            }
        } else {
            vVar = new gp.v(this, dVar);
        }
        Object obj = vVar.f29516b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = vVar.f29518d;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (z11) {
                vt.c cVar = wVar.f29525b;
                vVar.f29515a = z11;
                vVar.f29518d = 1;
                ((vt.d) cVar).i(vVar);
                if (b0Var != aVar) {
                }
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        z11 = vVar.f29515a;
        com.bumptech.glide.e.F(obj);
        n0 n0Var = wVar.f29527d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        vVar.f29515a = z11;
        vVar.f29518d = 2;
        o0 o0Var = (o0) n0Var;
        o0Var.getClass();
        yz.f fVar = rz.o0.f50940a;
        Object objM = e0.M(yz.e.f58387a, new h0(o0Var, jCurrentTimeMillis, null, 11), vVar);
        if (objM != aVar) {
            objM = b0Var;
        }
        return objM == aVar ? aVar : b0Var;
    }

    public b(tz.w channel) {
        this.f3766a = 10;
        kotlin.jvm.internal.m.f(channel, "channel");
        this.f3767b = channel;
    }
}
