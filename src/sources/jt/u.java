package jt;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.stkouyu.util.CommandUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.b1 f37191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.b1 f37192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1.p f37193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.b1 f37194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.b1 f37195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.b1 f37196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.b1 f37197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.b1 f37198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.b1 f37199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a00.e f37200l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f37201n;

    public u(String sentence, List list, boolean z11, l1.b1 courseTestState, l1.b1 audioPlayingState, x1.p displayWordsState, l1.b1 selectedShengMu, l1.b1 selectedYuMu, l1.b1 selectedTone, l1.b1 shengMuOptionsState, l1.b1 yuMuOptionsState, l1.b1 toneOptionsState) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(displayWordsState, "displayWordsState");
        kotlin.jvm.internal.m.f(selectedShengMu, "selectedShengMu");
        kotlin.jvm.internal.m.f(selectedYuMu, "selectedYuMu");
        kotlin.jvm.internal.m.f(selectedTone, "selectedTone");
        kotlin.jvm.internal.m.f(shengMuOptionsState, "shengMuOptionsState");
        kotlin.jvm.internal.m.f(yuMuOptionsState, "yuMuOptionsState");
        kotlin.jvm.internal.m.f(toneOptionsState, "toneOptionsState");
        this.f37189a = list;
        this.f37190b = z11;
        this.f37191c = courseTestState;
        this.f37192d = audioPlayingState;
        this.f37193e = displayWordsState;
        this.f37194f = selectedShengMu;
        this.f37195g = selectedYuMu;
        this.f37196h = selectedTone;
        this.f37197i = shengMuOptionsState;
        this.f37198j = yuMuOptionsState;
        this.f37199k = toneOptionsState;
        this.f37200l = new a00.e();
        this.f37201n = 100L;
    }

    public static final void a(u uVar) {
        x1.p pVar = uVar.f37193e;
        pVar.clear();
        CourseWord courseWord = (CourseWord) uVar.f37194f.getValue();
        if (courseWord != null) {
            pVar.add(courseWord);
        }
        CourseWord courseWord2 = (CourseWord) uVar.f37195g.getValue();
        if (courseWord2 != null) {
            pVar.add(courseWord2);
        }
        CourseWord courseWord3 = (CourseWord) uVar.f37196h.getValue();
        if (courseWord3 != null) {
            pVar.add(courseWord3);
        }
    }

    public static final void b(u uVar, CourseWord courseWord, OptionItemSelectedState optionItemSelectedState) {
        int i11 = o.f37084a[uVar.c(courseWord).ordinal()];
        if (i11 == 1) {
            l1.b1 b1Var = uVar.f37197i;
            Iterable<CourseWord> iterable = (Iterable) b1Var.getValue();
            ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
            for (CourseWord courseWordCopy$default : iterable) {
                if (courseWordCopy$default.getWordId() == courseWord.getWordId()) {
                    courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState, null, null, 0, -1, 59, null);
                }
                arrayList.add(courseWordCopy$default);
            }
            b1Var.setValue(arrayList);
            return;
        }
        if (i11 == 2) {
            l1.b1 b1Var2 = uVar.f37198j;
            Iterable<CourseWord> iterable2 = (Iterable) b1Var2.getValue();
            ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
            for (CourseWord courseWordCopy$default2 : iterable2) {
                if (courseWordCopy$default2.getWordId() == courseWord.getWordId()) {
                    courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState, null, null, 0, -1, 59, null);
                }
                arrayList2.add(courseWordCopy$default2);
            }
            b1Var2.setValue(arrayList2);
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        l1.b1 b1Var3 = uVar.f37199k;
        Iterable<CourseWord> iterable3 = (Iterable) b1Var3.getValue();
        ArrayList arrayList3 = new ArrayList(ry.n.W(iterable3, 10));
        for (CourseWord courseWordCopy$default3 : iterable3) {
            if (courseWordCopy$default3.getWordId() == courseWord.getWordId()) {
                courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState, null, null, 0, -1, 59, null);
            }
            arrayList3.add(courseWordCopy$default3);
        }
        b1Var3.setValue(arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(CourseWord courseWord, xy.c cVar) throws Throwable {
        p pVar;
        CourseWord courseWord2;
        a00.a aVar;
        int i11;
        a00.a aVar2;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f37101f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pVar.f37101f = i12 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f37099d;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i13 = pVar.f37101f;
        int i14 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.m < this.f37201n) {
                    return b0Var;
                }
                this.m = jCurrentTimeMillis;
                courseWord2 = courseWord;
                pVar.f37096a = courseWord2;
                aVar = this.f37200l;
                pVar.f37097b = aVar;
                pVar.f37098c = 0;
                pVar.f37101f = 1;
                if (aVar.b(pVar) != aVar3) {
                    i11 = 0;
                }
                return aVar3;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = pVar.f37097b;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar2.a(null);
                    return b0Var;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.a(null);
                    throw th;
                }
            }
            int i15 = pVar.f37098c;
            a00.a aVar4 = pVar.f37097b;
            CourseWord courseWord3 = pVar.f37096a;
            com.bumptech.glide.e.F(obj);
            i11 = i15;
            aVar = aVar4;
            courseWord2 = courseWord3;
            yz.f fVar = rz.o0.f50940a;
            sz.c cVar2 = wz.m.f55536a;
            r rVar = new r(this, courseWord2, dVar, i14);
            pVar.f37096a = null;
            pVar.f37097b = aVar;
            pVar.f37098c = i11;
            pVar.f37101f = 2;
            if (rz.e0.M(cVar2, rVar, pVar) != aVar3) {
                aVar2 = aVar;
                aVar2.a(null);
                return b0Var;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.a(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(CourseWord courseWord, xy.c cVar) throws Throwable {
        s sVar;
        CourseWord courseWord2;
        a00.a aVar;
        int i11;
        a00.a aVar2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i12 = sVar.f37157f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                sVar.f37157f = i12 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f37155d;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i13 = sVar.f37157f;
        qy.b0 b0Var = qy.b0.f48488a;
        int i14 = 1;
        vy.d dVar = null;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.m < this.f37201n) {
                    return b0Var;
                }
                this.m = jCurrentTimeMillis;
                courseWord2 = courseWord;
                sVar.f37152a = courseWord2;
                aVar = this.f37200l;
                sVar.f37153b = aVar;
                i11 = 0;
                sVar.f37154c = 0;
                sVar.f37157f = 1;
                if (aVar.b(sVar) != aVar3) {
                }
                return aVar3;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = sVar.f37153b;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar2.a(null);
                    return b0Var;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.a(null);
                    throw th;
                }
            }
            int i15 = sVar.f37154c;
            a00.a aVar4 = sVar.f37153b;
            CourseWord courseWord3 = sVar.f37152a;
            com.bumptech.glide.e.F(obj);
            i11 = i15;
            aVar = aVar4;
            courseWord2 = courseWord3;
            yz.f fVar = rz.o0.f50940a;
            sz.c cVar2 = wz.m.f55536a;
            r rVar = new r(this, courseWord2, dVar, i14);
            sVar.f37152a = null;
            sVar.f37153b = aVar;
            sVar.f37154c = i11;
            sVar.f37157f = 2;
            if (rz.e0.M(cVar2, rVar, sVar) != aVar3) {
                aVar2 = aVar;
                aVar2.a(null);
                return b0Var;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.a(null);
            throw th;
        }
    }

    public final r2 c(CourseWord courseWord) {
        Iterable iterable = (Iterable) this.f37197i.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((CourseWord) it.next()).getWordId() == courseWord.getWordId()) {
                    return r2.SHENG_MU;
                }
            }
        }
        Iterable iterable2 = (Iterable) this.f37198j.getValue();
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                if (((CourseWord) it2.next()).getWordId() == courseWord.getWordId()) {
                    return r2.YU_MU;
                }
            }
        }
        Iterable iterable3 = (Iterable) this.f37199k.getValue();
        if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
            Iterator it3 = iterable3.iterator();
            while (it3.hasNext()) {
                if (((CourseWord) it3.next()).getWordId() == courseWord.getWordId()) {
                    return r2.TONE;
                }
            }
        }
        List listL = ns.o.L("b", "p", "m", "f", "d", "t", "n", "l", "g", "k", "h", "j", "q", "x", "zh", "ch", CommandUtil.COMMAND_SH, xTCJ.tHbflFJOtMxoAt, "z", "c", "s", "y", "w");
        List listL2 = ns.o.L("a", "o", "e", "i", "u", "ü", "ai", "ei", "ui", "ao", "ou", "iu", "ie", "üe", "er", "an", "en", "in", "un", "ün", "ang", "eng", "ing", "ong");
        String word = courseWord.getWord();
        Locale locale = Locale.ROOT;
        String lowerCase = word.toLowerCase(locale);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        if (listL.contains(lowerCase)) {
            return r2.SHENG_MU;
        }
        String lowerCase2 = courseWord.getWord().toLowerCase(locale);
        kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
        if (listL2.contains(lowerCase2)) {
            return r2.YU_MU;
        }
        String input = courseWord.getWord();
        Pattern patternCompile = Pattern.compile("[1-4]");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        kotlin.jvm.internal.m.f(input, "input");
        if (!patternCompile.matcher(input).matches()) {
            String input2 = courseWord.getWord();
            Pattern patternCompile2 = Pattern.compile("[ˉˊˇˋ]");
            kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
            kotlin.jvm.internal.m.f(input2, "input");
            if (!patternCompile2.matcher(input2).matches()) {
                String input3 = courseWord.getOriginalWord();
                Pattern patternCompile3 = Pattern.compile("[āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ]");
                kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
                kotlin.jvm.internal.m.f(input3, "input");
                if (!patternCompile3.matcher(input3).find()) {
                    return r2.UNKNOWN;
                }
            }
        }
        return r2.TONE;
    }
}
