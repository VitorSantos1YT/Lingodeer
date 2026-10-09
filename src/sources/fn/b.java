package fn;

import aj.uZCn.evRpcb;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLessonStudyActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableIntroductionActivity;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOSyllableIntroductionActivity;
import kotlin.jvm.internal.m;
import ui.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements fv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27342c;

    public /* synthetic */ b(Object obj, int i11, int i12) {
        this.f27340a = i12;
        this.f27342c = obj;
        this.f27341b = i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // fv.d
    public final void a(uv.b task) {
        switch (this.f27340a) {
        }
        m.f(task, "task");
    }

    @Override // fv.d
    public final void c(uv.b task) {
        switch (this.f27340a) {
            case 0:
                m.f(task, "task");
                KOSyllableIntroductionActivity kOSyllableIntroductionActivity = (KOSyllableIntroductionActivity) this.f27342c;
                kOSyllableIntroductionActivity.Q.remove(Integer.valueOf(task.a()));
                int i11 = kOSyllableIntroductionActivity.R + 1;
                kOSyllableIntroductionActivity.R = i11;
                int i12 = this.f27341b;
                kOSyllableIntroductionActivity.u(i11 / i12, i11 == i12);
                break;
            case 1:
                m.f(task, "task");
                SyllableIntroductionActivity syllableIntroductionActivity = (SyllableIntroductionActivity) this.f27342c;
                syllableIntroductionActivity.Q.remove(Integer.valueOf(task.a()));
                int i13 = syllableIntroductionActivity.R + 1;
                syllableIntroductionActivity.R = i13;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i13);
                sb2.append(" / ");
                int i14 = this.f27341b;
                sb2.append(i14);
                String string = sb2.toString();
                m.e(string, "toString(...)");
                syllableIntroductionActivity.v(string, i13 == i14);
                break;
            case 2:
                m.f(task, "task");
                pp.e eVar = (pp.e) this.f27342c;
                eVar.O.remove(Integer.valueOf(task.a()));
                int i15 = eVar.N + 1;
                eVar.N = i15;
                int i16 = this.f27341b;
                if (i15 == i16) {
                    eVar.B();
                }
                eVar.f46976a.h(w4.c.f((int) ((i15 / i16) * 100.0f), " %"), i15 == i16);
                break;
            case 3:
                m.f(task, "task");
                yi.b bVar = (yi.b) this.f27342c;
                bVar.f57851f.remove(Integer.valueOf(task.a()));
                int i17 = bVar.f57850e + 1;
                bVar.f57850e = i17;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i17);
                sb3.append(" / ");
                int i18 = this.f27341b;
                sb3.append(i18);
                PinyinLessonStudyActivity pinyinLessonStudyActivity = bVar.f57846a;
                String string2 = sb3.toString();
                m.e(string2, "toString(...)");
                pinyinLessonStudyActivity.u(string2, i17 == i18);
                break;
            default:
                m.f(task, "task");
                yi.c cVar = (yi.c) this.f27342c;
                cVar.N.remove(Integer.valueOf(task.a()));
                int i19 = cVar.K + 1;
                cVar.K = i19;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i19);
                sb4.append(" / ");
                int i21 = this.f27341b;
                sb4.append(i21);
                h hVar = cVar.f57853a;
                String string3 = sb4.toString();
                m.e(string3, "toString(...)");
                hVar.h(string3, i19 == i21);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // fv.d
    public final void d(uv.b task) {
        switch (this.f27340a) {
        }
        m.f(task, "task");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // fv.d
    public final void e(uv.b task, int i11, int i12) {
        switch (this.f27340a) {
        }
        m.f(task, "task");
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        switch (this.f27340a) {
            case 0:
                m.f(task, "task");
                KOSyllableIntroductionActivity kOSyllableIntroductionActivity = (KOSyllableIntroductionActivity) this.f27342c;
                kOSyllableIntroductionActivity.Q.remove(Integer.valueOf(task.a()));
                int i11 = kOSyllableIntroductionActivity.R + 1;
                kOSyllableIntroductionActivity.R = i11;
                int i12 = this.f27341b;
                kOSyllableIntroductionActivity.u(i11 / i12, i11 == i12);
                break;
            case 1:
                m.f(task, "task");
                SyllableIntroductionActivity syllableIntroductionActivity = (SyllableIntroductionActivity) this.f27342c;
                syllableIntroductionActivity.Q.remove(Integer.valueOf(task.a()));
                int i13 = syllableIntroductionActivity.R + 1;
                syllableIntroductionActivity.R = i13;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i13);
                sb2.append(" / ");
                int i14 = this.f27341b;
                sb2.append(i14);
                String string = sb2.toString();
                m.e(string, "toString(...)");
                syllableIntroductionActivity.v(string, i13 == i14);
                break;
            case 2:
                m.f(task, "task");
                pp.e eVar = (pp.e) this.f27342c;
                eVar.O.remove(Integer.valueOf(task.a()));
                int i15 = eVar.N + 1;
                eVar.N = i15;
                int i16 = this.f27341b;
                if (i15 == i16) {
                    eVar.B();
                }
                eVar.f46976a.h(w4.c.f((int) ((i15 / i16) * 100.0f), " %"), i15 == i16);
                break;
            case 3:
                m.f(task, "task");
                yi.b bVar = (yi.b) this.f27342c;
                bVar.f57851f.remove(Integer.valueOf(task.a()));
                int i17 = bVar.f57850e + 1;
                bVar.f57850e = i17;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i17);
                sb3.append(" / ");
                int i18 = this.f27341b;
                sb3.append(i18);
                PinyinLessonStudyActivity pinyinLessonStudyActivity = bVar.f57846a;
                String string2 = sb3.toString();
                m.e(string2, "toString(...)");
                pinyinLessonStudyActivity.u(string2, i17 == i18);
                break;
            default:
                m.f(task, "task");
                yi.c cVar = (yi.c) this.f27342c;
                cVar.N.remove(Integer.valueOf(task.a()));
                int i19 = cVar.K + 1;
                cVar.K = i19;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i19);
                sb4.append(" / ");
                int i21 = this.f27341b;
                sb4.append(i21);
                h hVar = cVar.f57853a;
                String string3 = sb4.toString();
                m.e(string3, "toString(...)");
                hVar.h(string3, i19 == i21);
                break;
        }
    }

    @Override // fv.d
    public final void b(uv.b task) {
        switch (this.f27340a) {
            case 0:
                m.f(task, "task");
                ((KOSyllableIntroductionActivity) this.f27342c).Q.add(Integer.valueOf(task.a()));
                break;
            case 1:
                m.f(task, "task");
                ((SyllableIntroductionActivity) this.f27342c).Q.add(Integer.valueOf(task.a()));
                break;
            case 2:
                m.f(task, "task");
                ((pp.e) this.f27342c).O.add(Integer.valueOf(task.a()));
                break;
            case 3:
                m.f(task, evRpcb.oyDoe);
                ((yi.b) this.f27342c).f57851f.add(Integer.valueOf(task.a()));
                break;
            default:
                m.f(task, "task");
                ((yi.c) this.f27342c).N.add(Integer.valueOf(task.a()));
                break;
        }
    }
}
