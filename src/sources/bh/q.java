package bh;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseSentenceModel090;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.CourseWordModel010;
import com.lingodeer.data.model.SyllableWriteCharacter;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ot.u1;
import ot.w1;
import rt.a2;
import rt.ke;
import rt.me;
import rt.se;
import rt.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4335c;

    public /* synthetic */ q(int i11, Object obj, Object obj2) {
        this.f4333a = i11;
        this.f4334b = obj;
        this.f4335c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.lingodeer.data.model.CourseWord[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    private final Object a(Object obj, vy.d dVar) {
        ot.g gVar;
        List displaySpellCharWords;
        ?? K;
        ?? C1;
        vt.n0 n0Var = (vt.n0) ((lp.j) this.f4335c).f40203b;
        if (dVar instanceof ot.g) {
            gVar = (ot.g) dVar;
            int i11 = gVar.f45816b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f45816b = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new ot.g(this, dVar);
            }
        } else {
            gVar = new ot.g(this, dVar);
        }
        Object obj2 = gVar.f45815a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar.f45816b;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            uz.j jVar = (uz.j) this.f4334b;
            CourseSentence courseSentence = (CourseSentence) obj;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i14 = ((fr.o0) n0Var).f27733a.keyLanguage;
            int i15 = 10;
            if (i14 == 1 || i14 == 12) {
                List<CourseWord> displaySpellWords = courseSentence.getDisplaySpellWords();
                ArrayList arrayList3 = new ArrayList(ry.n.W(displaySpellWords, 10));
                long j11 = 10000;
                for (CourseWord courseWord : displaySpellWords) {
                    if (courseWord.getWordType() == i13 || kotlin.jvm.internal.m.a(courseWord.getWord(), " ")) {
                        K = ns.o.K(courseWord);
                    } else {
                        ArrayList arrayListD = pt.g.d(courseWord);
                        K = new ArrayList(ry.n.W(arrayListD, i15));
                        int size = arrayListD.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj3 = arrayListD.get(i16);
                            i16++;
                            long j12 = j11 + 1;
                            K.add(CourseWord.copy$default((CourseWord) obj3, j12, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                            j11 = j12;
                        }
                    }
                    arrayList3.add(K);
                    i13 = 1;
                    i15 = 10;
                }
                displaySpellCharWords = arrayList3;
            } else {
                displaySpellCharWords = courseSentence.getDisplaySpellCharWords();
            }
            CourseSentence courseSentenceCopy$default = CourseSentence.copy$default(courseSentence, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, displaySpellCharWords, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8323071, null);
            List<CourseWord> displaySpellWords2 = courseSentenceCopy$default.getDisplaySpellWords();
            ArrayList arrayList4 = new ArrayList(ry.n.W(displaySpellWords2, 10));
            int i17 = 0;
            for (Object obj4 : displaySpellWords2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    ns.o.V();
                    throw null;
                }
                CourseWord courseWord2 = (CourseWord) obj4;
                List<CourseWord> list = courseSentenceCopy$default.getDisplaySpellCharWords().get(i17);
                ArrayList arrayList5 = new ArrayList(ry.n.W(list, 10));
                for (CourseWord courseWordCopy$default : list) {
                    if (!dt.a0.A(((fr.o0) n0Var).f27733a.keyLanguage, courseWordCopy$default.getWord()) && !kotlin.jvm.internal.m.a(courseWordCopy$default.getWord(), " ")) {
                        String word = courseWordCopy$default.getWord();
                        String zhuYin = courseWordCopy$default.getZhuYin();
                        String realLuoMa = courseWordCopy$default.getRealLuoMa();
                        if (realLuoMa.length() <= 0) {
                            realLuoMa = null;
                        }
                        if (realLuoMa == null) {
                            realLuoMa = courseWordCopy$default.getLuoMa();
                        }
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, "_", "_", "_", null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, true, false, word, zhuYin, realLuoMa, null, false, false, false, false, false, null, null, null, null, null, null, 0, -30408719, 63, null);
                    }
                    arrayList5.add(courseWordCopy$default);
                }
                arrayList4.add(CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList5, null, null, null, null, 0, -1, 62, null));
                i17 = i18;
            }
            for (List<CourseWord> list2 : courseSentenceCopy$default.getDisplaySpellCharWords()) {
                if (list2.size() != 1 || (!kotlin.jvm.internal.m.a(list2.get(0).getWord(), " ") && list2.get(0).getWordType() != 1)) {
                    arrayList2.addAll(list2);
                    arrayList.addAll(list2);
                }
            }
            ArrayList arrayListG1 = ry.m.g1(arrayList2, 7, 7);
            ArrayList arrayList6 = new ArrayList(ry.n.W(arrayListG1, 10));
            int size2 = arrayListG1.size();
            int i19 = 0;
            while (i19 < size2) {
                Object obj5 = arrayListG1.get(i19);
                i19++;
                List list3 = (List) obj5;
                if (list3.size() <= 1) {
                    C1 = list3;
                } else if (list3.size() == 2) {
                    C1 = list3;
                    C1 = ns.o.L(new CourseWord[]{list3.get(1), list3.get(0)});
                } else {
                    int i21 = 0;
                    C1 = ry.m.c1(list3);
                    int size3 = C1.size() - 1;
                    boolean z11 = false;
                    while (size3 > 0) {
                        lz.g gVarU = hz.b.U(i21, size3);
                        jz.d dVar2 = jz.e.f37397a;
                        int iN = hz.b.N(gVarU);
                        if (size3 != iN) {
                            C1 = list3;
                            z11 = true;
                        } else {
                            C1 = list3;
                        }
                        CourseWord courseWord3 = (CourseWord) C1.get(size3);
                        C1.set(size3, C1.get(iN));
                        C1.set(iN, courseWord3);
                        size3--;
                        i21 = 0;
                    }
                    if (z11 || C1.size() < 2) {
                        C1 = list3;
                        C1 = list3;
                        C1 = C1;
                        C1 = list3;
                    } else {
                        C1 = list3;
                        CourseWord courseWord4 = (CourseWord) C1.get(0);
                        C1.set(0, C1.get(1));
                        C1.set(1, courseWord4);
                    }
                }
                arrayList6.add(C1);
            }
            ot.f fVar = new ot.f(courseSentenceCopy$default, arrayList4, ry.n.X(arrayList6), arrayList);
            gVar.f45816b = 1;
            if (jVar.emit(fVar, gVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x019f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0227  */
    /* JADX WARN: Code duplicated, block: B:52:0x023c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x017a -> B:44:0x0199). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0227 -> B:16:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object b(java.lang.Object r64, vy.d r65) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.q.b(java.lang.Object, vy.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object e(Object obj, vy.d dVar) {
        ot.v vVar;
        if (dVar instanceof ot.v) {
            vVar = (ot.v) dVar;
            int i11 = vVar.f46018b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f46018b = i11 - Integer.MIN_VALUE;
            } else {
                vVar = new ot.v(this, dVar);
            }
        } else {
            vVar = new ot.v(this, dVar);
        }
        Object obj2 = vVar.f46017a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = vVar.f46018b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            uz.j jVar = (uz.j) this.f4334b;
            CourseSentenceModel090 courseSentenceModel090 = (CourseSentenceModel090) obj;
            CourseSentence sentence = courseSentenceModel090.getSentence();
            List<CourseWord> optionList = courseSentenceModel090.getOptionList();
            List<CourseWord> stemList = courseSentenceModel090.getStemList();
            ArrayList arrayList = new ArrayList(ry.n.W(stemList, 10));
            int i13 = 0;
            for (CourseWord courseWordCopy$default : stemList) {
                if (kotlin.jvm.internal.m.a(courseWordCopy$default.getWord(), "_____")) {
                    CourseWord courseWord = optionList.get(i13);
                    String word = optionList.get(i13).getWord();
                    String word2 = optionList.get(i13).getWord();
                    ArrayList arrayList2 = new ArrayList(word2.length());
                    for (int i14 = 0; i14 < word2.length(); i14++) {
                        word2.charAt(i14);
                        arrayList2.add("_");
                    }
                    courseWordCopy$default = CourseWord.copy$default(courseWord, 0L, ry.m.y0(arrayList2, BuildConfig.VERSION_NAME, null, null, null, 62), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, word, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -4194307, 63, null);
                    i13++;
                }
                arrayList.add(courseWordCopy$default);
            }
            ArrayList arrayListG = c.a.G(((fr.o0) ((vt.n0) ((ob.c) this.f4335c).f44800c)).f27733a.keyLanguage, arrayList);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (CourseWord courseWord2 : courseSentenceModel090.getOptionList()) {
                ArrayList arrayList5 = new ArrayList();
                int i15 = 0;
                int i16 = 0;
                for (String word3 = courseWord2.getWord(); i15 < word3.length(); word3 = word3) {
                    CourseWord courseWord3 = new CourseWord((courseWord2.getWordId() * ((long) 10)) + ((long) i16), String.valueOf(word3.charAt(i15)), 0);
                    arrayList5.add(courseWord3);
                    arrayList4.add(courseWord3);
                    Collections.shuffle(arrayList5);
                    i15++;
                    i16++;
                }
                arrayList3.addAll(arrayList5);
            }
            ot.u uVar = new ot.u(sentence, arrayListG, arrayList3, arrayList4);
            vVar.f46018b = 1;
            if (jVar.emit(uVar, vVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(Object obj, vy.d dVar) {
        w1 w1Var;
        if (dVar instanceof w1) {
            w1Var = (w1) dVar;
            int i11 = w1Var.f46035b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w1Var.f46035b = i11 - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(this, dVar);
            }
        } else {
            w1Var = new w1(this, dVar);
        }
        Object obj2 = w1Var.f46034a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = w1Var.f46035b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            uz.j jVar = (uz.j) this.f4334b;
            u1 u1Var = new u1((CourseWord) obj, ns.o.S(((CourseWordModel010) this.f4335c).getOptionList()));
            w1Var.f46035b = 1;
            if (jVar.emit(u1Var, w1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00dc -> B:16:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object g(java.lang.Object r24, vy.d r25) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.q.g(java.lang.Object, vy.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object h(Object obj, vy.d dVar) {
        qv.i iVar;
        if (dVar instanceof qv.i) {
            iVar = (qv.i) dVar;
            int i11 = iVar.f48440b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f48440b = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new qv.i(this, dVar);
            }
        } else {
            iVar = new qv.i(this, dVar);
        }
        Object obj2 = iVar.f48439a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = iVar.f48440b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            uz.j jVar = (uz.j) this.f4334b;
            qv.g gVar = (qv.g) obj;
            qv.j jVar2 = (qv.j) this.f4335c;
            List list = gVar.f48437b;
            av.t tVar = new av.t(jVar2, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((SyllableWriteCharacter) obj3).getLuoMa().length() > 0) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                SyllableWriteCharacter syllableWriteCharacter = (SyllableWriteCharacter) arrayList.get(i13);
                qy.q qVar = fv.b.f28186a;
                String strE = fv.b.e(syllableWriteCharacter.getLuoMa());
                String zhuyin = syllableWriteCharacter.getLuoMa();
                kotlin.jvm.internal.m.f(zhuyin, "zhuyin");
                arrayList2.add(new fv.a(0L, strE, fv.b.a(zhuyin, null, null)));
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj4 = arrayList2.get(i14);
                i14++;
                if (!new File(((fv.a) obj4).f28184c).exists()) {
                    arrayList3.add(obj4);
                }
            }
            if (arrayList3.isEmpty()) {
                tVar.invoke(100);
            } else {
                jVar2.f48443b.c(arrayList3, new mo.b(new kotlin.jvm.internal.w(), tVar, arrayList3), false);
            }
            iVar.f48440b = 1;
            if (jVar.emit(gVar, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object i(Object obj, vy.d dVar) {
        z1 z1Var;
        if (dVar instanceof z1) {
            z1Var = (z1) dVar;
            int i11 = z1Var.f50744b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z1Var.f50744b = i11 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(this, dVar);
            }
        } else {
            z1Var = new z1(this, dVar);
        }
        Object obj2 = z1Var.f50743a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = z1Var.f50744b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            uz.j jVar = (uz.j) this.f4334b;
            rt.t1 t1Var = (rt.t1) obj;
            boolean z11 = ((a2) this.f4335c).f49420c;
            me meVar = t1Var.f50400a;
            ke keVar = t1Var.f50401b;
            boolean z12 = t1Var.f50402c;
            String str = t1Var.f50403d;
            se seVar = t1Var.f50404e;
            LinkedHashMap linkedHashMap = t1Var.f50405f;
            List list = t1Var.f50406g;
            List list2 = t1Var.f50407h;
            Set set = t1Var.f50408i;
            rt.o1 o1Var = new rt.o1(z11, meVar, keVar, z12, str, linkedHashMap, list, list2, set, t1Var.f50409j, set.size(), t1Var.f50410k, t1Var.f50411l, seVar, t1Var.m, t1Var.f50412n, t1Var.f50413o, t1Var.f50414p);
            z1Var.f50744b = 1;
            if (jVar.emit(o1Var, z1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:161:0x034c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0354  */
    /* JADX WARN: Code duplicated, block: B:164:0x0358  */
    /* JADX WARN: Code duplicated, block: B:190:0x044a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0500  */
    /* JADX WARN: Code duplicated, block: B:234:0x052d  */
    /* JADX WARN: Code duplicated, block: B:250:0x056f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0575  */
    /* JADX WARN: Code duplicated, block: B:255:0x057d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0593  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:332:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:358:0x0856  */
    /* JADX WARN: Code duplicated, block: B:416:0x0993  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:506:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:579:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r12v10, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Iterable, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v43 java.lang.Object, still in use, count: 2, list:
          (r4v43 java.lang.Object) from 0x056b: PHI (r4 I:??) = (r4v41 java.lang.Object), (r4v43 java.lang.Object) binds: [B:247:0x056a, B:543:0x056b] A[DONT_GENERATE, DONT_INLINE]
          (r4v43 java.lang.Object) from 0x0565: CHECK_CAST (za.c) (r4v43 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // uz.j
    public final java.lang.Object emit(java.lang.Object r29, vy.d r30) {
        /*
            Method dump skipped, instruction units count: 3118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.q.emit(java.lang.Object, vy.d):java.lang.Object");
    }
}
