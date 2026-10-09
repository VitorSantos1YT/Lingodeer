package jt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ht.m f36970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m1 f36975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m1 m1Var, vy.d dVar) {
        super(2, dVar);
        this.f36975f = m1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new i1(this.f36975f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02db  */
    /* JADX WARN: Code duplicated, block: B:105:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:115:0x0314  */
    /* JADX WARN: Code duplicated, block: B:118:0x0333  */
    /* JADX WARN: Code duplicated, block: B:123:0x0350  */
    /* JADX WARN: Code duplicated, block: B:126:0x0409  */
    /* JADX WARN: Code duplicated, block: B:129:0x0421  */
    /* JADX WARN: Code duplicated, block: B:132:0x0440  */
    /* JADX WARN: Code duplicated, block: B:141:0x0515  */
    /* JADX WARN: Code duplicated, block: B:143:0x051f  */
    /* JADX WARN: Code duplicated, block: B:145:0x052d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0585  */
    /* JADX WARN: Code duplicated, block: B:147:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:151:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:152:0x064d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0705 A[EDGE_INSN: B:159:0x0705->B:155:0x0705 BREAK  A[LOOP:0: B:113:0x030b->B:125:0x03ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0705 A[EDGE_INSN: B:163:0x0705->B:155:0x0705 BREAK  A[LOOP:2: B:127:0x0418->B:154:0x06aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [fz.g, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String userInput;
        boolean z11;
        l1.b1 b1Var;
        ht.q qVar;
        int i11;
        ht.m mVarR;
        int i12;
        q2 q2Var;
        Object objF;
        int i13;
        boolean z12;
        ArrayList arrayList;
        ListIterator listIterator;
        sy.a aVar;
        ArrayList arrayList2;
        sz.c cVar;
        iv.h0 h0Var;
        int i14;
        ListIterator listIterator2;
        sy.a aVar2;
        ArrayList arrayList3;
        m1 m1Var = this.f36975f;
        l1.b1 b1Var2 = m1Var.f37066t;
        l1.b1 b1Var3 = m1Var.f37055h;
        l1.b1 b1Var4 = m1Var.f37065s;
        l1.b1 b1Var5 = m1Var.f37062p;
        x1.p pVar = m1Var.f37058k;
        l1.b1 b1Var6 = m1Var.f37061o;
        int i15 = m1Var.f37049b;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i16 = this.f36974e;
        int i17 = 1;
        if (i16 == 0) {
            com.bumptech.glide.e.F(obj);
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                userInput = oz.q.i1((String) b1Var5.getValue()).toString();
            } else {
                ArrayList arrayList4 = new ArrayList();
                ListIterator listIterator3 = pVar.listIterator();
                while (true) {
                    sy.a aVar4 = (sy.a) listIterator3;
                    if (!aVar4.hasNext()) {
                        break;
                    }
                    ry.m.d0(arrayList4, ((CourseWord) aVar4.next()).getDisplayCharWords());
                }
                userInput = ry.m.y0(arrayList4, BuildConfig.VERSION_NAME, null, null, new bt.e2(m1Var, 4), 30);
            }
            ArrayList arrayList5 = new ArrayList();
            ListIterator listIterator4 = pVar.listIterator();
            while (true) {
                sy.a aVar5 = (sy.a) listIterator4;
                if (!aVar5.hasNext()) {
                    break;
                }
                ry.m.d0(arrayList5, ((CourseWord) aVar5.next()).getDisplayCharWords());
            }
            String correctText = ry.m.y0(arrayList5, BuildConfig.VERSION_NAME, null, null, new bt.e2(m1Var, 5), 30);
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                kotlin.jvm.internal.m.f(userInput, "userInput");
                kotlin.jvm.internal.m.f(correctText, "correctText");
                String strF = o00.a.F(i15, userInput);
                Integer numK = o00.a.K(i15, strF, o00.a.F(i15, correctText));
                z11 = numK != null && numK.intValue() == strF.length();
            } else {
                z11 = o00.a.z(i15, userInput, correctText);
            }
            if (z11) {
                qVar = ht.q.CORRECT;
                b1Var = b1Var5;
            } else if (((Boolean) b1Var6.getValue()).booleanValue()) {
                String strF2 = o00.a.F(i15, oz.q.i1((String) b1Var5.getValue()).toString());
                ht.q qVar2 = ht.q.CORRECT;
                ListIterator listIterator5 = pVar.listIterator();
                while (true) {
                    sy.a aVar6 = (sy.a) listIterator5;
                    if (!aVar6.hasNext()) {
                        b1Var = b1Var5;
                        qVar = qVar2;
                        break;
                    }
                    CourseWord courseWord = (CourseWord) aVar6.next();
                    b1Var = b1Var5;
                    if (courseWord.getWordType() != i17 && !kotlin.jvm.internal.m.a(courseWord.getWord(), " ")) {
                        courseWord.getWord();
                        courseWord.getZhuYin();
                        courseWord.getWord().getClass();
                        strF2.getClass();
                        o2 o2VarC = o00.a.C(strF2, courseWord, i15, false);
                        if (!o2VarC.f37094a) {
                            qVar = ht.q.WRONG;
                            break;
                        }
                        strF2 = oz.q.y0(o2VarC.f37095b, strF2);
                    }
                    b1Var5 = b1Var;
                    i17 = 1;
                }
            } else {
                b1Var = b1Var5;
                qVar = ht.q.WRONG;
            }
            ht.q qVar3 = ht.q.CORRECT;
            if (qVar == qVar3) {
                i11 = 0;
            } else if (((Boolean) b1Var6.getValue()).booleanValue()) {
                String text = (String) b1Var.getValue();
                kotlin.jvm.internal.m.f(text, "text");
                if (!o00.a.x(i15, o00.a.G(i15, text))) {
                    i11 = 0;
                } else if (o00.a.w(i15, userInput, correctText)) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            } else if (o00.a.w(i15, userInput, correctText)) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            ht.m mVar = qVar == qVar3 ? ((Boolean) b1Var4.getValue()).booleanValue() ? ht.m.CORRECT_AFTER_RETRY : ht.m.CORRECT : ht.m.WRONG;
            if (i11 == 0) {
                b1Var6 = b1Var6;
                i17 = 1;
                mVarR = mVar;
                i12 = 0;
                l1.b1 b1Var7 = m1Var.f37064r;
                if (i12 != 0) {
                    z12 = i17;
                } else {
                    z12 = 0;
                }
                b1Var7.setValue(Boolean.valueOf(z12));
                b1Var3.setValue(qVar);
                if (!((Boolean) b1Var6.getValue()).booleanValue() && mVarR != ht.m.RETRY) {
                    if (qVar == ht.q.CORRECT) {
                        arrayList = new ArrayList(ry.n.W(pVar, 10));
                        listIterator = pVar.listIterator();
                        while (true) {
                            aVar = (sy.a) listIterator;
                            if (aVar.hasNext()) {
                                break;
                            }
                            CourseWord courseWord2 = (CourseWord) aVar.next();
                            List<CourseWord> displayCharWords = courseWord2.getDisplayCharWords();
                            arrayList2 = new ArrayList(ry.n.W(displayCharWords, 10));
                            for (CourseWord courseWordCopy$default : displayCharWords) {
                                if (!m1Var.A && courseWordCopy$default.getRealLuoMa().length() > 0) {
                                    courseWordCopy$default = o00.a.z(i15, courseWordCopy$default.getLuoMa(), courseWordCopy$default.getRealLuoMa()) ? CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                                } else if (courseWordCopy$default.getRealWord().length() > 0) {
                                    if (o00.a.z(i15, courseWordCopy$default.getWord(), courseWordCopy$default.getRealWord())) {
                                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                    } else {
                                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                                    }
                                } else if (courseWordCopy$default.getRealZhuYin().length() > 0) {
                                    if (o00.a.z(i15, courseWordCopy$default.getZhuYin(), courseWordCopy$default.getRealZhuYin())) {
                                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                    } else {
                                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                                    }
                                }
                                arrayList2.add(courseWordCopy$default);
                            }
                            arrayList.add(CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList2, null, null, null, null, 0, -1, 62, null));
                        }
                    } else {
                        i14 = 10;
                        arrayList = new ArrayList(ry.n.W(pVar, 10));
                        listIterator2 = pVar.listIterator();
                        while (true) {
                            aVar2 = (sy.a) listIterator2;
                            if (aVar2.hasNext()) {
                                break;
                            }
                            CourseWord courseWord3 = (CourseWord) aVar2.next();
                            List<CourseWord> displayCharWords2 = courseWord3.getDisplayCharWords();
                            arrayList3 = new ArrayList(ry.n.W(displayCharWords2, i14));
                            for (CourseWord courseWordCopy$default2 : displayCharWords2) {
                                if (courseWordCopy$default2.getRealWord().length() <= 0 || courseWordCopy$default2.getRealZhuYin().length() > 0) {
                                    courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                }
                                arrayList3.add(courseWordCopy$default2);
                            }
                            arrayList.add(CourseWord.copy$default(courseWord3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList3, null, null, null, null, 0, -1, 62, null));
                            i14 = 10;
                        }
                    }
                    yz.f fVar = rz.o0.f50940a;
                    cVar = wz.m.f55536a;
                    h0Var = new iv.h0(8, m1Var, arrayList, null);
                    this.f36970a = mVarR;
                    this.f36971b = z11;
                    this.f36972c = i11;
                    this.f36973d = i12;
                    this.f36974e = 2;
                    if (rz.e0.M(cVar, h0Var, this) == aVar3) {
                    }
                }
                return mVarR;
            }
            b1Var3.setValue(ht.q.CHECKING);
            Object obj2 = m1Var.f37048a;
            if (obj2 instanceof CourseSentence) {
                CourseSentence courseSentence = (CourseSentence) obj2;
                q2Var = new q2(courseSentence.getSentence(), courseSentence.getTranslation());
            } else if (obj2 instanceof CourseWord) {
                CourseWord courseWord4 = (CourseWord) obj2;
                List listL = ns.o.L(courseWord4.getWord(), courseWord4.getZhuYin());
                ArrayList arrayList6 = new ArrayList(ry.n.W(listL, 10));
                Iterator it = listL.iterator();
                while (it.hasNext()) {
                    arrayList6.add(oz.q.i1((String) it.next()).toString());
                }
                ArrayList arrayList7 = new ArrayList();
                int size = arrayList6.size();
                int i18 = 0;
                while (i18 < size) {
                    int i19 = size;
                    Object obj3 = arrayList6.get(i18);
                    i18++;
                    if (((String) obj3).length() > 0) {
                        arrayList7.add(obj3);
                    }
                    size = i19;
                }
                q2Var = new q2(ry.m.y0(ry.m.j0(arrayList7), "\n", null, null, null, 62), courseWord4.getTranslation());
            } else {
                q2Var = new q2(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
            }
            String string = oz.q.i1(userInput).toString();
            ?? r9 = m1Var.f37069w;
            this.f36970a = null;
            this.f36971b = z11;
            this.f36972c = i11;
            this.f36973d = 0;
            i17 = 1;
            this.f36974e = 1;
            objF = r9.f(q2Var.f37134a, string, q2Var.f37135b, this);
            if (objF != aVar3) {
                i13 = 0;
            }
            return aVar3;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ht.m mVar2 = this.f36970a;
            com.bumptech.glide.e.F(obj);
            return mVar2;
        }
        int i21 = this.f36973d;
        int i22 = this.f36972c;
        boolean z13 = this.f36971b;
        com.bumptech.glide.e.F(obj);
        b1Var6 = b1Var6;
        z11 = z13;
        i13 = i21;
        i11 = i22;
        objF = obj;
        ns.h hVar = (ns.h) objF;
        mVarR = ns.o.R(hVar.f43976a, m1Var.f37067u, ((Boolean) b1Var4.getValue()).booleanValue());
        if (mVarR == ht.m.CORRECT || mVarR == ht.m.CORRECT_AFTER_RETRY) {
            qVar = ht.q.CORRECT;
            i12 = i17;
        } else {
            if (mVarR == ht.m.RETRY) {
                qVar = ht.q.REVISING;
                b1Var4.setValue(Boolean.TRUE);
                b1Var2.setValue(hVar.f43977b);
            } else {
                qVar = ht.q.WRONG;
                b1Var2.setValue(ns.s.NONE);
            }
            i12 = i13;
        }
        l1.b1 b1Var8 = m1Var.f37064r;
        if (i12 != 0) {
            z12 = i17;
        } else {
            z12 = 0;
        }
        b1Var8.setValue(Boolean.valueOf(z12));
        b1Var3.setValue(qVar);
        if (!((Boolean) b1Var6.getValue()).booleanValue()) {
            if (qVar == ht.q.CORRECT) {
                arrayList = new ArrayList(ry.n.W(pVar, 10));
                listIterator = pVar.listIterator();
                while (true) {
                    aVar = (sy.a) listIterator;
                    if (aVar.hasNext()) {
                        break;
                        break;
                    }
                    CourseWord courseWord5 = (CourseWord) aVar.next();
                    List<CourseWord> displayCharWords3 = courseWord5.getDisplayCharWords();
                    arrayList2 = new ArrayList(ry.n.W(displayCharWords3, 10));
                    while (r6.hasNext()) {
                        if (!m1Var.A) {
                            if (courseWordCopy$default.getRealWord().length() > 0) {
                                if (o00.a.z(i15, courseWordCopy$default.getWord(), courseWordCopy$default.getRealWord())) {
                                    courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                } else {
                                    courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                                }
                            } else if (courseWordCopy$default.getRealZhuYin().length() > 0) {
                                if (o00.a.z(i15, courseWordCopy$default.getZhuYin(), courseWordCopy$default.getRealZhuYin())) {
                                    courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                } else {
                                    courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                                }
                            }
                        } else if (courseWordCopy$default.getRealWord().length() > 0) {
                            if (o00.a.z(i15, courseWordCopy$default.getWord(), courseWordCopy$default.getRealWord())) {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        } else if (courseWordCopy$default.getRealZhuYin().length() > 0) {
                            if (o00.a.z(i15, courseWordCopy$default.getZhuYin(), courseWordCopy$default.getRealZhuYin())) {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        }
                        arrayList2.add(courseWordCopy$default);
                    }
                    arrayList.add(CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList2, null, null, null, null, 0, -1, 62, null));
                }
            } else {
                i14 = 10;
                arrayList = new ArrayList(ry.n.W(pVar, 10));
                listIterator2 = pVar.listIterator();
                while (true) {
                    aVar2 = (sy.a) listIterator2;
                    if (aVar2.hasNext()) {
                        break;
                        break;
                    }
                    CourseWord courseWord6 = (CourseWord) aVar2.next();
                    List<CourseWord> displayCharWords4 = courseWord6.getDisplayCharWords();
                    arrayList3 = new ArrayList(ry.n.W(displayCharWords4, i14));
                    while (r3.hasNext()) {
                        if (courseWordCopy$default2.getRealWord().length() <= 0) {
                            courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                        }
                        arrayList3.add(courseWordCopy$default2);
                    }
                    arrayList.add(CourseWord.copy$default(courseWord6, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList3, null, null, null, null, 0, -1, 62, null));
                    i14 = 10;
                }
            }
            yz.f fVar2 = rz.o0.f50940a;
            cVar = wz.m.f55536a;
            h0Var = new iv.h0(8, m1Var, arrayList, null);
            this.f36970a = mVarR;
            this.f36971b = z11;
            this.f36972c = i11;
            this.f36973d = i12;
            this.f36974e = 2;
            if (rz.e0.M(cVar, h0Var, this) == aVar3) {
                return aVar3;
            }
        }
        return mVarR;
    }
}
