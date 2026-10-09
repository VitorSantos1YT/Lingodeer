package com.lingodeer.data.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import ry.n;
import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseQuestionPreferenceKt {
    public static final CourseQuestionPreference buildDefaultCourseQuestionPreference(CourseQuestionPreferenceContext context, long j11) {
        m.f(context, "context");
        int keyLanguage = context.getKeyLanguage();
        CourseQuestionPreferenceKey questionTypeKey = context.getQuestionTypeKey();
        CourseAudioMode courseAudioMode = CourseAudioMode.AUTO_PLAY;
        CourseVisibilityMode courseVisibilityMode = CourseVisibilityMode.ALWAYS_VISIBLE;
        return new CourseQuestionPreference(keyLanguage, questionTypeKey, courseAudioMode, courseVisibilityMode, courseVisibilityMode, true, j11);
    }

    public static /* synthetic */ CourseQuestionPreference buildDefaultCourseQuestionPreference$default(CourseQuestionPreferenceContext courseQuestionPreferenceContext, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return buildDefaultCourseQuestionPreference(courseQuestionPreferenceContext, j11);
    }

    public static final List<CourseQuestionPreference> buildDefaultCourseQuestionPreferences(int i11, long j11) {
        a entries = CourseQuestionPreferenceKey.getEntries();
        ArrayList arrayList = new ArrayList(n.W(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(buildDefaultCourseQuestionPreference(new CourseQuestionPreferenceContext(i11, (CourseQuestionPreferenceKey) it.next()), j11));
        }
        return arrayList;
    }

    public static /* synthetic */ List buildDefaultCourseQuestionPreferences$default(int i11, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = 0;
        }
        return buildDefaultCourseQuestionPreferences(i11, j11);
    }

    public static final CourseAudioMode courseAudioModeFromWireName(String wireName) {
        Object next;
        m.f(wireName, "wireName");
        Iterator<E> it = CourseAudioMode.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m.a(((CourseAudioMode) next).getWireName(), wireName)) {
                return (CourseAudioMode) next;
            }
        }
        next = null;
        return (CourseAudioMode) next;
    }

    public static final CourseQuestionPreferenceKey courseQuestionPreferenceKeyFromWireName(String wireName) {
        Object next;
        m.f(wireName, "wireName");
        Iterator<E> it = CourseQuestionPreferenceKey.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m.a(((CourseQuestionPreferenceKey) next).getWireName(), wireName)) {
                return (CourseQuestionPreferenceKey) next;
            }
        }
        next = null;
        return (CourseQuestionPreferenceKey) next;
    }

    public static final CourseVisibilityMode courseVisibilityModeFromWireName(String wireName) {
        Object next;
        m.f(wireName, "wireName");
        Iterator<E> it = CourseVisibilityMode.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m.a(((CourseVisibilityMode) next).getWireName(), wireName)) {
                return (CourseVisibilityMode) next;
            }
        }
        next = null;
        return (CourseVisibilityMode) next;
    }
}
