package qs;

import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import defpackage.e;
import kotlin.jvm.internal.m;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseQuestionPreferenceContext f48312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseQuestionPreference f48313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f48319h;

    public b(CourseQuestionPreferenceContext courseQuestionPreferenceContext, CourseQuestionPreference preference, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        m.f(preference, "preference");
        this.f48312a = courseQuestionPreferenceContext;
        this.f48313b = preference;
        this.f48314c = z11;
        this.f48315d = z12;
        this.f48316e = z13;
        this.f48317f = z14;
        this.f48318g = z15;
        this.f48319h = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f48312a, bVar.f48312a) && m.a(this.f48313b, bVar.f48313b) && this.f48314c == bVar.f48314c && this.f48315d == bVar.f48315d && this.f48316e == bVar.f48316e && this.f48317f == bVar.f48317f && this.f48318g == bVar.f48318g && this.f48319h == bVar.f48319h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48319h) + e.e(e.e(e.e(e.e(e.e((this.f48313b.hashCode() + (this.f48312a.hashCode() * 31)) * 31, 31, this.f48314c), 31, this.f48315d), 31, this.f48316e), 31, this.f48317f), 31, this.f48318g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResolvedCourseQuestionPreference(context=");
        sb2.append(this.f48312a);
        sb2.append(", preference=");
        sb2.append(this.f48313b);
        sb2.append(", isVideoModel=");
        ep.a.B(", supportsAudio=", ", supportsAudioAutoPlaySetting=", sb2, this.f48314c, this.f48315d);
        ep.a.B(", supportsTranslation=", ", supportsOriginalSentence=", sb2, this.f48316e, this.f48317f);
        sb2.append(this.f48318g);
        sb2.append(", supportsOptionTapAudio=");
        sb2.append(this.f48319h);
        sb2.append(aYZzTH.mWbaxFoHiVwjyIa);
        return sb2.toString();
    }
}
