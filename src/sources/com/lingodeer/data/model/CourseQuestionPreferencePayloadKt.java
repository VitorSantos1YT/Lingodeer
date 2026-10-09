package com.lingodeer.data.model;

import aj.uZCn.evRpcb;
import h00.m;
import h00.n;
import h00.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.JsonDecodingException;
import ns.o;
import oz.x;
import xt.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseQuestionPreferencePayloadKt {
    private static final String COURSE_QUESTION_PREFERENCE_PROGRESS_ID_PREFIX = "course_question_preference_";
    private static final String FIELD_AUDIO_MODE = "audio_mode";
    private static final String FIELD_TRANSLATION_VISIBILITY = "translation_visibility";
    private static final String FIELD_ORIGINAL_VISIBILITY = "original_visibility";
    private static final String FIELD_OPTION_TAP_AUDIO_ENABLED = "option_tap_audio_enabled";
    private static final String FIELD_UPDATED_AT = "updated_at";
    private static final List<String> COURSE_QUESTION_PREFERENCE_ITEM_FIELD_ORDER = o.L(FIELD_AUDIO_MODE, FIELD_TRANSLATION_VISIBILITY, FIELD_ORIGINAL_VISIBILITY, FIELD_OPTION_TAP_AUDIO_ENABLED, FIELD_UPDATED_AT);

    public static final String buildCourseQuestionPreferenceProgressId(int i11) {
        return COURSE_QUESTION_PREFERENCE_PROGRESS_ID_PREFIX.concat(d.k(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long extractUpdatedAt(m mVar) {
        m mVar2;
        z zVar = mVar instanceof z ? (z) mVar : null;
        if (zVar != null && (mVar2 = (m) zVar.get(FIELD_UPDATED_AT)) != null) {
            try {
                return Long.valueOf(n.j(n.h(mVar2)));
            } catch (JsonDecodingException unused) {
            }
        }
        return null;
    }

    public static final boolean isCourseQuestionPreferenceProgressId(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        return x.s0(id2, COURSE_QUESTION_PREFERENCE_PROGRESS_ID_PREFIX, false);
    }

    public static final List<String> buildAllCourseQuestionPreferenceProgressIds(Iterable<Integer> iterable) {
        kotlin.jvm.internal.m.f(iterable, evRpcb.ZfbOilFUDMzLUfG);
        ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(buildCourseQuestionPreferenceProgressId(it.next().intValue()));
        }
        return arrayList;
    }
}
