package tw;

import android.content.Context;
import android.content.Intent;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.Log;
import androidx.glance.appwidget.protobuf.z;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import b1.p;
import ce.f0;
import ce.g0;
import com.google.firebase.inappmessaging.internal.k;
import com.google.protobuf.DescriptorProtos;
import com.lingo.course.ui.CourseReviewTestActivity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.UCrop;
import defpackage.e;
import f10.h;
import ge.d;
import hh.p0;
import ie.g;
import ie.i;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import lf.r;
import mw.k1;
import mw.l5;
import n3.x;
import ns.o;
import org.json.JSONArray;
import org.json.JSONObject;
import p9.q;
import qy.l;
import rt.r8;
import td.j;
import td.m;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements yw.c, yw.b, g0, com.bumptech.glide.b, h, z, m, g, ie.m, m20.b, x, l5, q, qe.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f52661b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52662a;

    public /* synthetic */ c(int i11) {
        this.f52662a = i11;
    }

    public static r n() {
        return new r(null, ry.x.V(new l(2, null), new l(4, null), new l(9, null), new l(17, null), new l(341, null)), ry.x.V(new l(102, null), new l(190, null), new l(412, null)), null, null, null);
    }

    public static int o(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    public static Intent p(Context context, LanguageItem languageItem, boolean z11, String source) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(languageItem, "languageItem");
        kotlin.jvm.internal.m.f(source, "source");
        Intent intent = new Intent(context, (Class<?>) SwitchLanguageActivity.class);
        intent.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
        intent.putExtra(INTENTS.EXTRA_BOOLEAN, z11);
        intent.putExtra(INTENTS.EXTRA_STRING, source);
        return intent;
    }

    public static Intent r(Context context, List baseReviews, CoursePracticeType practiceType, r8 r8Var, int i11) {
        int i12 = CourseReviewTestActivity.M;
        if ((i11 & 8) != 0) {
            practiceType = CoursePracticeType.COURSE_REVIEW_WORD_SENT;
        }
        if ((i11 & 16) != 0) {
            r8Var = null;
        }
        kotlin.jvm.internal.m.f(baseReviews, "baseReviews");
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        Intent intent = new Intent(context, (Class<?>) CourseReviewTestActivity.class);
        intent.putExtra(INTENTS.EXTRA_INT_2, -1);
        intent.putExtra(INTENTS.EXTRA_STRING, practiceType.getValue());
        if (r8Var != null) {
            intent.putExtra("course_review_practice_model", r8Var.b());
        }
        intent.putParcelableArrayListExtra(INTENTS.EXTRA_ARRAY_LIST, new ArrayList<>(baseReviews));
        return intent;
    }

    public static HashMap s(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        int iOptInt2 = jSONArrayOptJSONArray2.optInt(i12);
                        if (iOptInt2 != 0) {
                            hashSet.add(Integer.valueOf(iOptInt2));
                        }
                    }
                }
                map.put(Integer.valueOf(iOptInt), hashSet);
            }
        }
        return map;
    }

    public static List t(ArrayList arrayList) {
        if (arrayList.size() <= 4) {
            return o.K(arrayList);
        }
        ArrayList arrayListC1 = ry.m.c1(ry.m.g1(arrayList, 4, 4));
        if (arrayListC1.size() >= 2 && ((List) ry.m.z0(arrayListC1)).size() == 1) {
            ArrayList arrayListC2 = ry.m.c1((Collection) p0.f(1, arrayListC1));
            ArrayList arrayListC3 = ry.m.c1((Collection) p0.f(1, arrayListC1));
            arrayListC2.add(0, arrayListC3.remove(arrayListC3.size() - 1));
            arrayListC1.add(arrayListC3);
            arrayListC1.add(arrayListC2);
        }
        return arrayListC1;
    }

    @Override // f10.h
    public void a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(o(level), "EventBus", str);
        }
    }

    @Override // yw.b
    public void accept(Object obj) {
        qx.b.B(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // yw.c
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return k.a(objArr[0], objArr[1]);
        }
        throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
    }

    @Override // mw.l5
    public Object b() {
        switch (this.f52662a) {
            case 23:
                return Executors.newCachedThreadPool(k1.e("grpc-okhttp-%d"));
            default:
                return new ArrayList();
        }
    }

    @Override // com.bumptech.glide.b
    public le.g build() {
        return new le.g();
    }

    @Override // ie.g
    public void c(i iVar) {
    }

    @Override // td.m
    public td.c d(j jVar) {
        return td.c.SOURCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x00db  */
    /* JADX WARN: Code duplicated, block: B:91:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // m20.b
    public m20.a e(CharSequence charSequence, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        char cCharAt;
        int i16;
        boolean z13;
        int i17 = -1;
        boolean z14 = true;
        for (int i18 = i11 - 1; i18 >= i12; i18--) {
            char cCharAt2 = charSequence.charAt(i18);
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 >= 128 || cCharAt2 == '!' || cCharAt2 == '-' || cCharAt2 == '/' || cCharAt2 == '=' || cCharAt2 == '?' || cCharAt2 == '*' || cCharAt2 == '+'))) {
                switch (cCharAt2) {
                    default:
                        switch (cCharAt2) {
                            default:
                                switch (cCharAt2) {
                                    case '{':
                                    case '|':
                                    case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                    case '~':
                                        break;
                                    default:
                                        if (cCharAt2 == '.' && !z14) {
                                            z14 = true;
                                        }
                                        break;
                                }
                            case '^':
                            case '_':
                            case UCrop.RESULT_ERROR /* 96 */:
                                i17 = i18;
                                z14 = false;
                                continue;
                        }
                    case '#':
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case '%':
                    case '&':
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        i17 = i18;
                        z14 = false;
                        continue;
                }
                if (i17 == -1) {
                    return null;
                }
                i13 = i11 + 1;
                i14 = -1;
                i15 = -1;
                z11 = true;
                z12 = false;
                while (i13 < charSequence.length()) {
                    cCharAt = charSequence.charAt(i13);
                    if (z11) {
                        if ((cCharAt >= 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt < 128))) {
                            if (i14 != -1 || i14 > i15) {
                                i15 = -1;
                            }
                            if (i15 == -1) {
                                return null;
                            }
                            return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                        }
                        i16 = i13;
                        z13 = true;
                        z11 = false;
                    } else if (cCharAt == '.') {
                        if (!z12) {
                            if (i14 != -1) {
                                i15 = -1;
                            } else {
                                i15 = -1;
                            }
                            if (i15 == -1) {
                                return null;
                            }
                            return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                        }
                        if (i14 == -1) {
                            z13 = z12;
                            i16 = i15;
                            z11 = true;
                            i14 = i13;
                        } else {
                            i16 = i15;
                            z11 = true;
                            z13 = z12;
                        }
                    } else if (cCharAt == '-') {
                        i16 = i15;
                        i14 = i14;
                        z13 = false;
                    } else {
                        if ((cCharAt >= 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < '0' || cCharAt > '9'))) {
                            if (cCharAt < 128) {
                                if (i14 != -1) {
                                    i15 = -1;
                                } else {
                                    i15 = -1;
                                }
                                if (i15 == -1) {
                                    return null;
                                }
                                return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                            }
                        }
                        i16 = i13;
                        i14 = i14;
                        z13 = true;
                    }
                    i13++;
                    z12 = z13;
                    i14 = i14;
                    i15 = i16;
                }
                if (i14 != -1) {
                    i15 = -1;
                } else {
                    i15 = -1;
                }
                if (i15 == -1) {
                    return null;
                }
                return new m20.a(l20.c.EMAIL, i17, i15 + 1);
            }
            i17 = i18;
            z14 = false;
            continue;
        }
        if (i17 == -1) {
            return null;
        }
        i13 = i11 + 1;
        i14 = -1;
        i15 = -1;
        z11 = true;
        z12 = false;
        while (i13 < charSequence.length()) {
            cCharAt = charSequence.charAt(i13);
            if (z11) {
                if (cCharAt >= 'A') {
                    if (i14 != -1) {
                        i15 = -1;
                    } else {
                        i15 = -1;
                    }
                    if (i15 == -1) {
                        return null;
                    }
                    return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                }
                if (i14 != -1) {
                    i15 = -1;
                } else {
                    i15 = -1;
                }
                if (i15 == -1) {
                    return null;
                }
                return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                i16 = i13;
                z13 = true;
                z11 = false;
            } else if (cCharAt == '.') {
                if (!z12) {
                    if (i14 != -1) {
                        i15 = -1;
                    } else {
                        i15 = -1;
                    }
                    if (i15 == -1) {
                        return null;
                    }
                    return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                }
                if (i14 == -1) {
                    z13 = z12;
                    i16 = i15;
                    z11 = true;
                    i14 = i13;
                } else {
                    i16 = i15;
                    z11 = true;
                    z13 = z12;
                }
            } else if (cCharAt == '-') {
                i16 = i15;
                i14 = i14;
                z13 = false;
            } else {
                if (cCharAt >= 'A') {
                    if (cCharAt < 128) {
                        if (i14 != -1) {
                            i15 = -1;
                        } else {
                            i15 = -1;
                        }
                        if (i15 == -1) {
                            return null;
                        }
                        return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                    }
                } else if (cCharAt < 128) {
                    if (i14 != -1) {
                        i15 = -1;
                    } else {
                        i15 = -1;
                    }
                    if (i15 == -1) {
                        return null;
                    }
                    return new m20.a(l20.c.EMAIL, i17, i15 + 1);
                }
                i16 = i13;
                i14 = i14;
                z13 = true;
            }
            i13++;
            z12 = z13;
            i14 = i14;
            i15 = i16;
        }
        if (i14 != -1) {
            i15 = -1;
        } else {
            i15 = -1;
        }
        if (i15 == -1) {
            return null;
        }
        return new m20.a(l20.c.EMAIL, i17, i15 + 1);
    }

    @Override // p9.q
    public CharSequence f(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.f2310v0) ? editTextPreference.f2319a.getString(R.string.not_set) : editTextPreference.f2310v0;
    }

    @Override // mw.l5
    public void g(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // td.d
    public boolean h(Object obj, File file, j jVar) throws Throwable {
        try {
            pe.b.d(((ge.i) ((d) ((b0) obj).get()).f29140a.f29139b).f29154a.f51562d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // ce.g0
    public void i(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new f0((ByteBuffer) obj));
    }

    @Override // ie.g
    public void j(i iVar) {
        iVar.onStart();
    }

    @Override // ce.g0
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new f0((ByteBuffer) obj));
    }

    @Override // f10.h
    public void l(Level level, String str, Throwable th2) {
        if (level != Level.OFF) {
            int iO = o(level);
            StringBuilder sbR = e.r(str, "\n");
            sbR.append(Log.getStackTraceString(th2));
            Log.println(iO, "EventBus", sbR.toString());
        }
    }

    public synchronized r m() {
        r rVar;
        try {
            if (r.f40110e == null) {
                r.f40110e = n();
            }
            rVar = r.f40110e;
            kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
        } catch (Throwable th2) {
            throw th2;
        }
        return rVar;
    }

    public /* synthetic */ c(Object obj, int i11) {
        this.f52662a = i11;
    }

    public c(p pVar, androidx.fragment.app.k1 k1Var) {
        this.f52662a = 15;
    }
}
