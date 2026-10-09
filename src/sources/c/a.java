package c;

import a2.g;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewParent;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.bumptech.glide.e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.BillingPageRecomConfig;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.R;
import com.lingodeer.data.model.BookmarkFolder;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.data.model.WordSentenceSourceKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e6.h0;
import e6.n;
import f0.h1;
import fb.l;
import fz.c;
import gb.o;
import j3.h;
import j3.p0;
import j3.v;
import j9.d0;
import j9.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m;
import l1.s;
import l1.x1;
import mh.b;
import mh.f;
import mh.i;
import nv.p;
import oz.q;
import ry.x;
import s0.b1;
import t1.d;
import tg.i0;
import tg.k0;
import th.j;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean A(int i11) {
        int type = Character.getType(i11);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void B(Context context) {
        m.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        m.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            l lVarB = l.b();
            String[] strArr = o.f28950a;
            lVarB.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            m.e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            m.e(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr2 = o.f28950a;
            int iW = x.W(strArr2.length);
            if (iW < 16) {
                iW = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : x.d0(linkedHashMap, new qy.l(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        l lVarB2 = l.b();
                        String[] strArr3 = o.f28950a;
                        file3.toString();
                        lVarB2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    l lVarB3 = l.b();
                    String[] strArr4 = o.f28950a;
                    lVarB3.getClass();
                }
            }
        }
    }

    public static final ArrayList C(Map map, c cVar) {
        m.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            m.c(null);
            throw null;
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) cVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final wy.a D(d dVar, xy.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i11 = h0Var.f24928b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h0Var.f24928b = i11 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(cVar);
            }
        } else {
            h0Var = new h0(cVar);
        }
        Object obj = h0Var.f24927a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = h0Var.f24928b;
        if (i12 == 0) {
            e.F(obj);
            n nVar = (n) h0Var.getContext().get(e6.x.f25076a);
            if (nVar == null) {
                throw new IllegalStateException("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
            }
            h0Var.f24928b = 1;
            if (nVar.a(dVar, h0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0201  */
    /* JADX WARN: Code duplicated, block: B:96:0x0258  */
    /* JADX WARN: Code duplicated, block: B:9:0x0045  */
    public static final ArrayList G(int i11, List list) {
        boolean z11;
        String str;
        String str2 = "<this>";
        m.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                ns.o.V();
                throw null;
            }
            CourseWord courseWord = (CourseWord) obj;
            m.f(courseWord, str2);
            if (xt.d.u(i11)) {
                str = str2;
                z11 = false;
            } else {
                int i14 = 0;
                int i15 = 0;
                for (Object obj2 : list) {
                    int i16 = i14 + 1;
                    if (i14 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    CourseWord courseWord2 = (CourseWord) obj2;
                    if (i14 < i12 && m.a(courseWord2.getWord(), "\"")) {
                        i15++;
                    }
                    i14 = i16;
                }
                z11 = true;
                if ((courseWord.getWordType() == 1 && !m.a(courseWord.getWord(), "_____")) || i13 >= list.size() || ((CourseWord) list.get(i13)).getWordType() != 1 || m.a(((CourseWord) list.get(i13)).getWord(), "_____") || m.a(((CourseWord) list.get(i13)).getWord(), " ") || (ry.l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(i11)) && ns.o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(((CourseWord) list.get(i13)).getWord()))) {
                    boolean z12 = !m.a(courseWord.getWord(), "\"") || (i15 + 1) % 2 == 0;
                    if (!oz.x.k0(courseWord.getWord(), "'", false) || m.a(courseWord.getWord(), "po'")) {
                        str = str2;
                        if (oz.x.k0(courseWord.getWord(), "-", false)) {
                            z11 = false;
                        } else if (ry.l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(i11))) {
                            if (courseWord.getWordType() != 1 || i13 >= list.size() || ((CourseWord) list.get(i13)).getWordType() != 1 || m.a(((CourseWord) list.get(i13)).getWord(), "-") || m.a(((CourseWord) list.get(i13)).getWord(), "_____")) {
                                if (courseWord.getWord().length() > 0) {
                                    List listL = ns.o.L("'", "-", "(", "{");
                                    String strSubstring = courseWord.getWord().substring(courseWord.getWord().length() - 1, courseWord.getWord().length());
                                    m.e(strSubstring, "substring(...)");
                                    if (!listL.contains(strSubstring)) {
                                        if (courseWord.getWordType() != 1 || i13 >= list.size() || !ry.l.D(new String[]{"-"}, ((CourseWord) list.get(i13)).getWord())) {
                                            z11 = z12;
                                        }
                                    }
                                    z11 = false;
                                } else {
                                    if (courseWord.getWordType() != 1) {
                                    }
                                    z11 = z12;
                                }
                            } else if (ns.o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(((CourseWord) list.get(i13)).getWord())) {
                                z11 = z12;
                            } else {
                                z11 = false;
                            }
                        } else if (m.a(courseWord.getWord(), "¿") || m.a(courseWord.getWord(), "¡") || (i11 == 11 && (courseWord.getWordId() == 216 || courseWord.getWordId() == 217))) {
                            z11 = false;
                        } else {
                            z11 = z12;
                        }
                    } else {
                        str = str2;
                        z11 = false;
                    }
                } else if (m.a(((CourseWord) list.get(i13)).getWord(), "–")) {
                    str = str2;
                } else {
                    str = str2;
                    z11 = false;
                }
            }
            arrayList.add(courseWord);
            if (z11) {
                arrayList.add(WordSentenceSourceKt.getSpaceCourseWord());
            }
            i12 = i13;
            str2 = str;
        }
        int i17 = 0;
        if (m.a(((CourseWord) ry.m.z0(arrayList)).getWord(), " ")) {
            arrayList.remove(ns.o.A(arrayList));
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i18 = 0;
        while (i17 < size) {
            Object obj3 = arrayList.get(i17);
            i17++;
            int i19 = i18 + 1;
            if (i18 < 0) {
                ns.o.V();
                throw null;
            }
            arrayList2.add(f((CourseWord) obj3, arrayList, i18, i11));
            i18 = i19;
        }
        return arrayList2;
    }

    public static final i H(PdLesson pdLesson) {
        Object obj;
        Object next;
        Object next2;
        m.f(pdLesson, "<this>");
        Long lessonId = pdLesson.getLessonId();
        m.e(lessonId, "getLessonId(...)");
        long jLongValue = lessonId.longValue();
        String title = pdLesson.getTitle();
        String str = BuildConfig.VERSION_NAME;
        String str2 = title == null ? BuildConfig.VERSION_NAME : title;
        String titleTranslation = pdLesson.getTitleTranslation();
        String str3 = titleTranslation == null ? BuildConfig.VERSION_NAME : titleTranslation;
        Long lessonId2 = pdLesson.getLessonId();
        m.e(lessonId2, "getLessonId(...)");
        String strE = j.e(lessonId2.longValue());
        mh.a aVar = b.Companion;
        String difficuty = pdLesson.getDifficuty();
        if (difficuty != null) {
            str = difficuty;
        }
        aVar.getClass();
        Iterator<E> it = b.c().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!oz.x.l0(((b) next).b(), str, true));
        b bVar = (b) next;
        if (bVar == null) {
            bVar = b.BEGINNER_I;
        }
        String category = pdLesson.getCategory();
        m.e(category, "getCategory(...)");
        List<String> listW0 = q.W0(category, new String[]{"/"}, 0, 6);
        ArrayList arrayList = new ArrayList(ry.n.W(listW0, 10));
        for (String value : listW0) {
            mh.d.Companion.getClass();
            m.f(value, "value");
            Iterator<E> it2 = mh.d.b().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!oz.x.l0(((mh.d) next2).a(), value, true));
            mh.d dVar = (mh.d) next2;
            if (dVar == null) {
                dVar = mh.d.OTHERS;
            }
            arrayList.add(dVar);
        }
        f.Companion.getClass();
        for (Object obj2 : f.b()) {
            if (oz.x.l0(((f) obj2).a(), "available", true)) {
                obj = obj2;
                break;
            }
        }
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = f.NOT_STUDY;
        }
        return new i(jLongValue, str2, str3, strE, bVar, arrayList, fVar, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r9 == r2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(xq.c r7, android.content.Context r8, xy.c r9) {
        /*
            boolean r0 = r9 instanceof e6.i0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r9
            e6.i0 r0 = (e6.i0) r0
            int r2 = r0.f24941e
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.f24941e = r2
            goto L18
        L13:
            e6.i0 r0 = new e6.i0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f24940d
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r0.f24941e
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            java.util.Iterator r7 = r0.f24939c
            java.util.Iterator r7 = (java.util.Iterator) r7
            android.content.Context r8 = r0.f24938b
            xq.c r3 = r0.f24937a
            com.bumptech.glide.e.F(r9)
            goto L63
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            android.content.Context r8 = r0.f24938b
            xq.c r7 = r0.f24937a
            com.bumptech.glide.e.F(r9)
            goto L5b
        L42:
            com.bumptech.glide.e.F(r9)
            e6.o0 r9 = new e6.o0
            r9.<init>(r8)
            java.lang.Class r3 = r7.getClass()
            r0.f24937a = r7
            r0.f24938b = r8
            r0.f24941e = r5
            java.io.Serializable r9 = r9.a(r3, r0)
            if (r9 != r2) goto L5b
            goto L95
        L5b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r3 = r7
            r7 = r9
        L63:
            boolean r9 = r7.hasNext()
            qy.b0 r5 = qy.b0.f48488a
            if (r9 == 0) goto L9e
            java.lang.Object r9 = r7.next()
            e6.c r9 = (e6.c) r9
            r0.f24937a = r3
            r0.f24938b = r8
            r6 = r7
            java.util.Iterator r6 = (java.util.Iterator) r6
            r0.f24939c = r6
            r0.f24941e = r4
            r3.getClass()
            boolean r6 = r9 instanceof e6.c
            if (r6 == 0) goto L96
            int r9 = r9.f24881a
            if (r1 > r9) goto L8a
            r6 = -1
            if (r9 < r6) goto L96
        L8a:
            java.lang.Object r9 = xq.c.V(r3, r8, r9, r0)
            wy.a r6 = wy.a.COROUTINE_SUSPENDED
            if (r9 != r6) goto L93
            r5 = r9
        L93:
            if (r5 != r2) goto L63
        L95:
            return r2
        L96:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid Glance ID"
            r7.<init>(r8)
            throw r7
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.I(xq.c, android.content.Context, xy.c):java.lang.Object");
    }

    public static final g a(String str) {
        return new g(qx.b.H(str));
    }

    public static long b(float f5) {
        return (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b A[LOOP:1: B:55:0x0120->B:60:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:81:0x019d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x023e  */
    /* JADX WARN: Code duplicated, block: B:99:0x017f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r0v5, types: [vg.l] */
    public static final void c(i0 Text, vg.m text, r rVar, c cVar, boolean z11, int i11, int i12, l1.n nVar, int i13, int i14) {
        r rVar2;
        int i15;
        r rVar3;
        Object objQ;
        l1.g gVar;
        c cVar2;
        vg.n nVar2;
        int i16;
        boolean z12;
        boolean zF;
        Object objQ2;
        j3.e eVar;
        int i17;
        int i18;
        String tag;
        String strR0;
        Object obj;
        Object obj2;
        ?? r9;
        Object objA;
        Iterator it;
        Object next;
        Iterator it2;
        h hVar;
        boolean z13;
        Object objQ3;
        Map map;
        r rVar4;
        int i19;
        c cVar3;
        r rVar5;
        boolean z14;
        int i21;
        x1 x1VarT;
        m.f(Text, "$this$Text");
        m.f(text, "text");
        Map map2 = text.f54044b;
        s sVar = (s) nVar;
        sVar.f0(659990650);
        int i22 = (i13 & 6) == 0 ? (sVar.f(Text) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i22 |= sVar.f(text) ? 32 : 16;
        }
        int i23 = i14 & 2;
        if (i23 == 0) {
            if ((i13 & 384) == 0) {
                rVar2 = rVar;
                i22 |= sVar.f(rVar2) ? 256 : 128;
            }
            i15 = i22 | 1797120;
            if ((599187 & i15) == 599186 || !sVar.F()) {
                if (i23 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                sVar.d0(730289910);
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = new st.a(29);
                    sVar.o0(objQ);
                }
                cVar2 = (c) objQ;
                sVar.p(false);
                nVar2 = k0.b(Text, sVar).f52306h;
                long jC = tg.h0.c(Text, sVar);
                sVar.d0(730297126);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zF = z12 | sVar.f(nVar2) | sVar.e(jC);
                objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    if (nVar2 == null) {
                        nVar2 = vg.n.f54045i;
                    }
                    vg.n nVarA = nVar2.a();
                    eVar = new j3.e();
                    h hVar2 = text.f54043a;
                    eVar.c(hVar2);
                    for (j3.f fVar : hVar2.b(hVar2.f35700b.length(), vg.l.f54040b)) {
                        String str = vg.l.f54040b;
                        Object obj3 = fVar.f35689a;
                        i17 = fVar.f35691c;
                        i18 = fVar.f35690b;
                        tag = (String) obj3;
                        m.f(tag, "tag");
                        strR0 = q.R0(tag, "format:");
                        obj = null;
                        if (strR0 == tag) {
                            it = ((List) vg.l.f54041c.getValue()).iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                it2 = it;
                                if (m.a(((vg.l) next).f54042a, tag)) {
                                    obj = next;
                                    break;
                                }
                                it = it2;
                            }
                            obj = (vg.l) obj;
                        } else {
                            obj2 = map2.get(strR0);
                            if (obj2 instanceof vg.l) {
                                obj = (vg.l) obj2;
                            }
                        }
                        r9 = obj;
                        if (r9 == 0 && (objA = r9.a(nVarA)) != null) {
                            if (objA instanceof p0) {
                                eVar.a((p0) objA, i18, i17);
                            } else if (objA instanceof v) {
                                eVar.f35685c.add(new j3.d(i18, i17, 8, (v) objA, null));
                            }
                        }
                    }
                    objQ2 = eVar.j();
                    sVar.o0(objQ2);
                }
                hVar = (h) objQ2;
                sVar.p(false);
                sVar.d0(730303487);
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ3 = sVar.Q();
                if (z13 || objQ3 == gVar) {
                    objQ3 = x.i0(nz.n.X(x.T(map2), new st.a(28)));
                    sVar.o0(objQ3);
                }
                map = (Map) objQ3;
                sVar.p(false);
                if (map.isEmpty()) {
                    sVar.d0(1164651630);
                    tg.h0.a(Text, hVar, null, cVar2, null, sVar, (i15 & 7182) | ((i15 >> 3) & 57344) | (458752 & (i15 << 3)) | (3670016 & i15), 66);
                    sVar.p(false);
                    rVar4 = rVar3;
                } else {
                    sVar.d0(1164825540);
                    r rVar6 = rVar3;
                    j0.c.a(rVar6, null, t1.e.d(-457052428, new b1(map, Text, hVar, cVar2, 1), sVar), sVar, ((i15 >> 6) & 14) | 3072, 6);
                    rVar4 = rVar6;
                    sVar.p(false);
                }
                i19 = Integer.MAX_VALUE;
                cVar3 = cVar2;
                rVar5 = rVar4;
                z14 = true;
                i21 = 1;
            } else {
                sVar.W();
                cVar3 = cVar;
                i19 = i12;
                rVar5 = rVar2;
                z14 = z11;
                i21 = i11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new iu.a(Text, text, rVar5, cVar3, z14, i21, i19, i13, i14);
            }
        }
        i22 |= 384;
        rVar2 = rVar;
        i15 = i22 | 1797120;
        if ((599187 & i15) == 599186) {
            if (i23 != 0) {
                rVar3 = z1.o.f58481a;
            } else {
                rVar3 = rVar2;
            }
            sVar.d0(730289910);
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new st.a(29);
                sVar.o0(objQ);
            }
            cVar2 = (c) objQ;
            sVar.p(false);
            nVar2 = k0.b(Text, sVar).f52306h;
            long jC2 = tg.h0.c(Text, sVar);
            sVar.d0(730297126);
            i16 = i15 & 112;
            if (i16 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            zF = z12 | sVar.f(nVar2) | sVar.e(jC2);
            objQ2 = sVar.Q();
            if (zF) {
                if (nVar2 == null) {
                    nVar2 = vg.n.f54045i;
                }
                vg.n nVarA2 = nVar2.a();
                eVar = new j3.e();
                h hVar3 = text.f54043a;
                eVar.c(hVar3);
                while (r4.hasNext()) {
                    String str2 = vg.l.f54040b;
                    Object obj4 = fVar.f35689a;
                    i17 = fVar.f35691c;
                    i18 = fVar.f35690b;
                    tag = (String) obj4;
                    m.f(tag, "tag");
                    strR0 = q.R0(tag, "format:");
                    obj = null;
                    if (strR0 == tag) {
                        it = ((List) vg.l.f54041c.getValue()).iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            it2 = it;
                            if (m.a(((vg.l) next).f54042a, tag)) {
                                obj = next;
                                break;
                            }
                            it = it2;
                        }
                        obj = (vg.l) obj;
                    } else {
                        obj2 = map2.get(strR0);
                        if (obj2 instanceof vg.l) {
                            obj = (vg.l) obj2;
                        }
                    }
                    r9 = obj;
                    if (r9 == 0) {
                        if (objA instanceof p0) {
                            eVar.a((p0) objA, i18, i17);
                        } else if (objA instanceof v) {
                            eVar.f35685c.add(new j3.d(i18, i17, 8, (v) objA, null));
                        }
                    }
                }
                objQ2 = eVar.j();
                sVar.o0(objQ2);
            } else {
                if (nVar2 == null) {
                    nVar2 = vg.n.f54045i;
                }
                vg.n nVarA3 = nVar2.a();
                eVar = new j3.e();
                h hVar4 = text.f54043a;
                eVar.c(hVar4);
                while (r4.hasNext()) {
                    String str3 = vg.l.f54040b;
                    Object obj5 = fVar.f35689a;
                    i17 = fVar.f35691c;
                    i18 = fVar.f35690b;
                    tag = (String) obj5;
                    m.f(tag, "tag");
                    strR0 = q.R0(tag, "format:");
                    obj = null;
                    if (strR0 == tag) {
                        it = ((List) vg.l.f54041c.getValue()).iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            it2 = it;
                            if (m.a(((vg.l) next).f54042a, tag)) {
                                obj = next;
                                break;
                            }
                            it = it2;
                        }
                        obj = (vg.l) obj;
                    } else {
                        obj2 = map2.get(strR0);
                        if (obj2 instanceof vg.l) {
                            obj = (vg.l) obj2;
                        }
                    }
                    r9 = obj;
                    if (r9 == 0) {
                        if (objA instanceof p0) {
                            eVar.a((p0) objA, i18, i17);
                        } else if (objA instanceof v) {
                            eVar.f35685c.add(new j3.d(i18, i17, 8, (v) objA, null));
                        }
                    }
                }
                objQ2 = eVar.j();
                sVar.o0(objQ2);
            }
            hVar = (h) objQ2;
            sVar.p(false);
            sVar.d0(730303487);
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objQ3 = sVar.Q();
            if (z13) {
                objQ3 = x.i0(nz.n.X(x.T(map2), new st.a(28)));
                sVar.o0(objQ3);
            } else {
                objQ3 = x.i0(nz.n.X(x.T(map2), new st.a(28)));
                sVar.o0(objQ3);
            }
            map = (Map) objQ3;
            sVar.p(false);
            if (map.isEmpty()) {
                sVar.d0(1164651630);
                tg.h0.a(Text, hVar, null, cVar2, null, sVar, (i15 & 7182) | ((i15 >> 3) & 57344) | (458752 & (i15 << 3)) | (3670016 & i15), 66);
                sVar.p(false);
                rVar4 = rVar3;
            } else {
                sVar.d0(1164825540);
                r rVar7 = rVar3;
                j0.c.a(rVar7, null, t1.e.d(-457052428, new b1(map, Text, hVar, cVar2, 1), sVar), sVar, ((i15 >> 6) & 14) | 3072, 6);
                rVar4 = rVar7;
                sVar.p(false);
            }
            i19 = Integer.MAX_VALUE;
            cVar3 = cVar2;
            rVar5 = rVar4;
            z14 = true;
            i21 = 1;
        } else {
            if (i23 != 0) {
                rVar3 = z1.o.f58481a;
            } else {
                rVar3 = rVar2;
            }
            sVar.d0(730289910);
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new st.a(29);
                sVar.o0(objQ);
            }
            cVar2 = (c) objQ;
            sVar.p(false);
            nVar2 = k0.b(Text, sVar).f52306h;
            long jC3 = tg.h0.c(Text, sVar);
            sVar.d0(730297126);
            i16 = i15 & 112;
            if (i16 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            zF = z12 | sVar.f(nVar2) | sVar.e(jC3);
            objQ2 = sVar.Q();
            if (zF) {
                if (nVar2 == null) {
                    nVar2 = vg.n.f54045i;
                }
                vg.n nVarA4 = nVar2.a();
                eVar = new j3.e();
                h hVar5 = text.f54043a;
                eVar.c(hVar5);
                while (r4.hasNext()) {
                    String str4 = vg.l.f54040b;
                    Object obj6 = fVar.f35689a;
                    i17 = fVar.f35691c;
                    i18 = fVar.f35690b;
                    tag = (String) obj6;
                    m.f(tag, "tag");
                    strR0 = q.R0(tag, "format:");
                    obj = null;
                    if (strR0 == tag) {
                        it = ((List) vg.l.f54041c.getValue()).iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            it2 = it;
                            if (m.a(((vg.l) next).f54042a, tag)) {
                                obj = next;
                                break;
                            }
                            it = it2;
                        }
                        obj = (vg.l) obj;
                    } else {
                        obj2 = map2.get(strR0);
                        if (obj2 instanceof vg.l) {
                            obj = (vg.l) obj2;
                        }
                    }
                    r9 = obj;
                    if (r9 == 0) {
                        if (objA instanceof p0) {
                            eVar.a((p0) objA, i18, i17);
                        } else if (objA instanceof v) {
                            eVar.f35685c.add(new j3.d(i18, i17, 8, (v) objA, null));
                        }
                    }
                }
                objQ2 = eVar.j();
                sVar.o0(objQ2);
            } else {
                if (nVar2 == null) {
                    nVar2 = vg.n.f54045i;
                }
                vg.n nVarA5 = nVar2.a();
                eVar = new j3.e();
                h hVar6 = text.f54043a;
                eVar.c(hVar6);
                while (r4.hasNext()) {
                    String str5 = vg.l.f54040b;
                    Object obj7 = fVar.f35689a;
                    i17 = fVar.f35691c;
                    i18 = fVar.f35690b;
                    tag = (String) obj7;
                    m.f(tag, "tag");
                    strR0 = q.R0(tag, "format:");
                    obj = null;
                    if (strR0 == tag) {
                        it = ((List) vg.l.f54041c.getValue()).iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            it2 = it;
                            if (m.a(((vg.l) next).f54042a, tag)) {
                                obj = next;
                                break;
                            }
                            it = it2;
                        }
                        obj = (vg.l) obj;
                    } else {
                        obj2 = map2.get(strR0);
                        if (obj2 instanceof vg.l) {
                            obj = (vg.l) obj2;
                        }
                    }
                    r9 = obj;
                    if (r9 == 0) {
                        if (objA instanceof p0) {
                            eVar.a((p0) objA, i18, i17);
                        } else if (objA instanceof v) {
                            eVar.f35685c.add(new j3.d(i18, i17, 8, (v) objA, null));
                        }
                    }
                }
                objQ2 = eVar.j();
                sVar.o0(objQ2);
            }
            hVar = (h) objQ2;
            sVar.p(false);
            sVar.d0(730303487);
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objQ3 = sVar.Q();
            if (z13) {
                objQ3 = x.i0(nz.n.X(x.T(map2), new st.a(28)));
                sVar.o0(objQ3);
            } else {
                objQ3 = x.i0(nz.n.X(x.T(map2), new st.a(28)));
                sVar.o0(objQ3);
            }
            map = (Map) objQ3;
            sVar.p(false);
            if (map.isEmpty()) {
                sVar.d0(1164651630);
                tg.h0.a(Text, hVar, null, cVar2, null, sVar, (i15 & 7182) | ((i15 >> 3) & 57344) | (458752 & (i15 << 3)) | (3670016 & i15), 66);
                sVar.p(false);
                rVar4 = rVar3;
            } else {
                sVar.d0(1164825540);
                r rVar8 = rVar3;
                j0.c.a(rVar8, null, t1.e.d(-457052428, new b1(map, Text, hVar, cVar2, 1), sVar), sVar, ((i15 >> 6) & 14) | 3072, 6);
                rVar4 = rVar8;
                sVar.p(false);
            }
            i19 = Integer.MAX_VALUE;
            cVar3 = cVar2;
            rVar5 = rVar4;
            z14 = true;
            i21 = 1;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iu.a(Text, text, rVar5, cVar3, z14, i21, i19, i13, i14);
        }
    }

    public static final String d(SyllableWriteLesson syllableWriteLesson) {
        m.f(syllableWriteLesson, "<this>");
        return p.j(syllableWriteLesson.getSortIndex(), "HANDWRITING:");
    }

    public static final CourseWord f(CourseWord courseWord, List words, int i11, int i12) {
        boolean z11;
        m.f(courseWord, "<this>");
        m.f(words, "words");
        Iterator it = words.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            CourseWord courseWord2 = (CourseWord) it.next();
            if (courseWord2.getWordType() != 1 || courseWord2.isQuestionWord()) {
                break;
            }
            i13++;
        }
        if (i13 > 0) {
            z11 = false;
            for (int i14 = 0; i14 < i13; i14++) {
                if (m.a(((CourseWord) words.get(i14)).getWord(), "_____")) {
                    z11 = true;
                }
            }
        } else {
            z11 = false;
        }
        boolean zE = ks.b.e(((CourseWord) ry.m.z0(words)).getWord());
        String word = courseWord.getWord();
        try {
            if (i11 == i13 && !z11 && zE) {
                String strSubstring = courseWord.getWord().substring(0, 1);
                m.e(strSubstring, "substring(...)");
                String upperCase = strSubstring.toUpperCase(xt.d.t(i12));
                m.e(upperCase, "toUpperCase(...)");
                String strSubstring2 = courseWord.getWord().substring(1);
                m.e(strSubstring2, "substring(...)");
                word = upperCase + strSubstring2;
            } else if (i11 > i13) {
                int i15 = i11 - 1;
                CourseWord courseWord3 = (CourseWord) words.get(i15);
                while (courseWord3 != null && courseWord3.getWordType() == 1 && !courseWord3.isQuestionWord()) {
                    if (ks.b.e(courseWord3.getWord()) && !xt.d.u(i12) && zE) {
                        String strSubstring3 = courseWord.getWord().substring(0, 1);
                        m.e(strSubstring3, "substring(...)");
                        String upperCase2 = strSubstring3.toUpperCase(xt.d.t(i12));
                        m.e(upperCase2, "toUpperCase(...)");
                        String strSubstring4 = courseWord.getWord().substring(1);
                        m.e(strSubstring4, "substring(...)");
                        word = upperCase2 + strSubstring4;
                    } else {
                        i15--;
                        if (i15 >= 0) {
                            courseWord3 = (CourseWord) words.get(i15);
                        }
                    }
                    courseWord3 = null;
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return CourseWord.copy$default(courseWord, 0L, word, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, courseWord.getWord(), false, false, false, false, false, null, null, null, null, null, null, 0, -33554435, 63, null);
    }

    public static void g(t tVar, String str, c cVar, c cVar2, d dVar, int i11) {
        if ((i11 & 8) != 0) {
            cVar = null;
        }
        if ((i11 & 16) != 0) {
            cVar2 = null;
        }
        d0 d0Var = tVar.f36252f;
        d0Var.getClass();
        k9.j jVar = new k9.j((k9.i) d0Var.b(e.u(k9.i.class)), str, dVar);
        jVar.f37985h = cVar;
        jVar.f37986i = cVar2;
        jVar.f37987j = cVar;
        jVar.f37988k = cVar2;
        tVar.f36254h.add(jVar.a());
    }

    public static final o0.e h(n0.d0 d0Var, int i11, long j11, o0.l lVar, long j12, h1 h1Var, z1.i iVar, v3.m mVar, int i12, y.x xVar) {
        List list;
        Object objA = lVar.a(i11);
        List list2 = (List) xVar.b(i11);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = d0Var.a(i11);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(((w2.p0) listA.get(i13)).B(j11));
            }
            xVar.h(i11, arrayList);
            list = arrayList;
        }
        return new o0.e(i11, i12, list, j12, objA, h1Var, iVar, mVar);
    }

    public static String i() {
        String strF = FirebaseRemoteConfig.d().f("android_up_billing_model");
        return (LingoSkillApplication.f21666c.equals("default") || !q.v0("release", "debug", false)) ? strF : LingoSkillApplication.f21666c;
    }

    public static BillingPageRecomConfig j() {
        try {
            h00.s sVar = xt.c.f56291a;
            String strF = FirebaseRemoteConfig.d().f("billing_page_recom_config");
            sVar.getClass();
            return (BillingPageRecomConfig) sVar.b(BillingPageRecomConfig.Companion.serializer(), strF);
        } catch (Exception unused) {
            return new BillingPageRecomConfig(0, 0L, false, false, 15, (kotlin.jvm.internal.f) null);
        }
    }

    public static final int k(Cursor c11, String str) {
        m.f(c11, "c");
        int columnIndex = c11.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c11.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = c11.getColumnNames();
        m.c(columnNames);
        String strConcat = ".".concat(str);
        String strQ = p.q(".", str, '`');
        int length = columnNames.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str2 = columnNames[i11];
            int i13 = i12 + 1;
            if (str2.length() >= str.length() + 2 && (oz.x.k0(str2, strConcat, false) || (str2.charAt(0) == '`' && oz.x.k0(str2, strQ, false)))) {
                return i12;
            }
            i11++;
            i12 = i13;
        }
        return -1;
    }

    public static final int l(Cursor c11, String str) {
        String strB0;
        m.f(c11, "c");
        int iK = k(c11, str);
        if (iK >= 0) {
            return iK;
        }
        try {
            String[] columnNames = c11.getColumnNames();
            m.e(columnNames, "getColumnNames(...)");
            strB0 = ry.l.b0(columnNames, null, null, 63);
        } catch (Exception unused) {
            strB0 = "unknown";
        }
        throw new IllegalArgumentException(defpackage.e.n("column '", str, "' does not exist. Available columns: ", strB0));
    }

    public static final String[] m(a2.r rVar) {
        m.d(rVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((g) rVar).f309b.toArray(new String[0]);
    }

    public static Long[] n() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        if (i11 == 0) {
            return new Long[]{1L, 31L, 61L};
        }
        if (i11 == 1) {
            return new Long[]{1L, 42L, 84L};
        }
        if (i11 == 2) {
            return new Long[]{1L, 51L, 148L};
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return new Long[0];
                    }
                }
            }
            return new Long[]{9L, 53L};
        }
        return new Long[]{2L, 63L, 160L};
    }

    public static String o() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        if (i11 == 0) {
            return "1;31;61";
        }
        if (i11 == 1) {
            return "1;42;84";
        }
        if (i11 == 2) {
            return "1;51;148";
        }
        if (i11 == 4) {
            return "2;63;160";
        }
        if (i11 == 5) {
            return "9;53";
        }
        if (i11 != 47) {
            return i11 != 53 ? BuildConfig.VERSION_NAME : "9;53";
        }
        return "2;63;160";
    }

    public static ArrayList q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("s34_month_1_android");
        arrayList.add("s34_month_12_android_free_trial7");
        arrayList.add("s34_month_6_android");
        return arrayList;
    }

    public static ArrayList r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("s34_month_1_android");
        arrayList.add("s34_month_12_android");
        arrayList.add("s34_month_6_android");
        return arrayList;
    }

    public static ArrayList s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("s35_month_1_android");
        arrayList.add("s35_month_12_android_free_trial7");
        arrayList.add("s35_month_6_android");
        return arrayList;
    }

    public static ArrayList t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("s35_month_1_android");
        arrayList.add("s35_month_12_android");
        arrayList.add("s35_month_6_android");
        return arrayList;
    }

    public static ArrayList u() {
        if (FirebaseRemoteConfig.d().e("annual_product_free_trail_day_type") == 7) {
            return i().equals("S_D_1") ? s() : q();
        }
        return i().equals("S_D_1") ? t() : r();
    }

    public static MergedBillingThemeBillingPage v() {
        try {
            if (!q.v0("release", "debug", false) || LingoSkillApplication.f21667d.length() <= 0) {
                h00.s sVar = xt.c.f56291a;
                String strF = FirebaseRemoteConfig.d().f("merged_billing_theme");
                sVar.getClass();
                return (MergedBillingThemeBillingPage) sVar.b(MergedBillingThemeBillingPage.Companion.serializer(), strF);
            }
            h00.s sVar2 = xt.c.f56291a;
            String str = LingoSkillApplication.f21667d;
            sVar2.getClass();
            return (MergedBillingThemeBillingPage) sVar2.b(MergedBillingThemeBillingPage.Companion.serializer(), str);
        } catch (Exception unused) {
            return new MergedBillingThemeBillingPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, 255, (kotlin.jvm.internal.f) null);
        }
    }

    public static long w() {
        return FirebaseRemoteConfig.d().e("billing_page_countdown") * 3600000;
    }

    public static final ViewParent x(View view) {
        m.f(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static int y(int i11) {
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 32) {
            return 5;
        }
        if (i11 == 64) {
            return 6;
        }
        if (i11 == 128) {
            return 7;
        }
        if (i11 == 256) {
            return 8;
        }
        if (i11 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(p.j(i11, "type needs to be >= FIRST and <= LAST, type="));
    }

    public abstract void E(boolean z11);

    public abstract void F(boolean z11);

    public abstract TransformationMethod J(TransformationMethod transformationMethod);

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);

    public abstract boolean z();

    public static final ArrayList e(List list, Map favoriteBookmarkFolderIdsByItemId, Set availableItemIds) {
        int i11;
        m.f(list, FpIL.nEJ);
        m.f(favoriteBookmarkFolderIdsByItemId, "favoriteBookmarkFolderIdsByItemId");
        m.f(availableItemIds, "availableItemIds");
        Map mapQ = o00.a.q(new lp.j(nz.n.X(nz.n.R(x.T(favoriteBookmarkFolderIdsByItemId), new rt.q(0, availableItemIds)), new ro.e(8)), 26));
        if (favoriteBookmarkFolderIdsByItemId.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 0;
            for (Map.Entry entry : favoriteBookmarkFolderIdsByItemId.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                String str = (String) entry.getValue();
                if (availableItemIds.contains(Long.valueOf(jLongValue)) && str == null) {
                    i11++;
                }
            }
        }
        List listK = ns.o.K(new rt.r(i11, "__default_bookmark_folder__", BuildConfig.VERSION_NAME, true));
        ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BookmarkFolder bookmarkFolder = (BookmarkFolder) it.next();
            String id2 = bookmarkFolder.getId();
            String name = bookmarkFolder.getName();
            Integer num = (Integer) mapQ.get(bookmarkFolder.getId());
            arrayList.add(new rt.r(num != null ? num.intValue() : 0, id2, name, false));
        }
        return ry.m.H0(listK, arrayList);
    }
}
