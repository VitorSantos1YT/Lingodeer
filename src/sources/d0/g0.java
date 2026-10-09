package d0;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CoursePracticeType;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import rt.e3;
import rt.jf;
import rt.mf;
import rt.r8;
import rt.w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22710e;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f22706a = i11;
        this.f22707b = obj;
        this.f22708c = obj2;
        this.f22709d = obj3;
        this.f22710e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r1.emit(r15, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r1.emit(r15, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int[] r14, vy.d r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f22709d
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.f22708c
            uz.j r1 = (uz.j) r1
            boolean r2 = r15 instanceof w9.z
            if (r2 == 0) goto L1b
            r2 = r15
            w9.z r2 = (w9.z) r2
            int r3 = r2.f54882e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f54882e = r3
            goto L20
        L1b:
            w9.z r2 = new w9.z
            r2.<init>(r13, r15)
        L20:
            java.lang.Object r15 = r2.f54880c
            wy.a r3 = wy.a.COROUTINE_SUSPENDED
            int r4 = r2.f54882e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3f
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            int[] r14 = r2.f54879b
            d0.g0 r0 = r2.f54878a
            com.bumptech.glide.e.F(r15)
            goto La2
        L3f:
            com.bumptech.glide.e.F(r15)
            java.lang.Object r15 = r13.f22707b
            kotlin.jvm.internal.y r15 = (kotlin.jvm.internal.y) r15
            java.lang.Object r4 = r15.f38361a
            if (r4 != 0) goto L5b
            java.util.Set r15 = ry.l.m0(r0)
            r2.f54878a = r13
            r2.f54879b = r14
            r2.f54882e = r6
            java.lang.Object r15 = r1.emit(r15, r2)
            if (r15 != r3) goto La1
            goto La0
        L5b:
            java.lang.Object r4 = r13.f22710e
            int[] r4 = (int[]) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L67:
            if (r8 >= r7) goto L8a
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r15.f38361a
            if (r12 == 0) goto L82
            int[] r12 = (int[]) r12
            r9 = r4[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L7e
            r6.add(r10)
        L7e:
            int r8 = r8 + 1
            r9 = r11
            goto L67
        L82:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L8a:
            boolean r15 = r6.isEmpty()
            if (r15 != 0) goto La1
            java.util.Set r15 = ry.m.f1(r6)
            r2.f54878a = r13
            r2.f54879b = r14
            r2.f54882e = r5
            java.lang.Object r15 = r1.emit(r15, r2)
            if (r15 != r3) goto La1
        La0:
            return r3
        La1:
            r0 = r13
        La2:
            java.lang.Object r15 = r0.f22707b
            kotlin.jvm.internal.y r15 = (kotlin.jvm.internal.y) r15
            r15.f38361a = r14
            qy.b0 r14 = qy.b0.f48488a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g0.a(int[], vy.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:137:0x0293  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        w2 w2Var;
        r8 r8Var;
        Env env;
        boolean z11;
        boolean z12;
        CoursePracticeType coursePracticeType;
        CoursePracticeType coursePracticeType2;
        CoursePracticeType coursePracticeType3;
        Object value;
        Object value2;
        vz.h hVar;
        g0 g0Var;
        Object obj2 = obj;
        switch (this.f22706a) {
            case 0:
                h0.h hVar2 = (h0.h) obj2;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f22709d;
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) this.f22708c;
                kotlin.jvm.internal.w wVar3 = (kotlin.jvm.internal.w) this.f22707b;
                boolean z13 = true;
                if (hVar2 instanceof h0.k) {
                    wVar3.f38359a++;
                } else if ((hVar2 instanceof h0.l) || (hVar2 instanceof h0.j)) {
                    wVar3.f38359a--;
                } else if (hVar2 instanceof h0.f) {
                    wVar2.f38359a++;
                } else if (hVar2 instanceof h0.g) {
                    wVar2.f38359a--;
                } else if (hVar2 instanceof h0.d) {
                    wVar.f38359a++;
                } else if (hVar2 instanceof h0.e) {
                    wVar.f38359a--;
                }
                int i11 = wVar3.f38359a;
                boolean z14 = false;
                boolean z15 = i11 > 0;
                boolean z16 = wVar2.f38359a > 0;
                boolean z17 = wVar.f38359a > 0;
                h0 h0Var = (h0) this.f22710e;
                if (h0Var.R != z15) {
                    h0Var.R = z15;
                    z14 = true;
                }
                if (h0Var.S != z16) {
                    h0Var.S = z16;
                    z14 = true;
                }
                if (h0Var.T != z17) {
                    h0Var.T = z17;
                } else {
                    z13 = z14;
                }
                if (z13) {
                    y2.f.m(h0Var);
                }
                return qy.b0.f48488a;
            case 1:
                ((Number) obj2).intValue();
                l0.w wVar4 = (l0.w) this.f22707b;
                ((fz.c) this.f22708c).invoke(new Long(((i1.x) this.f22709d).e(((lz.g) this.f22710e).f40532a + (wVar4.f39206e.f39181b.l() / 12), (wVar4.f39206e.f39181b.l() % 12) + 1).f34110e));
                return qy.b0.f48488a;
            case 2:
                r8 r8Var2 = (r8) this.f22710e;
                r8 r8Var3 = (r8) this.f22709d;
                e3 e3Var = (e3) this.f22708c;
                vt.n0 n0Var = e3Var.f50701a;
                CoursePracticeType coursePracticeType4 = e3Var.f49676x0;
                if (dVar instanceof w2) {
                    w2Var = (w2) dVar;
                    int i12 = w2Var.f50568b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        w2Var.f50568b = i12 - Integer.MIN_VALUE;
                    } else {
                        w2Var = new w2(this, dVar);
                    }
                } else {
                    w2Var = new w2(this, dVar);
                }
                Object obj3 = w2Var.f50567a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = w2Var.f50568b;
                int i14 = 1;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj3);
                    uz.j jVar = (uz.j) this.f22707b;
                    List list = (List) obj2;
                    ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ot.j1 j1Var = (ot.j1) it.next();
                        int i15 = (coursePracticeType4 == CoursePracticeType.COURSE_PRACTICE_LISTENING || (coursePracticeType4 == (coursePracticeType3 = CoursePracticeType.COURSE_REVIEW_WORD_SENT) && j1Var.a().f33753a == 0 && r8Var3 == r8.LISTENING) || (coursePracticeType4 == coursePracticeType3 && j1Var.a().f33753a == i14 && r8Var2 == r8.LISTENING)) ? i14 : 0;
                        int i16 = (coursePracticeType4 == CoursePracticeType.COURSE_PRACTICE_SPEAKING || (coursePracticeType4 == (coursePracticeType2 = CoursePracticeType.COURSE_REVIEW_WORD_SENT) && j1Var.a().f33753a == 0 && r8Var3 == r8.SPEAKING) || (coursePracticeType4 == coursePracticeType2 && j1Var.a().f33753a == i14 && r8Var2 == r8.SPEAKING)) ? i14 : 0;
                        int i17 = (coursePracticeType4 == CoursePracticeType.COURSE_PRACTICE_SPELLING || (coursePracticeType4 == (coursePracticeType = CoursePracticeType.COURSE_REVIEW_WORD_SENT) && j1Var.a().f33753a == 0 && r8Var3 == r8.SPELLING) || (coursePracticeType4 == coursePracticeType && j1Var.a().f33753a == i14 && r8Var2 == r8.SPELLING)) ? i14 : 0;
                        boolean z18 = j1Var instanceof ot.f1;
                        Iterator it2 = it;
                        boolean z19 = (j1Var.a().f33753a == 0 && j1Var.a().f33755c == 7) || (j1Var.a().f33753a == 1 && j1Var.a().f33755c == 7);
                        if (j1Var.a().f33753a == 1) {
                            r8Var = r8Var2;
                            boolean z20 = ry.l.D(new Integer[]{new Integer(13), new Integer(31)}, new Integer(j1Var.a().f33755c));
                            env = ((fr.o0) n0Var).f27733a;
                            if (env.enableNativeSpeakerVideos || ((!xt.d.j(env.keyLanguage) || (i15 == 0 && !z20)) && ((!z19 && i16 == 0) || !xt.d.h(((fr.o0) n0Var).f27733a.keyLanguage)))) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            ht.o oVarA = j1Var.a();
                            boolean z21 = i16 ^ 1;
                            if (i15 == 0 || i17 != 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            arrayList.add(ot.p1.b(j1Var, ht.o.a(oVarA, 0, 0L, false, z18, z11, ry.l.m0(new Integer[]{51, 55, 61, 57}).contains(Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage)), false, false, false, z21, z12, i17 ^ 1, null, 293103)));
                            it = it2;
                            r8Var2 = r8Var;
                            i14 = 1;
                        } else {
                            r8Var = r8Var2;
                        }
                        env = ((fr.o0) n0Var).f27733a;
                        if (env.enableNativeSpeakerVideos) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        ht.o oVarA2 = j1Var.a();
                        boolean z22 = i16 ^ 1;
                        if (i15 == 0) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(ot.p1.b(j1Var, ht.o.a(oVarA2, 0, 0L, false, z18, z11, ry.l.m0(new Integer[]{51, 55, 61, 57}).contains(Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage)), false, false, false, z22, z12, i17 ^ 1, null, 293103)));
                        it = it2;
                        r8Var2 = r8Var;
                        i14 = 1;
                    }
                    w2Var.f50568b = i14;
                    if (jVar.emit(arrayList, w2Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj3);
                }
                return qy.b0.f48488a;
            case 3:
                ps.a aVar2 = (ps.a) obj2;
                ArrayList arrayList2 = (ArrayList) this.f22710e;
                kotlin.jvm.internal.w wVar5 = (kotlin.jvm.internal.w) this.f22707b;
                mf mfVar = (mf) this.f22708c;
                long j11 = ((ps.b) this.f22709d).f47122a;
                mf.a(mfVar, j11, aVar2.f47121d);
                uz.i1 i1Var = mfVar.f50103d;
                if (aVar2.f47121d >= 1.0f) {
                    mfVar.f50105f.remove(new Long(j11));
                    wVar5.f38359a++;
                    mfVar.c(j11, ps.d.f47131a, 1.0f);
                    float size = wVar5.f38359a / arrayList2.size();
                    do {
                        value = i1Var.getValue();
                    } while (!i1Var.j(value, jf.a((jf) value, null, 0, size, false, null, 111)));
                    if (wVar5.f38359a >= arrayList2.size()) {
                        do {
                            value2 = i1Var.getValue();
                        } while (!i1Var.j(value2, jf.a((jf) value2, null, 0, CropImageView.DEFAULT_ASPECT_RATIO, false, null, 79)));
                    }
                }
                return qy.b0.f48488a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                d1.z0 z0Var = (d1.z0) this.f22709d;
                s0.s0 s0Var = (s0.s0) this.f22707b;
                if (zBooleanValue && s0Var.b()) {
                    s0.o0.y((o3.x) this.f22708c, s0Var, z0Var.m(), (o3.j) this.f22710e, z0Var.f23038b);
                } else {
                    s0.o0.q(s0Var);
                }
                return qy.b0.f48488a;
            case 5:
                if (dVar instanceof vz.h) {
                    hVar = (vz.h) dVar;
                    int i18 = hVar.f54345e;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        hVar.f54345e = i18 - Integer.MIN_VALUE;
                    } else {
                        hVar = new vz.h(this, dVar);
                    }
                } else {
                    hVar = new vz.h(this, dVar);
                }
                Object obj4 = hVar.f54343c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i19 = hVar.f54345e;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj4);
                    rz.g1 g1Var = (rz.g1) ((kotlin.jvm.internal.y) this.f22707b).f38361a;
                    if (g1Var != null) {
                        g1Var.cancel(new ChildCancelledException());
                        hVar.f54341a = this;
                        hVar.f54342b = obj2;
                        hVar.f54345e = 1;
                        if (g1Var.join(hVar) == aVar3) {
                            return aVar3;
                        }
                    }
                    g0Var = this;
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = hVar.f54342b;
                    g0Var = hVar.f54341a;
                    com.bumptech.glide.e.F(obj4);
                }
                ((kotlin.jvm.internal.y) g0Var.f22707b).f38361a = rz.e0.B((rz.b0) g0Var.f22708c, null, rz.d0.UNDISPATCHED, new vz.g((vz.i) g0Var.f22709d, (uz.j) g0Var.f22710e, obj2, null), 1);
                return qy.b0.f48488a;
            default:
                return a((int[]) obj2, dVar);
        }
    }

    public g0(mf mfVar, ps.b bVar, kotlin.jvm.internal.w wVar, ArrayList arrayList) {
        this.f22706a = 3;
        this.f22708c = mfVar;
        this.f22709d = bVar;
        this.f22707b = wVar;
        this.f22710e = arrayList;
    }
}
