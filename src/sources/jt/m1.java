package jt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 {
    public final boolean A;
    public final a00.e B;
    public long C;
    public final long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.b1 f37050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.b1 f37051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.b1 f37053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f37054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.b1 f37055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.b1 f37056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f37057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x1.p f37058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x1.p f37059l;
    public final x1.p m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1.b1 f37060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l1.b1 f37061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l1.b1 f37062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1.b1 f37063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l1.b1 f37064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l1.b1 f37065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l1.b1 f37066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f37067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l1.b1 f37068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xy.i f37069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xy.i f37070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final xy.i f37071y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final xy.i f37072z;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(Object obj, int i11, l1.b1 enableAudio, l1.b1 enableLuoma, boolean z11, l1.b1 showLuomaSwitch, boolean z12, rz.b0 scope, l1.b1 courseTestState, l1.b1 audioPlayingState, List displayWords, x1.p stemWordsState, x1.p optionWordsState, x1.p clickedWordsState, l1.a1 hintIndexState, l1.b1 isKeyboardState, l1.b1 inputTextState, l1.b1 inputTextFieldValueState, l1.b1 isAiCorrectedState, l1.b1 hasUsedAiRetryState, l1.b1 retryReasonState, boolean z13, l1.b1 noHintAvailableState, fz.g gVar, fz.c cVar, fz.c cVar2, fz.c cVar3, boolean z14) {
        kotlin.jvm.internal.m.f(enableAudio, "enableAudio");
        kotlin.jvm.internal.m.f(enableLuoma, "enableLuoma");
        kotlin.jvm.internal.m.f(showLuomaSwitch, "showLuomaSwitch");
        kotlin.jvm.internal.m.f(scope, "scope");
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(displayWords, "displayWords");
        kotlin.jvm.internal.m.f(stemWordsState, "stemWordsState");
        kotlin.jvm.internal.m.f(optionWordsState, "optionWordsState");
        kotlin.jvm.internal.m.f(clickedWordsState, "clickedWordsState");
        kotlin.jvm.internal.m.f(hintIndexState, "hintIndexState");
        kotlin.jvm.internal.m.f(isKeyboardState, "isKeyboardState");
        kotlin.jvm.internal.m.f(inputTextState, "inputTextState");
        kotlin.jvm.internal.m.f(inputTextFieldValueState, "inputTextFieldValueState");
        kotlin.jvm.internal.m.f(isAiCorrectedState, "isAiCorrectedState");
        kotlin.jvm.internal.m.f(hasUsedAiRetryState, "hasUsedAiRetryState");
        kotlin.jvm.internal.m.f(retryReasonState, "retryReasonState");
        kotlin.jvm.internal.m.f(noHintAvailableState, "noHintAvailableState");
        this.f37048a = obj;
        this.f37049b = i11;
        this.f37050c = enableAudio;
        this.f37051d = enableLuoma;
        this.f37052e = z11;
        this.f37053f = showLuomaSwitch;
        this.f37054g = z12;
        this.f37055h = courseTestState;
        this.f37056i = audioPlayingState;
        this.f37057j = displayWords;
        this.f37058k = stemWordsState;
        this.f37059l = optionWordsState;
        this.m = clickedWordsState;
        this.f37060n = hintIndexState;
        this.f37061o = isKeyboardState;
        this.f37062p = inputTextState;
        this.f37063q = inputTextFieldValueState;
        this.f37064r = isAiCorrectedState;
        this.f37065s = hasUsedAiRetryState;
        this.f37066t = retryReasonState;
        this.f37067u = z13;
        this.f37068v = noHintAvailableState;
        this.f37069w = (xy.i) gVar;
        this.f37070x = (xy.i) cVar;
        this.f37071y = (xy.i) cVar2;
        this.f37072z = (xy.i) cVar3;
        this.A = z14;
        this.B = new a00.e();
        this.D = 30L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(xy.c cVar) {
        j1 j1Var;
        a00.e eVar;
        x1.p pVar = this.f37059l;
        x1.p pVar2 = this.f37058k;
        x1.p pVar3 = this.m;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i11 = j1Var.f36998d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j1Var.f36998d = i11 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, cVar);
            }
        } else {
            j1Var = new j1(this, cVar);
        }
        Object obj = j1Var.f36996b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = j1Var.f36998d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            a00.e eVar2 = this.B;
            j1Var.f36995a = eVar2;
            j1Var.f36998d = 1;
            if (eVar2.b(j1Var) == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = j1Var.f36995a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            a aVar2 = (a) ry.m.A0(pVar3);
            qy.b0 b0Var = qy.b0.f48488a;
            if (aVar2 == null) {
                return b0Var;
            }
            CourseWord courseWord = aVar2.f36860a;
            ListIterator listIterator = pVar.listIterator();
            int i13 = 0;
            while (true) {
                sy.a aVar3 = (sy.a) listIterator;
                if (!aVar3.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (((CourseWord) aVar3.next()).getWordId() == courseWord.getWordId()) {
                    break;
                }
                i13++;
            }
            int i14 = aVar2.f36861b;
            int i15 = aVar2.f36862c;
            ry.m.N0(pVar3);
            if (i13 != -1) {
                pVar.set(i13, CourseWord.copy$default((CourseWord) pVar.get(i13), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
            }
            if (i14 >= 0 && i14 < pVar2.size()) {
                CourseWord courseWord2 = (CourseWord) pVar2.get(i14);
                if (i15 >= 0 && i15 < courseWord2.getDisplayCharWords().size()) {
                    ArrayList arrayListC1 = ry.m.c1(courseWord2.getDisplayCharWords());
                    CourseWord courseWord3 = (CourseWord) arrayListC1.get(i15);
                    arrayListC1.set(i15, CourseWord.copy$default(courseWord3, 0L, "_", courseWord3.getRealZhuYin(), courseWord3.getRealLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null));
                    pVar2.set(i14, CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayListC1, null, null, null, null, 0, -1, 62, null));
                }
            }
            this.f37055h.setValue(pVar3.isEmpty() ? ht.q.DEFAULT : ht.q.SELECTED);
            return b0Var;
        } finally {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (rz.e0.m(400, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (rz.e0.m(400, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xy.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof jt.k1
            if (r0 == 0) goto L13
            r0 = r15
            jt.k1 r0 = (jt.k1) r0
            int r1 = r0.f37010c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37010c = r1
            goto L18
        L13:
            jt.k1 r0 = new jt.k1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f37008a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f37010c
            l1.b1 r3 = r14.f37068v
            l1.b1 r4 = r14.f37060n
            r5 = -1
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L42
            if (r2 == r8) goto L3e
            if (r2 == r7) goto L3a
            if (r2 != r6) goto L32
            com.bumptech.glide.e.F(r15)
            goto L93
        L32:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3a:
            com.bumptech.glide.e.F(r15)
            goto L7c
        L3e:
            com.bumptech.glide.e.F(r15)
            goto L5d
        L42:
            com.bumptech.glide.e.F(r15)
            r0.f37010c = r8
            yz.f r15 = rz.o0.f50940a
            bt.t5 r8 = new bt.t5
            r12 = 0
            r13 = 3
            x1.p r9 = r14.f37058k
            x1.p r10 = r14.f37059l
            boolean r11 = r14.A
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Object r15 = rz.e0.M(r15, r8, r0)
            if (r15 != r1) goto L5d
            goto L92
        L5d:
            qy.l r15 = (qy.l) r15
            java.lang.Object r15 = r15.f48495a
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r8 = 400(0x190, double:1.976E-321)
            if (r15 == r5) goto L85
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r15)
            r4.setValue(r2)
            r0.f37010c = r7
            java.lang.Object r15 = rz.e0.m(r8, r0)
            if (r15 != r1) goto L7c
            goto L92
        L7c:
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r5)
            r4.setValue(r15)
            goto L98
        L85:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r3.setValue(r15)
            r0.f37010c = r6
            java.lang.Object r15 = rz.e0.m(r8, r0)
            if (r15 != r1) goto L93
        L92:
            return r1
        L93:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r3.setValue(r15)
        L98:
            qy.b0 r15 = qy.b0.f48488a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: jt.m1.b(xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0111 A[Catch: all -> 0x0044, LOOP:0: B:43:0x00f4->B:48:0x0111, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011f A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013e A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003b, B:33:0x00d0, B:37:0x00d9, B:39:0x00e5, B:42:0x00ef, B:43:0x00f4, B:45:0x00fe, B:51:0x0117, B:54:0x011f, B:56:0x013b, B:58:0x0140, B:57:0x013e, B:48:0x0111), top: B:67:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(CourseWord courseWord, xy.c cVar) throws Throwable {
        l1 l1Var;
        a00.a aVar;
        CourseWord courseWord2;
        long j11;
        int i11;
        a00.a aVar2;
        a00.a aVar3;
        CourseWord courseWord3;
        p1.c cVar2;
        p2 p2Var;
        a aVar4;
        ArrayList arrayListC1;
        int i12;
        ListIterator listIterator;
        int i13;
        sy.a aVar5;
        ht.q qVar;
        x1.p pVar = this.m;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i14 = l1Var.H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l1Var.H = i14 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        l1 l1Var2 = l1Var;
        Object objM = l1Var2.f37036f;
        wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
        int i15 = l1Var2.H;
        x1.p pVar2 = this.f37059l;
        x1.p pVar3 = this.f37058k;
        qy.b0 b0Var = qy.b0.f48488a;
        try {
            if (i15 == 0) {
                com.bumptech.glide.e.F(objM);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.C < this.D) {
                    return b0Var;
                }
                l1Var2.f37031a = courseWord;
                aVar = this.B;
                l1Var2.f37032b = aVar;
                l1Var2.f37034d = jCurrentTimeMillis;
                l1Var2.f37035e = 0;
                l1Var2.H = 1;
                if (aVar.b(l1Var2) != aVar6) {
                    courseWord2 = courseWord;
                    j11 = jCurrentTimeMillis;
                    i11 = 0;
                }
                return aVar6;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2 = l1Var2.f37033c;
                aVar3 = l1Var2.f37032b;
                courseWord3 = l1Var2.f37031a;
                try {
                    com.bumptech.glide.e.F(objM);
                    pVar2 = pVar2;
                    p2Var = (p2) objM;
                    if (p2Var == null) {
                        aVar3.a(null);
                        return b0Var;
                    }
                    aVar4 = p2Var.f37114c;
                    arrayListC1 = ry.m.c1(pVar3);
                    if (arrayListC1.equals(cVar2)) {
                        int size = arrayListC1.size();
                        i12 = aVar4.f36861b;
                        if (i12 >= 0 && i12 < size) {
                            listIterator = pVar2.listIterator();
                            i13 = 0;
                            while (true) {
                                aVar5 = (sy.a) listIterator;
                                if (aVar5.hasNext()) {
                                    i13 = -1;
                                    break;
                                }
                                if (((CourseWord) aVar5.next()).getWordId() == courseWord3.getWordId()) {
                                    break;
                                }
                                i13++;
                            }
                            if (i13 == -1) {
                                Objects.toString(courseWord3);
                                aVar3.a(null);
                                return b0Var;
                            }
                            pVar2.set(i13, p2Var.f37113b);
                            pVar.add(aVar4);
                            pVar3.clear();
                            pVar3.addAll(p2Var.f37115d);
                            l1.b1 b1Var = this.f37055h;
                            if (pVar.isEmpty()) {
                                qVar = ht.q.DEFAULT;
                            } else {
                                qVar = ht.q.SELECTED;
                            }
                            b1Var.setValue(qVar);
                            aVar3.a(null);
                            return b0Var;
                        }
                    }
                    aVar3.a(null);
                    return b0Var;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.a(null);
                    throw th;
                }
            }
            int i16 = l1Var2.f37035e;
            j11 = l1Var2.f37034d;
            aVar = l1Var2.f37032b;
            CourseWord courseWord4 = l1Var2.f37031a;
            com.bumptech.glide.e.F(objM);
            i11 = i16;
            courseWord2 = courseWord4;
            this.C = j11;
            pVar3.getClass();
            p1.c cVar3 = x1.q.e(pVar3).f55734c;
            pVar2.getClass();
            p1.c cVar4 = x1.q.e(pVar2).f55734c;
            yz.f fVar = rz.o0.f50940a;
            ad.x xVar = new ad.x(courseWord2, cVar3, cVar4, this, null, 13);
            l1Var2.f37031a = courseWord2;
            l1Var2.f37032b = aVar2;
            l1Var2.f37033c = cVar3;
            l1Var2.f37034d = j11;
            l1Var2.f37035e = i11;
            l1Var2.H = 2;
            objM = rz.e0.M(fVar, xVar, l1Var2);
            if (objM != aVar6) {
                courseWord3 = courseWord2;
                cVar2 = cVar3;
                aVar3 = aVar2;
                p2Var = (p2) objM;
                if (p2Var == null) {
                    aVar3.a(null);
                    return b0Var;
                }
                aVar4 = p2Var.f37114c;
                arrayListC1 = ry.m.c1(pVar3);
                if (arrayListC1.equals(cVar2)) {
                    int size2 = arrayListC1.size();
                    i12 = aVar4.f36861b;
                    if (i12 >= 0) {
                        listIterator = pVar2.listIterator();
                        i13 = 0;
                        while (true) {
                            aVar5 = (sy.a) listIterator;
                            if (aVar5.hasNext()) {
                                i13 = -1;
                                break;
                            }
                            if (((CourseWord) aVar5.next()).getWordId() == courseWord3.getWordId()) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        if (i13 == -1) {
                            Objects.toString(courseWord3);
                            aVar3.a(null);
                            return b0Var;
                        }
                        pVar2.set(i13, p2Var.f37113b);
                        pVar.add(aVar4);
                        pVar3.clear();
                        pVar3.addAll(p2Var.f37115d);
                        l1.b1 b1Var2 = this.f37055h;
                        if (pVar.isEmpty()) {
                            qVar = ht.q.DEFAULT;
                        } else {
                            qVar = ht.q.SELECTED;
                        }
                        b1Var2.setValue(qVar);
                        aVar3.a(null);
                        return b0Var;
                    }
                }
                aVar3.a(null);
                return b0Var;
            }
            return aVar6;
        } catch (Throwable th3) {
            th = th3;
            aVar3 = aVar2;
            aVar3.a(null);
            throw th;
        }
        aVar2 = aVar;
    }

    public final void d(String text) {
        kotlin.jvm.internal.m.f(text, "text");
        l1.b1 b1Var = this.f37062p;
        b1Var.setValue(text);
        String str = (String) b1Var.getValue();
        this.f37055h.setValue(md.a.v(this.f37049b, true, this.m.size(), str));
    }
}
