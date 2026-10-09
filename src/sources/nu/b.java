package nu;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import app.rive.runtime.kotlin.RiveAnimationView;
import bq.z;
import com.google.api.Service;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SentenceMFType;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.lingodeer.syllable_ko.model.KOSyllableModel;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.j4;
import fr.o0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l0.w;
import l1.a1;
import l1.h1;
import mt.q2;
import ns.o;
import ot.a2;
import ot.b1;
import ot.c1;
import ot.e1;
import ot.g1;
import ot.j1;
import ot.l1;
import ot.u1;
import ot.x1;
import ot.z0;
import ot.z1;
import qy.l;
import qy.q;
import rt.b4;
import rt.bb;
import rt.j2;
import rt.kd;
import rt.qc;
import rt.qd;
import rt.r5;
import rt.rc;
import rt.rd;
import rt.t4;
import rt.ve;
import rt.we;
import rt.xe;
import rt.y8;
import rt.y9;
import ry.n;
import ry.x;
import rz.b0;
import rz.d0;
import rz.d2;
import rz.t;
import sv.r;
import tp.f0;
import tu.e0;
import tu.m0;
import tu.v;
import uz.p0;
import vt.n0;
import zu.d1;
import zu.i1;
import zu.s2;
import zu.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f44050a = i11;
        this.f44051b = obj;
        this.f44052c = obj2;
    }

    private final Object e(Object obj) {
        j1 b1Var;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        KOSyllableLesson kOSyllableLesson = (KOSyllableLesson) this.f44051b;
        List<KOSyllableModel> models = kOSyllableLesson.getModels();
        ArrayList arrayList = (ArrayList) this.f44052c;
        int i11 = 10;
        ArrayList arrayList2 = new ArrayList(n.W(models, 10));
        Iterator it = models.iterator();
        while (it.hasNext()) {
            KOSyllableModel kOSyllableModel = (KOSyllableModel) it.next();
            long jHashCode = kOSyllableModel.getCharacter().hashCode();
            CourseWord courseWord = new CourseWord(jHashCode, kOSyllableModel.getCharacter(), 3, BuildConfig.VERSION_NAME);
            String romanization = kOSyllableModel.getRomanization();
            q qVar = fv.b.f28186a;
            Uri uri = Uri.parse(fv.b.l(kOSyllableModel.getRomanization()));
            m.e(uri, "parse(...)");
            CourseWord courseWordCopy$default = CourseWord.copy$default(courseWord, 0L, null, romanization, null, null, null, 0, 0, null, null, null, null, null, kOSyllableModel.getPronunciation(), null, uri, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -40965, 63, null);
            arrayList.add(courseWordCopy$default);
            List listL = o.L(kOSyllableModel.getOption1(), kOSyllableModel.getOption2(), kOSyllableModel.getOption3());
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listL) {
                if (((String) obj2).length() > 0) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(n.W(arrayList3, i11));
            int size = arrayList3.size();
            int i12 = 0;
            int i13 = 0;
            while (i12 < size) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                int i14 = i13 + 1;
                if (i13 < 0) {
                    o.V();
                    throw null;
                }
                String str = (String) obj3;
                CourseWord courseWord2 = new CourseWord(i14, (String) oz.q.W0(str, new String[]{"/"}, 0, 6).get(0), 3, BuildConfig.VERSION_NAME);
                String str2 = (String) oz.q.W0(str, new String[]{"/"}, 0, 6).get(1);
                q qVar2 = fv.b.f28186a;
                Uri uri2 = Uri.parse(fv.b.l((String) oz.q.W0(str, new String[]{"/"}, 0, 6).get(1)));
                m.e(uri2, "parse(...)");
                arrayList4.add(CourseWord.copy$default(courseWord2, 0L, null, str2, null, null, null, 0, 0, null, null, null, null, null, null, null, uri2, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -32773, 63, null));
                i13 = i14;
                kOSyllableLesson = kOSyllableLesson;
                it = it;
                arrayList = arrayList;
            }
            KOSyllableLesson kOSyllableLesson2 = kOSyllableLesson;
            Iterator it2 = it;
            ArrayList arrayList5 = arrayList;
            List listS = o.S(ry.m.G0(courseWordCopy$default, arrayList4));
            int i15 = r.f51844a[kOSyllableModel.getType().ordinal()];
            ry.r rVar = ry.r.f50854a;
            switch (i15) {
                case 1:
                    b1Var = new b1(new ht.o(jHashCode, 2, 2), new u1(courseWordCopy$default, listS));
                    break;
                case 2:
                    b1Var = new c1(ht.o.a(new ht.o(jHashCode, 2, 3), 0, 0L, false, false, false, false, false, false, false, false, com.bumptech.glide.f.G(kOSyllableLesson2.getType(), kOSyllableModel.getType()), false, null, 458751), new u1(courseWordCopy$default, listS));
                    break;
                case 3:
                    List listL2 = o.L(kOSyllableModel.getOption1(), kOSyllableModel.getOption2(), kOSyllableModel.getOption3());
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : listL2) {
                        if (((String) obj4).length() > 0) {
                            arrayList6.add(obj4);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(n.W(arrayList6, 10));
                    int size2 = arrayList6.size();
                    int i16 = 0;
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i18 = i16 + 1;
                        if (i16 < 0) {
                            o.V();
                            throw null;
                        }
                        String str3 = (String) obj5;
                        ArrayList arrayList8 = arrayList6;
                        CourseWord courseWord3 = new CourseWord(i18, (String) oz.q.W0(str3, new String[]{"/"}, 0, 6).get(0), 3);
                        String str4 = (String) oz.q.W0(str3, new String[]{"/"}, 0, 6).get(1);
                        q qVar3 = fv.b.f28186a;
                        Uri uri3 = Uri.parse(fv.b.l((String) oz.q.W0(str3, new String[]{"/"}, 0, 6).get(1)));
                        m.e(uri3, "parse(...)");
                        arrayList7.add(CourseWord.copy$default(courseWord3, 0L, null, str4, null, null, null, 0, 0, null, null, null, null, null, null, null, uri3, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -32773, 63, null));
                        i16 = i18;
                        arrayList6 = arrayList8;
                    }
                    ArrayList arrayListG0 = ry.m.G0(courseWordCopy$default, arrayList7);
                    b1Var = new g1(ht.o.a(new ht.o(jHashCode, 2, 7), 0, 0L, false, false, false, false, false, false, false, false, com.bumptech.glide.f.G(kOSyllableLesson2.getType(), kOSyllableModel.getType()), false, null, 458751), new z1(o.S(arrayListG0), o.S(arrayListG0), a2.AudioWord));
                    break;
                case 4:
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    List listH1 = oz.q.h1(kOSyllableModel.getCharacter());
                    ArrayList arrayList11 = new ArrayList(n.W(listH1, 10));
                    int i19 = 0;
                    for (Object obj6 : listH1) {
                        int i21 = i19 + 1;
                        if (i19 < 0) {
                            o.V();
                            throw null;
                        }
                        arrayList11.add(CourseWord.copy$default(new CourseWord((10 * courseWordCopy$default.getWordId()) + ((long) i19), "_", 3), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, true, false, String.valueOf(((Character) obj6).charValue()), null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -5242881, 63, null));
                        i19 = i21;
                    }
                    List listK = o.K(CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList11, null, null, null, null, 0, -1, 62, null));
                    List listW0 = oz.q.W0(courseWordCopy$default.getZhuYin(), new String[]{"-"}, 0, 6);
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj7 : listW0) {
                        if (((String) obj7).length() > 0) {
                            arrayList12.add(obj7);
                        }
                    }
                    String word = courseWordCopy$default.getWord();
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < word.length()) {
                        arrayList10.add(CourseWord.copy$default(new CourseWord(((long) i23) + (((long) 10) * courseWordCopy$default.getWordId()), String.valueOf(word.charAt(i22)), 3), 0L, null, (String) arrayList12.get(i23), null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -5, 63, null));
                        i22++;
                        i23++;
                    }
                    List listL3 = o.L(kOSyllableModel.getOption1(), kOSyllableModel.getOption2(), kOSyllableModel.getOption3());
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj8 : listL3) {
                        if (((String) obj8).length() > 0) {
                            arrayList13.add(obj8);
                        }
                    }
                    ArrayList arrayList14 = new ArrayList(n.W(arrayList13, 10));
                    int size3 = arrayList13.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        Object obj9 = arrayList13.get(i24);
                        i24++;
                        arrayList14.add((String) oz.q.W0((String) obj9, new String[]{"/"}, 0, 6).get(0));
                    }
                    ArrayList arrayListG1 = ry.m.G0(courseWordCopy$default.getWord(), arrayList14);
                    int size4 = arrayListG1.size();
                    int i25 = 0;
                    long j11 = 10000;
                    while (i25 < size4) {
                        Object obj10 = arrayListG1.get(i25);
                        i25++;
                        CharSequence charSequence = (CharSequence) oz.q.W0((String) obj10, new String[]{"/"}, 0, 6).get(0);
                        for (int i26 = 0; i26 < charSequence.length(); i26++) {
                            j11++;
                            arrayList9.add(new CourseWord(j11, String.valueOf(charSequence.charAt(i26)), 3));
                            Collections.shuffle(arrayList9);
                        }
                    }
                    b1Var = new e1(ht.o.a(new ht.o(jHashCode, 2, 5), 0, 0L, false, false, false, false, false, false, false, false, com.bumptech.glide.f.G(kOSyllableLesson2.getType(), kOSyllableModel.getType()), false, null, 458751), new x1(CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList10, null, null, null, null, 0, -1, 62, null), listK, arrayList9, rVar, rVar));
                    break;
                case 5:
                    ht.o oVarA = ht.o.a(new ht.o(jHashCode, 2, 11), 0, 0L, false, false, false, false, false, false, false, false, com.bumptech.glide.f.G(kOSyllableLesson2.getType(), kOSyllableModel.getType()), false, null, 458751);
                    List listK2 = o.K(courseWordCopy$default);
                    CourseWord courseWord4 = new CourseWord(courseWordCopy$default.getWordId() + 1, BuildConfig.VERSION_NAME, 3);
                    q qVar4 = fv.b.f28186a;
                    Uri uri4 = Uri.parse(fv.b.l(courseWordCopy$default.getZhuYin() + "_wrong"));
                    m.e(uri4, "parse(...)");
                    b1Var = new z0(oVarA, new u1(courseWordCopy$default, o.S(ry.m.G0(CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, uri4, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -32769, 63, null), listK2))));
                    break;
                case 6:
                    ArrayList arrayList15 = new ArrayList();
                    ArrayList arrayList16 = new ArrayList();
                    List listH2 = oz.q.h1(kOSyllableModel.getPronunciation());
                    ArrayList arrayList17 = new ArrayList(n.W(listH2, 10));
                    Iterator it3 = listH2.iterator();
                    int i27 = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            o.V();
                            throw null;
                        }
                        arrayList17.add(CourseWord.copy$default(new CourseWord((courseWordCopy$default.getWordId() * ((long) 10)) + ((long) i27), "_", 3), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, true, false, String.valueOf(((Character) next).charValue()), null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -5242881, 63, null));
                        i27 = i28;
                        it3 = it3;
                        kOSyllableModel = kOSyllableModel;
                    }
                    KOSyllableModel kOSyllableModel2 = kOSyllableModel;
                    List listK3 = o.K(CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList17, null, null, null, null, 0, -1, 62, null));
                    int i29 = 0;
                    int i30 = 0;
                    for (CharSequence charSequence2 = (CharSequence) oz.q.W0(courseWordCopy$default.getWord(), new String[]{"/"}, 0, 6).get(0); i29 < charSequence2.length(); charSequence2 = charSequence2) {
                        arrayList16.add(new CourseWord((courseWordCopy$default.getWordId() * ((long) 10)) + ((long) i30), String.valueOf(charSequence2.charAt(i29)), 3));
                        i29++;
                        i30++;
                        listK3 = listK3;
                    }
                    List list = listK3;
                    List listL4 = o.L(kOSyllableModel2.getOption1(), kOSyllableModel2.getOption2(), kOSyllableModel2.getOption3());
                    ArrayList arrayList18 = new ArrayList();
                    for (Object obj11 : listL4) {
                        if (((String) obj11).length() > 0) {
                            arrayList18.add(obj11);
                        }
                    }
                    ArrayList arrayList19 = new ArrayList(n.W(arrayList18, 10));
                    int size5 = arrayList18.size();
                    int i31 = 0;
                    while (i31 < size5) {
                        Object obj12 = arrayList18.get(i31);
                        i31++;
                        arrayList19.add((String) oz.q.W0((String) obj12, new String[]{"/"}, 0, 6).get(0));
                    }
                    ArrayList arrayListG2 = ry.m.G0(kOSyllableModel2.getPronunciation(), arrayList19);
                    int size6 = arrayListG2.size();
                    int i32 = 0;
                    long j12 = 10000;
                    while (i32 < size6) {
                        Object obj13 = arrayListG2.get(i32);
                        i32++;
                        CharSequence charSequence3 = (CharSequence) oz.q.W0((String) obj13, new String[]{"/"}, 0, 6).get(0);
                        for (int i33 = 0; i33 < charSequence3.length(); i33++) {
                            j12++;
                            arrayList15.add(new CourseWord(j12, String.valueOf(charSequence3.charAt(i33)), 3));
                            Collections.shuffle(arrayList15);
                        }
                    }
                    List listH3 = oz.q.h1(kOSyllableModel2.getCharacter());
                    ArrayList arrayList20 = new ArrayList(n.W(listH3, 10));
                    Iterator it4 = listH3.iterator();
                    int i34 = 0;
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            o.V();
                            throw null;
                        }
                        arrayList20.add(new CourseWord((courseWordCopy$default.getWordId() * ((long) 10)) + ((long) i34), String.valueOf(((Character) next2).charValue()), 3));
                        i34 = i35;
                        it4 = it4;
                        arrayList16 = arrayList16;
                    }
                    ArrayList arrayList21 = arrayList16;
                    arrayList15.addAll(arrayList20);
                    ht.o oVar = new ht.o(jHashCode, 2, 5);
                    CourseWord courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList21, null, null, null, null, 0, -1, 62, null);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList22 = new ArrayList();
                    int size7 = arrayList15.size();
                    int i36 = 0;
                    while (i36 < size7) {
                        Object obj14 = arrayList15.get(i36);
                        i36++;
                        if (hashSet.add(((CourseWord) obj14).getWord())) {
                            arrayList22.add(obj14);
                        }
                    }
                    b1Var = new e1(oVar, new x1(courseWordCopy$default2, list, o.S(arrayList22), rVar, rVar));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(b1Var);
            kOSyllableLesson = kOSyllableLesson2;
            it = it2;
            arrayList = arrayList5;
            i11 = 10;
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r1v45, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f44050a) {
            case 0:
                b bVar = new b((e) this.f44052c, dVar, 0);
                bVar.f44051b = obj;
                return bVar;
            case 1:
                return new b(1, (e0) this.f44051b, (LeaderBoardUser) this.f44052c, dVar);
            case 2:
                return new b(2, (j2) this.f44051b, (q2) this.f44052c, dVar);
            case 3:
                b bVar2 = new b((b4) this.f44052c, dVar, 3);
                bVar2.f44051b = obj;
                return bVar2;
            case 4:
                return new b(4, (List) this.f44051b, (r5) this.f44052c, dVar);
            case 5:
                return new b(5, (p0) this.f44051b, (y8) this.f44052c, dVar);
            case 6:
                b bVar3 = new b((y9) this.f44052c, dVar, 6);
                bVar3.f44051b = obj;
                return bVar3;
            case 7:
                return new b(7, (List) this.f44051b, (bb) this.f44052c, dVar);
            case 8:
                b bVar4 = new b((qd) this.f44052c, dVar, 8);
                bVar4.f44051b = obj;
                return bVar4;
            case 9:
                b bVar5 = new b((fz.a) this.f44052c, dVar, 9);
                bVar5.f44051b = obj;
                return bVar5;
            case 10:
                return new b(10, (l1.b1) this.f44051b, (fz.a) this.f44052c, dVar);
            case 11:
                return new b(11, (ht.q) this.f44051b, (l1.b1) this.f44052c, dVar);
            case 12:
                return new b(12, (l) this.f44051b, (l1.b1) this.f44052c, dVar);
            case 13:
                return new b(13, (KOSyllableLesson) this.f44051b, (ArrayList) this.f44052c, dVar);
            case 14:
                b bVar6 = new b((t9.c) this.f44052c, dVar, 14);
                bVar6.f44051b = obj;
                return bVar6;
            case 15:
                b bVar7 = new b((tp.o) this.f44052c, dVar, 15);
                bVar7.f44051b = obj;
                return bVar7;
            case 16:
                return new b(16, (tq.d) this.f44051b, (pq.a) this.f44052c, dVar);
            case 17:
                b bVar8 = new b((e0) this.f44052c, dVar, 17);
                bVar8.f44051b = obj;
                return bVar8;
            case 18:
                b bVar9 = new b((m0) this.f44052c, dVar, 18);
                bVar9.f44051b = obj;
                return bVar9;
            case 19:
                return new b(19, (w) this.f44051b, (l1.b1) this.f44052c, dVar);
            case 20:
                b bVar10 = new b((xq.k) this.f44052c, dVar, 20);
                bVar10.f44051b = obj;
                return bVar10;
            case 21:
                return new b(21, (o0.b) this.f44051b, (a1) this.f44052c, dVar);
            case 22:
                b bVar11 = new b((xy.i) this.f44052c, dVar);
                bVar11.f44051b = obj;
                return bVar11;
            case 23:
                return new b(23, (rc) this.f44051b, (fz.a) this.f44052c, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new b(24, (Context) this.f44051b, (Uri) this.f44052c, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new b(25, (zs.c) this.f44051b, (fz.a) this.f44052c, dVar);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new b(26, (i1) this.f44051b, (d1) this.f44052c, dVar);
            default:
                return new b(27, (s2) this.f44051b, (y0) this.f44052c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44050a) {
            case 0:
                b bVar = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                bVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                b bVar2 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                bVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                b bVar3 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                bVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                b bVar4 = (b) create((String) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                bVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                b bVar5 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                bVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 6:
                b bVar6 = (b) create((String) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                bVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 7:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                b bVar7 = (b) create((kd) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                bVar7.invokeSuspend(b0Var7);
                return b0Var7;
            case 9:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                b bVar8 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                bVar8.invokeSuspend(b0Var8);
                return b0Var8;
            case 11:
                b bVar9 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                bVar9.invokeSuspend(b0Var9);
                return b0Var9;
            case 12:
                b bVar10 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var10 = qy.b0.f48488a;
                bVar10.invokeSuspend(b0Var10);
                return b0Var10;
            case 13:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
                throw null;
            case 15:
                b bVar11 = (b) create((vp.c) obj, (vy.d) obj2);
                qy.b0 b0Var11 = qy.b0.f48488a;
                bVar11.invokeSuspend(b0Var11);
                return b0Var11;
            case 16:
                b bVar12 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var12 = qy.b0.f48488a;
                bVar12.invokeSuspend(b0Var12);
                return b0Var12;
            case 17:
                b bVar13 = (b) create((l) obj, (vy.d) obj2);
                qy.b0 b0Var13 = qy.b0.f48488a;
                bVar13.invokeSuspend(b0Var13);
                return b0Var13;
            case 18:
                b bVar14 = (b) create((tt.b) obj, (vy.d) obj2);
                qy.b0 b0Var14 = qy.b0.f48488a;
                bVar14.invokeSuspend(b0Var14);
                return b0Var14;
            case 19:
                b bVar15 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var15 = qy.b0.f48488a;
                bVar15.invokeSuspend(b0Var15);
                return b0Var15;
            case 20:
                b bVar16 = (b) create((r5.b) obj, (vy.d) obj2);
                qy.b0 b0Var16 = qy.b0.f48488a;
                bVar16.invokeSuspend(b0Var16);
                return b0Var16;
            case 21:
                b bVar17 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var17 = qy.b0.f48488a;
                bVar17.invokeSuspend(b0Var17);
                return b0Var17;
            case 22:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                b bVar18 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var18 = qy.b0.f48488a;
                bVar18.invokeSuspend(b0Var18);
                return b0Var18;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                b bVar19 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var19 = qy.b0.f48488a;
                bVar19.invokeSuspend(b0Var19);
                return b0Var19;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                b bVar20 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var20 = qy.b0.f48488a;
                bVar20.invokeSuspend(b0Var20);
                return b0Var20;
            default:
                b bVar21 = (b) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var21 = qy.b0.f48488a;
                bVar21.invokeSuspend(b0Var21);
                return b0Var21;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v47, types: [fz.e, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Iterable iterableK;
        uz.i1 i1Var;
        Object value2;
        ArrayList arrayListG0;
        Object value3;
        int i11;
        int i12;
        int i13 = this.f44050a;
        int i14 = 4;
        int i15 = 0;
        zContains = false;
        boolean zContains = false;
        int i16 = 0;
        int i17 = 2;
        int i18 = 3;
        int i19 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f44052c;
        switch (i13) {
            case 0:
                b0 b0Var2 = (b0) this.f44051b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                e eVar = (e) obj3;
                eVar.f44062a.f47163e.j();
                pu.b bVar = eVar.f44062a;
                bVar.f47177t.m(bVar.f47177t.l() + 1);
                if (bVar.f47177t.l() >= eVar.f44065d.f46088j) {
                    int iB = bVar.b();
                    if (iB < bVar.F.size()) {
                        bVar.F.set(iB, Boolean.FALSE);
                    }
                    int i21 = iB + 1;
                    bVar.f47161c.setValue(Integer.valueOf(i21));
                    bVar.l(Math.max(bVar.e(), i21));
                    bVar.f47177t.m(0);
                    if (bVar.e() >= eVar.f44063b.f46072e.size()) {
                        e.a(eVar);
                    } else if (eVar.f44065d.f46087i && bVar.c() == ou.f.Writer) {
                        e.b(eVar);
                    }
                    bVar.i(bVar.d() + 1);
                } else {
                    bVar.k(true);
                    rz.e0.B(b0Var2, null, null, new a(eVar, objArr2 == true ? 1 : 0, i17), 3);
                    rz.e0.B(b0Var2, null, null, new a(eVar, objArr == true ? 1 : 0, i18), 3);
                }
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((e0) this.f44051b).a(new v((LeaderBoardUser) obj3));
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                j2 j2Var = (j2) this.f44051b;
                q2 q2Var = (q2) obj3;
                j2Var.P.k(q2Var);
                rz.e0.B(ViewModelKt.getViewModelScope(j2Var), null, null, new ns.j(17, j2Var, q2Var, objArr3 == true ? 1 : 0), 3);
                return b0Var;
            case 3:
                String str = (String) this.f44051b;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var2 = ((b4) obj3).f49497g0;
                do {
                    value = i1Var2.getValue();
                } while (!i1Var2.j(value, x.Z(str, (Map) value)));
                return b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                List<t4> list = (List) this.f44051b;
                r5 r5Var = (r5) obj3;
                ArrayList arrayList = new ArrayList();
                for (t4 t4Var : list) {
                    n0 n0Var = r5Var.f50336e;
                    WordSentenceCharacterType wordSentenceCharacterType = t4Var.f50424d;
                    if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                        iterableK = oz.q.K0(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getZhuYin()) ? ry.r.f50854a : o.K(r5.h(wordSentenceCharacterType, n0Var));
                    } else {
                        if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) && !(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iterableK = o.K(r5.h(wordSentenceCharacterType, n0Var));
                    }
                    ry.m.d0(arrayList, iterableK);
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj4 = arrayList.get(i22);
                    i22++;
                    if (!oz.q.v0(((fv.a) obj4).f28182a, "-.mp3", false)) {
                        arrayList2.add(obj4);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                int i23 = 0;
                while (i23 < size2) {
                    Object obj5 = arrayList2.get(i23);
                    i23++;
                    if (hashSet.add(((fv.a) obj5).f28184c)) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList3.size();
                while (i15 < size3) {
                    Object obj6 = arrayList3.get(i15);
                    i15++;
                    if (!new File(((fv.a) obj6).f28184c).exists()) {
                        arrayList4.add(obj6);
                    }
                }
                return arrayList4;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                p0 p0Var = (p0) this.f44051b;
                y8 y8Var = (y8) obj3;
                do {
                    i1Var = (uz.i1) p0Var;
                    value2 = i1Var.getValue();
                    List list2 = (List) value2;
                    long j11 = y8Var.f50691a;
                    if (list2.contains(new Long(j11))) {
                        arrayListG0 = new ArrayList();
                        for (Object obj7 : list2) {
                            if (((Number) obj7).longValue() != j11) {
                                arrayListG0.add(obj7);
                            }
                        }
                    } else {
                        arrayListG0 = ry.m.G0(new Long(j11), list2);
                    }
                } while (!i1Var.j(value2, arrayListG0));
                return b0Var;
            case 6:
                String str2 = (String) this.f44051b;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var3 = ((y9) obj3).f50712f0;
                do {
                    value3 = i1Var3.getValue();
                } while (!i1Var3.j(value3, x.Z(str2, (Map) value3)));
                return b0Var;
            case 7:
                n0 n0Var2 = ((bb) obj3).f49538c;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                ArrayList arrayListO = ep.a.o(obj);
                for (et.o oVar : (List) this.f44051b) {
                    if (oVar instanceof et.h) {
                        CourseSentence courseSentence = ((et.h) oVar).f25881a;
                        o0 o0Var = (o0) n0Var2;
                        ArrayList arrayListI = l1.i(courseSentence, o0Var.f27733a.keyLanguage, false, o0Var.x());
                        if (courseSentence.getSentenceMFType() != SentenceMFType.NORMAL) {
                            ArrayList arrayList5 = new ArrayList();
                            int size4 = arrayListI.size();
                            int i24 = 0;
                            while (i24 < size4) {
                                Object obj8 = arrayListI.get(i24);
                                i24++;
                                if (!new File(((fv.a) obj8).f28184c).exists()) {
                                    arrayList5.add(obj8);
                                }
                            }
                            arrayListO.addAll(arrayList5);
                        }
                    } else if (oVar instanceof et.k) {
                        o0 o0Var2 = (o0) n0Var2;
                        ArrayList arrayListI2 = l1.i(((et.k) oVar).f25886a, o0Var2.f27733a.keyLanguage, false, o0Var2.x());
                        ArrayList arrayList6 = new ArrayList();
                        int size5 = arrayListI2.size();
                        int i25 = 0;
                        while (i25 < size5) {
                            Object obj9 = arrayListI2.get(i25);
                            i25++;
                            if (!new File(((fv.a) obj9).f28184c).exists()) {
                                arrayList6.add(obj9);
                            }
                        }
                        arrayListO.addAll(arrayList6);
                    } else if (oVar instanceof et.i) {
                        o0 o0Var3 = (o0) n0Var2;
                        ArrayList arrayListI3 = l1.i(((et.i) oVar).f25882a, o0Var3.f27733a.keyLanguage, false, o0Var3.x());
                        ArrayList arrayList7 = new ArrayList();
                        int size6 = arrayListI3.size();
                        int i26 = 0;
                        while (i26 < size6) {
                            Object obj10 = arrayListI3.get(i26);
                            i26++;
                            if (!new File(((fv.a) obj10).f28184c).exists()) {
                                arrayList7.add(obj10);
                            }
                        }
                        arrayListO.addAll(arrayList7);
                    } else if (oVar instanceof et.j) {
                        o0 o0Var4 = (o0) n0Var2;
                        ArrayList arrayListI4 = l1.i(((et.j) oVar).f25884a, o0Var4.f27733a.keyLanguage, false, o0Var4.x());
                        ArrayList arrayList8 = new ArrayList();
                        int size7 = arrayListI4.size();
                        int i27 = 0;
                        while (i27 < size7) {
                            Object obj11 = arrayListI4.get(i27);
                            i27++;
                            if (!new File(((fv.a) obj11).f28184c).exists()) {
                                arrayList8.add(obj11);
                            }
                        }
                        arrayListO.addAll(arrayList8);
                    } else if (oVar instanceof et.l) {
                        o0 o0Var5 = (o0) n0Var2;
                        ArrayList arrayListI5 = l1.i(((et.l) oVar).f25889a, o0Var5.f27733a.keyLanguage, false, o0Var5.x());
                        ArrayList arrayList9 = new ArrayList();
                        int size8 = arrayListI5.size();
                        int i28 = 0;
                        while (i28 < size8) {
                            Object obj12 = arrayListI5.get(i28);
                            i28++;
                            if (!new File(((fv.a) obj12).f28184c).exists()) {
                                arrayList9.add(obj12);
                            }
                        }
                        arrayListO.addAll(arrayList9);
                    } else if (oVar instanceof et.m) {
                        o0 o0Var6 = (o0) n0Var2;
                        ArrayList arrayListI6 = l1.i(((et.m) oVar).f25891a, o0Var6.f27733a.keyLanguage, false, o0Var6.x());
                        ArrayList arrayList10 = new ArrayList();
                        int size9 = arrayListI6.size();
                        int i29 = 0;
                        while (i29 < size9) {
                            Object obj13 = arrayListI6.get(i29);
                            i29++;
                            if (!new File(((fv.a) obj13).f28184c).exists()) {
                                arrayList10.add(obj13);
                            }
                        }
                        arrayListO.addAll(arrayList10);
                    } else if (!(oVar instanceof et.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList11 = new ArrayList();
                int size10 = arrayListO.size();
                while (i16 < size10) {
                    Object obj14 = arrayListO.get(i16);
                    i16++;
                    if (hashSet2.add(((fv.a) obj14).f28182a)) {
                        arrayList11.add(obj14);
                    }
                }
                return ry.m.c1(arrayList11);
            case 8:
                kd kdVar = (kd) this.f44051b;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                qd qdVar = (qd) obj3;
                int i30 = kdVar.f49993b;
                uz.i1 i1Var4 = qdVar.f50314t;
                Env env = ((o0) qdVar.f50309b).f27733a;
                int i31 = env.keyLanguage;
                int i32 = env.locateLanguage;
                Set set = rd.f50347a;
                if (i31 == 1 && i32 == 3) {
                    zContains = rd.f50347a.contains(Integer.valueOf(i30));
                }
                if (zContains) {
                    File file = new File(new File(qdVar.f50311d.f56256c, "jp/main/others/"), rd.a(i30));
                    if (file.exists()) {
                        qdVar.H = Integer.valueOf(i30);
                        String absolutePath = file.getAbsolutePath();
                        m.e(absolutePath, "getAbsolutePath(...)");
                        we weVar = new we(absolutePath, i30);
                        i1Var4.getClass();
                        i1Var4.l(null, weVar);
                    } else {
                        Integer num = qdVar.H;
                        if (num == null || num.intValue() != i30 || !(i1Var4.getValue() instanceof ve)) {
                            qdVar.H = Integer.valueOf(i30);
                            i1Var4.getClass();
                            i1Var4.l(null, ve.f50557a);
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            String strA = rd.a(i30);
                            String strE = ep.a.e("https://res.lingodeer.com/mfsource/jp/main/others/", rd.a(i30));
                            String absolutePath2 = file.getAbsolutePath();
                            m.e(absolutePath2, "getAbsolutePath(...)");
                            qdVar.f50310c.d(new fv.a(strE, absolutePath2, strA), new gn.d(qdVar, i30, file, i14));
                        }
                    }
                } else {
                    qdVar.H = null;
                    i1Var4.getClass();
                    i1Var4.l(null, xe.f50664a);
                }
                return b0Var;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                vy.i coroutineContext = ((b0) this.f44051b).getCoroutineContext();
                fz.a aVar11 = (fz.a) obj3;
                try {
                    d2 d2Var = new d2();
                    d2Var.f50879f = rz.e0.v(rz.e0.s(coroutineContext), true, d2Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d2.f50877t;
                    try {
                        do {
                            i11 = atomicIntegerFieldUpdater.get(d2Var);
                            if (i11 != 0) {
                                if (i11 != 2 && i11 != 3) {
                                    d2.l(i11);
                                    throw null;
                                }
                            }
                            return aVar11.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(d2Var, i11, 0));
                        return aVar11.invoke();
                    } finally {
                        d2Var.k();
                    }
                } catch (InterruptedException e8) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e8);
                }
            case 10:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                RiveAnimationView riveAnimationView = (RiveAnimationView) ((l1.b1) this.f44051b).getValue();
                if (riveAnimationView != null) {
                    riveAnimationView.setOnClickListener(new aj.b((fz.a) obj3, 21));
                }
                return b0Var;
            case 11:
                l1.b1 b1Var = (l1.b1) obj3;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!ry.l.D(new ht.q[]{ht.q.CORRECT, ht.q.WRONG}, (ht.q) this.f44051b) && ((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.FALSE);
                }
                return b0Var;
            case 12:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((l1.b1) obj3).setValue((l) this.f44051b);
                return b0Var;
            case 13:
                return e(obj);
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                throw null;
            case 15:
                vp.c cVar = (vp.c) this.f44051b;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!m.a(cVar, vp.a.f54078a)) {
                    if (!(cVar instanceof vp.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tp.o oVar2 = (tp.o) obj3;
                    ArrayList arrayList12 = ((vp.b) cVar).f54079a;
                    oVar2.O = arrayList12;
                    oVar2.P = 0;
                    if (arrayList12.isEmpty()) {
                        l.m mVar = oVar2.f36398d;
                        if (mVar != null) {
                            mVar.finish();
                        }
                        int i33 = BaseReviewEmptyActivity.H;
                        androidx.fragment.app.p0 p0VarRequireActivity = oVar2.requireActivity();
                        m.e(p0VarRequireActivity, "requireActivity(...)");
                        String string = oVar2.getString(R.string.flashcards);
                        m.e(string, "getString(...)");
                        oVar2.startActivity(o00.a.E(p0VarRequireActivity, string));
                    } else {
                        oVar2.Q = new a9.i(1);
                        oVar2.U = new fv.c();
                        oVar2.C();
                        oVar2.X = 0;
                        oVar2.Y = 0;
                        oVar2.Z = 0;
                        oVar2.W = oVar2.O.size();
                        ta.a aVar17 = oVar2.f36400f;
                        m.c(aVar17);
                        ((hj.v) aVar17).f33442r.setText(String.valueOf(oVar2.X));
                        ta.a aVar18 = oVar2.f36400f;
                        m.c(aVar18);
                        ((hj.v) aVar18).f33443s.setText(String.valueOf(oVar2.Y));
                        ta.a aVar19 = oVar2.f36400f;
                        m.c(aVar19);
                        ((hj.v) aVar19).f33444t.setText(String.valueOf(oVar2.Z));
                        ta.a aVar20 = oVar2.f36400f;
                        m.c(aVar20);
                        ((hj.v) aVar20).f33441q.setText(String.valueOf(oVar2.W));
                        for (int i34 = 0; i34 < 3; i34++) {
                            ta.a aVar21 = oVar2.f36400f;
                            m.c(aVar21);
                            View childAt = ((hj.v) aVar21).f33438n.getChildAt(i34);
                            m.e(childAt, "getChildAt(...)");
                            z.b(childAt, new j4(oVar2, i34, i14));
                        }
                        if (((Boolean) oVar2.f52482a0.getValue()).booleanValue()) {
                            ta.a aVar22 = oVar2.f36400f;
                            m.c(aVar22);
                            ((LinearLayout) ((hj.v) aVar22).f33437l.f32524c).setVisibility(0);
                            ta.a aVar23 = oVar2.f36400f;
                            m.c(aVar23);
                            z.b((LinearLayout) ((hj.v) aVar23).f33437l.f32524c, new st.a(19));
                            ta.a aVar24 = oVar2.f36400f;
                            m.c(aVar24);
                            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder((TextView) ((hj.v) aVar24).f33437l.f32525d, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.6f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.6f)).setDuration(1000L);
                            m.e(duration, "setDuration(...)");
                            duration.setRepeatCount(2);
                            duration.setRepeatMode(1);
                            duration.setInterpolator(new BounceInterpolator());
                            duration.addListener(new gi.g(oVar2, 7));
                            duration.start();
                        }
                        ta.a aVar25 = oVar2.f36400f;
                        m.c(aVar25);
                        z.b((ImageView) ((hj.v) aVar25).f33436k.f32408d, new tp.j(oVar2, i14));
                        ta.a aVar26 = oVar2.f36400f;
                        m.c(aVar26);
                        z.b(((hj.v) aVar26).f33435j, new tp.j(oVar2, 5));
                        ta.a aVar27 = oVar2.f36400f;
                        m.c(aVar27);
                        z.b(((hj.v) aVar27).f33427b, new tp.j(oVar2, i19));
                        ta.a aVar28 = oVar2.f36400f;
                        m.c(aVar28);
                        z.b(((hj.v) aVar28).f33429d, new tp.j(oVar2, i17));
                        ta.a aVar29 = oVar2.f36400f;
                        m.c(aVar29);
                        z.b(((hj.v) aVar29).m, new tp.j(oVar2, i18));
                    }
                }
                return b0Var;
            case 16:
                wy.a aVar30 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                tq.d dVar = (tq.d) this.f44051b;
                if (((tq.a) dVar.f52525c.getValue()).f52513f) {
                    q qVar = fv.b.f28186a;
                    String strA2 = dVar.H.a(((pq.a) obj3).f46983a);
                    m.e(strA2, "getCharName(...)");
                    dVar.f52524b.h(fv.b.c(strA2, null, null));
                } else {
                    rz.e0.B(ViewModelKt.getViewModelScope(dVar), null, null, new f0(dVar, ((Number) dVar.f52527e.getValue()).intValue(), (vy.d) null), 3);
                }
                return b0Var;
            case 17:
                l lVar = (l) this.f44051b;
                wy.a aVar31 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var5 = ((e0) obj3).f52560e;
                Boolean boolValueOf = Boolean.valueOf(((List) lVar.f48496b).contains(lVar.f48495a));
                i1Var5.getClass();
                i1Var5.l(null, boolValueOf);
                return b0Var;
            case 18:
                tt.b bVar2 = (tt.b) this.f44051b;
                wy.a aVar32 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (bVar2 != null) {
                    if (!bVar2.f52535c) {
                        bVar2.f52535c = true;
                        obj2 = bVar2.f52533a;
                    }
                    LeaderBoardUiState leaderBoardUiState = (LeaderBoardUiState) obj2;
                    if (leaderBoardUiState != null) {
                        ((m0) obj3).b(new tu.q(leaderBoardUiState));
                    }
                }
                return b0Var;
            case 19:
                wy.a aVar33 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((w) this.f44051b).f39210i.b()) {
                    ((l1.b1) obj3).setValue(new l(null, new v3.j(0L)));
                }
                return b0Var;
            case 20:
                r5.b preferences = (r5.b) this.f44051b;
                wy.a aVar34 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                r5.d dVar2 = xq.j.f56188a;
                xq.k model = (xq.k) obj3;
                m.f(preferences, "preferences");
                m.f(model, "model");
                preferences.e(xq.j.f56188a, Integer.valueOf(model.f56190a));
                preferences.e(xq.j.f56189b, model.f56191b.name());
                return b0Var;
            case 21:
                wy.a aVar35 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((h1) ((a1) obj3)).m(((o0.b) this.f44051b).k());
                return b0Var;
            case 22:
                wy.a aVar36 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                vy.g gVar = ((b0) this.f44051b).getCoroutineContext().get(vy.e.f54320a);
                m.c(gVar);
                vy.f fVar = (vy.f) gVar;
                t tVarB = rz.e0.b();
                rz.e0.A(rz.b1.f50869a, fVar, d0.UNDISPATCHED, new y0.j(tVarB, (fz.e) obj3, (vy.d) null));
                while (!tVarB.H()) {
                    try {
                        return rz.e0.F(fVar, new f0((Object) tVarB, (vy.d) (objArr4 == true ? 1 : 0), 12));
                    } catch (InterruptedException unused) {
                    }
                }
                return tVarB.y();
            case 23:
                wy.a aVar37 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((rc) this.f44051b) instanceof qc) {
                    ((fz.a) obj3).invoke();
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar38 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                Context context = (Context) this.f44051b;
                Uri uri = (Uri) obj3;
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            o.m(inputStreamOpenInputStream, th2);
                            throw th3;
                        }
                    }
                }
                int i35 = options.outWidth;
                int i36 = options.outHeight;
                if (i35 <= 0 || i36 <= 0) {
                    throw new IllegalArgumentException("无法解码图片尺寸");
                }
                float fMax = Math.max(i35, i36);
                float f5 = 1600;
                if (fMax > f5 && (i12 = (int) (fMax / f5)) >= 1) {
                    i19 = i12;
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i19;
                InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream2 != null) {
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
                        inputStreamOpenInputStream2.close();
                        if (bitmapDecodeStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                            bitmapDecodeStream.recycle();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            m.c(byteArray);
                            try {
                                byte[] bArrEncode = Base64.encode(byteArray, 2);
                                m.c(bArrEncode);
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                m.e(UTF_8, "UTF_8");
                                return new String(bArrEncode, UTF_8);
                            } catch (NullPointerException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            o.m(inputStreamOpenInputStream2, th4);
                            throw th5;
                        }
                    }
                }
                throw new IllegalStateException("无法解码图片");
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar39 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((zs.c) this.f44051b).f59353i) {
                    ((fz.a) obj3).invoke();
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                wy.a aVar40 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                i1 i1Var6 = (i1) this.f44051b;
                rz.e0.B(ViewModelKt.getViewModelScope(i1Var6), null, null, new zu.g1(i1Var6, (d1) obj3, objArr5 == true ? 1 : 0, i17), 3);
                return b0Var;
            default:
                wy.a aVar41 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((s2) this.f44051b).f59561t.c("ep_me_switch_statics_tab", new xa.a((y0) obj3, 14));
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f44050a = 22;
        this.f44052c = (xy.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f44050a = i11;
        this.f44052c = obj;
    }
}
