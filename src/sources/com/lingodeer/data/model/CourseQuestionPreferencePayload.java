package com.lingodeer.data.model;

import com.bumptech.glide.e;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import h00.d0;
import h00.m;
import h00.n;
import h00.t;
import h00.w;
import h00.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.f;
import kotlinx.serialization.json.internal.JsonDecodingException;
import oz.q;
import qx.b;
import ry.x;
import xt.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseQuestionPreferencePayload {
    public static final Companion Companion = new Companion(null);
    private final LinkedHashMap<String, m> entries;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final CourseQuestionPreferencePayload fromPreferences(Collection<CourseQuestionPreference> preferences) {
            kotlin.jvm.internal.m.f(preferences, "preferences");
            CourseQuestionPreferencePayload courseQuestionPreferencePayload = new CourseQuestionPreferencePayload(new LinkedHashMap(), null);
            courseQuestionPreferencePayload.upsertAll(preferences);
            return courseQuestionPreferencePayload;
        }

        public final CourseQuestionPreferencePayload parse(String str) {
            Object objL;
            f fVar = null;
            if (str == null || q.K0(str)) {
                return new CourseQuestionPreferencePayload(new LinkedHashMap(), fVar);
            }
            try {
                objL = n.g(c.f56291a.d(str));
            } catch (Throwable th2) {
                objL = e.l(th2);
            }
            if (objL instanceof qy.n) {
                objL = null;
            }
            z zVar = (z) objL;
            if (zVar == null) {
                return new CourseQuestionPreferencePayload(new LinkedHashMap(), fVar);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ry.m.S0(zVar.f29949a.entrySet(), new Comparator() { // from class: com.lingodeer.data.model.CourseQuestionPreferencePayload$Companion$parse$lambda$3$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t6, T t8) {
                    return b.i((String) ((Map.Entry) t6).getKey(), (String) ((Map.Entry) t8).getKey());
                }
            })) {
                linkedHashMap.put((String) entry.getKey(), (m) entry.getValue());
            }
            return new CourseQuestionPreferencePayload(linkedHashMap, fVar);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CourseQuestionPreferencePayload(LinkedHashMap linkedHashMap, f fVar) {
        this(linkedHashMap);
    }

    private final m normalizeElement(m mVar) {
        z zVar = mVar instanceof z ? (z) mVar : null;
        if (zVar == null) {
            return mVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : CourseQuestionPreferencePayloadKt.COURSE_QUESTION_PREFERENCE_ITEM_FIELD_ORDER) {
            m mVar2 = (m) zVar.get(str);
            if (mVar2 != null) {
                linkedHashMap.put(str, mVar2);
            }
        }
        Set setEntrySet = zVar.f29949a.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (!CourseQuestionPreferencePayloadKt.COURSE_QUESTION_PREFERENCE_ITEM_FIELD_ORDER.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : ry.m.S0(arrayList, new Comparator() { // from class: com.lingodeer.data.model.CourseQuestionPreferencePayload$normalizeElement$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t6, T t8) {
                return b.i((String) ((Map.Entry) t6).getKey(), (String) ((Map.Entry) t8).getKey());
            }
        })) {
            linkedHashMap.put((String) entry.getKey(), (m) entry.getValue());
        }
        return new z(linkedHashMap);
    }

    private final m resolveMergedElement(m mVar, m mVar2, boolean z11) {
        if (!kotlin.jvm.internal.m.a(mVar, mVar2)) {
            Long lExtractUpdatedAt = CourseQuestionPreferencePayloadKt.extractUpdatedAt(mVar);
            Long lExtractUpdatedAt2 = CourseQuestionPreferencePayloadKt.extractUpdatedAt(mVar2);
            if (lExtractUpdatedAt == null || lExtractUpdatedAt2 == null || lExtractUpdatedAt.equals(lExtractUpdatedAt2) ? (lExtractUpdatedAt == null || lExtractUpdatedAt2 != null) && ((lExtractUpdatedAt2 != null && lExtractUpdatedAt == null) || !z11) : lExtractUpdatedAt.longValue() < lExtractUpdatedAt2.longValue()) {
                return mVar2;
            }
        }
        return mVar;
    }

    public final long maxUpdatedAt() {
        Collection<m> collectionValues = this.entries.values();
        kotlin.jvm.internal.m.e(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            Long lExtractUpdatedAt = CourseQuestionPreferencePayloadKt.extractUpdatedAt((m) it.next());
            if (lExtractUpdatedAt != null) {
                arrayList.add(lExtractUpdatedAt);
            }
        }
        Long l9 = (Long) ry.m.B0(arrayList);
        if (l9 != null) {
            return l9.longValue();
        }
        return 0L;
    }

    public final CourseQuestionPreferencePayload mergedWith(CourseQuestionPreferencePayload remote, boolean z11) {
        kotlin.jvm.internal.m.f(remote, "remote");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setKeySet = this.entries.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "<get-keys>(...)");
        Set<String> setKeySet2 = remote.entries.keySet();
        kotlin.jvm.internal.m.e(setKeySet2, "<get-keys>(...)");
        LinkedHashSet linkedHashSetD = b.D(setKeySet, setKeySet2);
        TreeSet<String> treeSet = new TreeSet();
        ry.m.X0(linkedHashSetD, treeSet);
        for (String str : treeSet) {
            m mVarResolveMergedElement = this.entries.get(str);
            m mVar = remote.entries.get(str);
            if (mVarResolveMergedElement == null && mVar != null) {
                mVarResolveMergedElement = mVar;
            } else if (mVar != null || mVarResolveMergedElement == null) {
                if (mVarResolveMergedElement != null && mVar != null) {
                    mVarResolveMergedElement = resolveMergedElement(mVarResolveMergedElement, mVar, z11);
                }
            }
            linkedHashMap.put(str, mVarResolveMergedElement);
        }
        return new CourseQuestionPreferencePayload(new LinkedHashMap(linkedHashMap));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    public final List<CourseQuestionPreference> toPreferences(int i11) {
        m mVar;
        CourseAudioMode courseAudioModeCourseAudioModeFromWireName;
        m mVar2;
        CourseVisibilityMode courseVisibilityModeCourseVisibilityModeFromWireName;
        m mVar3;
        CourseVisibilityMode courseVisibilityModeCourseVisibilityModeFromWireName2;
        m mVar4;
        Boolean boolD;
        Long lValueOf;
        int i12;
        LinkedHashMap<String, m> linkedHashMap = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, m> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            m value = entry.getValue();
            CourseQuestionPreferenceKey courseQuestionPreferenceKeyCourseQuestionPreferenceKeyFromWireName = CourseQuestionPreferenceKt.courseQuestionPreferenceKeyFromWireName(key);
            CourseQuestionPreference courseQuestionPreference = null;
            if (courseQuestionPreferenceKeyCourseQuestionPreferenceKeyFromWireName != null) {
                z zVar = value instanceof z ? (z) value : null;
                if (zVar == null || (mVar = (m) zVar.get("audio_mode")) == null) {
                    i12 = i11;
                } else {
                    d0 d0VarH = n.h(mVar);
                    String strB = d0VarH instanceof w ? null : d0VarH.b();
                    if (strB == null || (courseAudioModeCourseAudioModeFromWireName = CourseQuestionPreferenceKt.courseAudioModeFromWireName(strB)) == null || (mVar2 = (m) zVar.get("translation_visibility")) == null) {
                        i12 = i11;
                    } else {
                        d0 d0VarH2 = n.h(mVar2);
                        String strB2 = d0VarH2 instanceof w ? null : d0VarH2.b();
                        if (strB2 == null || (courseVisibilityModeCourseVisibilityModeFromWireName = CourseQuestionPreferenceKt.courseVisibilityModeFromWireName(strB2)) == null || (mVar3 = (m) zVar.get("original_visibility")) == null) {
                            i12 = i11;
                        } else {
                            d0 d0VarH3 = n.h(mVar3);
                            String strB3 = d0VarH3 instanceof w ? null : d0VarH3.b();
                            if (strB3 == null || (courseVisibilityModeCourseVisibilityModeFromWireName2 = CourseQuestionPreferenceKt.courseVisibilityModeFromWireName(strB3)) == null || (mVar4 = (m) zVar.get("option_tap_audio_enabled")) == null || (boolD = n.d(n.h(mVar4))) == null) {
                                i12 = i11;
                            } else {
                                boolean zBooleanValue = boolD.booleanValue();
                                m mVar5 = (m) zVar.get("updated_at");
                                if (mVar5 != null) {
                                    try {
                                        lValueOf = Long.valueOf(n.j(n.h(mVar5)));
                                    } catch (JsonDecodingException unused) {
                                        lValueOf = null;
                                    }
                                    if (lValueOf != null) {
                                        i12 = i11;
                                        courseQuestionPreference = new CourseQuestionPreference(i12, courseQuestionPreferenceKeyCourseQuestionPreferenceKeyFromWireName, courseAudioModeCourseAudioModeFromWireName, courseVisibilityModeCourseVisibilityModeFromWireName, courseVisibilityModeCourseVisibilityModeFromWireName2, zBooleanValue, lValueOf.longValue());
                                    } else {
                                        i12 = i11;
                                    }
                                } else {
                                    i12 = i11;
                                }
                            }
                        }
                    }
                }
            } else {
                i12 = i11;
            }
            if (courseQuestionPreference != null) {
                arrayList.add(courseQuestionPreference);
            }
            i11 = i12;
        }
        return ry.m.S0(arrayList, new Comparator() { // from class: com.lingodeer.data.model.CourseQuestionPreferencePayload$toPreferences$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t6, T t8) {
                return b.i(Integer.valueOf(((CourseQuestionPreference) t6).getQuestionTypeKey().ordinal()), Integer.valueOf(((CourseQuestionPreference) t8).getQuestionTypeKey().ordinal()));
            }
        });
    }

    public final void upsert(CourseQuestionPreference preference) {
        kotlin.jvm.internal.m.f(preference, "preference");
        String wireName = preference.getQuestionTypeKey().getWireName();
        m mVar = this.entries.get(wireName);
        this.entries.put(wireName, buildPreferenceItem(preference, mVar instanceof z ? (z) mVar : null));
    }

    public final void upsertAll(Collection<CourseQuestionPreference> preferences) {
        kotlin.jvm.internal.m.f(preferences, "preferences");
        Iterator it = ry.m.S0(preferences, new Comparator() { // from class: com.lingodeer.data.model.CourseQuestionPreferencePayload$upsertAll$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t6, T t8) {
                return b.i(Integer.valueOf(((CourseQuestionPreference) t6).getQuestionTypeKey().ordinal()), Integer.valueOf(((CourseQuestionPreference) t8).getQuestionTypeKey().ordinal()));
            }
        }).iterator();
        while (it.hasNext()) {
            upsert((CourseQuestionPreference) it.next());
        }
    }

    private CourseQuestionPreferencePayload(LinkedHashMap<String, m> linkedHashMap) {
        this.entries = linkedHashMap;
    }

    private final z buildPreferenceItem(CourseQuestionPreference courseQuestionPreference, z zVar) {
        Set setEntrySet;
        gc.m mVar = new gc.m();
        mVar.a(n.b(courseQuestionPreference.getAudioMode().getWireName()), "audio_mode");
        mVar.a(n.b(courseQuestionPreference.getTranslationVisibility().getWireName()), "translation_visibility");
        mVar.a(n.b(courseQuestionPreference.getOriginalVisibility().getWireName()), "original_visibility");
        mVar.a(new t(Boolean.valueOf(courseQuestionPreference.getOptionTapAudioEnabled()), false, null), "option_tap_audio_enabled");
        mVar.a(n.a(Long.valueOf(courseQuestionPreference.getUpdatedAt())), gkbGsXmgaxRjJ.IBNbMyrS);
        if (zVar != null && (setEntrySet = zVar.f29949a.entrySet()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (!CourseQuestionPreferencePayloadKt.COURSE_QUESTION_PREFERENCE_ITEM_FIELD_ORDER.contains(((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            for (Map.Entry entry : ry.m.S0(arrayList, new Comparator() { // from class: com.lingodeer.data.model.CourseQuestionPreferencePayload$buildPreferenceItem$lambda$18$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t6, T t8) {
                    return b.i((String) ((Map.Entry) t6).getKey(), (String) ((Map.Entry) t8).getKey());
                }
            })) {
                mVar.a((m) entry.getValue(), (String) entry.getKey());
            }
        }
        return new z(mVar.f29058a);
    }

    public final String toProgressString() {
        if (this.entries.isEmpty()) {
            return BuildConfig.VERSION_NAME;
        }
        Set<Map.Entry<String, m>> setEntrySet = this.entries.entrySet();
        kotlin.jvm.internal.m.e(setEntrySet, "<get-entries>(...)");
        List<Map.Entry> listS0 = ry.m.S0(setEntrySet, new Comparator() { // from class: com.lingodeer.data.model.CourseQuestionPreferencePayload$toProgressString$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t6, T t8) {
                return b.i((String) ((Map.Entry) t6).getKey(), (String) ((Map.Entry) t8).getKey());
            }
        });
        int iW = x.W(ry.n.W(listS0, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Map.Entry entry : listS0) {
            kotlin.jvm.internal.m.c(entry);
            Object key = entry.getKey();
            kotlin.jvm.internal.m.e(key, xItStCyvVEZ.HIRiGuXFSMMT);
            Object value = entry.getValue();
            kotlin.jvm.internal.m.e(value, "component2(...)");
            linkedHashMap.put((String) key, normalizeElement((m) value));
        }
        return c.f56291a.c(z.Companion.serializer(), new z(linkedHashMap));
    }
}
