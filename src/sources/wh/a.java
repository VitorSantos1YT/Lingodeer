package wh;

import android.content.Context;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.ARCharDao;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.HwCharPartDao;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;
import se.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f55170d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HwCharacterDao f55171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HwCharPartDao f55172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ARCharDao f55173c;

    public a(LingoSkillApplication context) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        Env envN = x.n();
        m.f(context, "context");
        DaoSession daoSessionM210newSession = new DaoMaster(new sl.a(context, "ar_hand_write.db", null, 1, "ar_hand_write.zip", envN, 5).getWritableDatabase()).m210newSession();
        m.e(daoSessionM210newSession, "newSession(...)");
        HwCharacterDao hwCharacterDao = daoSessionM210newSession.getHwCharacterDao();
        m.e(hwCharacterDao, "getHwCharacterDao(...)");
        this.f55171a = hwCharacterDao;
        HwCharPartDao hwCharPartDao = daoSessionM210newSession.getHwCharPartDao();
        m.e(hwCharPartDao, "getHwCharPartDao(...)");
        this.f55172b = hwCharPartDao;
        ARCharDao aRCharDao = daoSessionM210newSession.getARCharDao();
        m.e(aRCharDao, "getARCharDao(...)");
        this.f55173c = aRCharDao;
    }

    public static ARChar a(String character) {
        m.f(character, "character");
        g gVarQueryBuilder = k.w().f55173c.queryBuilder();
        gVarQueryBuilder.f(ARCharDao.Properties.Character.b(character), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        List listD = gVarQueryBuilder.d();
        m.c(listD);
        if (listD.isEmpty()) {
            return null;
        }
        return (ARChar) listD.get(0);
    }

    public static ArrayList b(Context context) {
        ArrayList arrayList = new ArrayList();
        bi.a aVar = new bi.a(0, BuildConfig.VERSION_NAME);
        aVar.f4451b = context.getString(R.string.introduction);
        arrayList.add(aVar);
        bi.a aVar2 = new bi.a(1, "ب\nبَ\nبِ\nم\nمَ\nمِ\nر\nرَ\nرِ");
        aVar2.f4451b = context.getString(R.string.lesson_s, "1");
        arrayList.add(aVar2);
        bi.a aVar3 = new bi.a(2, "ن\nد\nنُ\nدُ\nح\nت\nحُ\nتُ\nحُتْ\nتُدْ\nنُمْ\nدُنْ");
        aVar3.f4451b = context.getString(R.string.lesson_s, "2");
        arrayList.add(aVar3);
        bi.a aVar4 = new bi.a(3, "و\nوَ\nوَا\nج\nجَ\nجَا\nذ\nذَ\nذَا\nل\nلَ\nلَا");
        aVar4.f4451b = context.getString(R.string.lesson_s, "3");
        arrayList.add(aVar4);
        bi.a aVar5 = new bi.a(4, "ض\nضِ\nضِي\nع\nعِ\nعِي\nخ\nخُ\nخُو\nظ\nظُ\nظُو");
        aVar5.f4451b = context.getString(R.string.lesson_s, "4");
        arrayList.add(aVar5);
        bi.a aVar6 = new bi.a(5, "ث\nثَ\nثًا\nغ\nغَ\nغًا\nق\nقَ\nقًا\nس\nسَ\nسًا\nا\nأَ\nأً");
        aVar6.f4451b = context.getString(R.string.lesson_s, "5");
        arrayList.add(aVar6);
        bi.a aVar7 = new bi.a(6, "ص\nصٍ\nصٌ\nز\nزٍ\nزٌ\nي\nيٍ\nيٌ\nط\nطٍ\nطٌ");
        aVar7.f4451b = context.getString(R.string.lesson_s, "6");
        arrayList.add(aVar7);
        bi.a aVar8 = new bi.a(7, "ه\nك\nهَ\nكٌ\nهَكٌ\nهَكٌّ\nش\nف\nشُ\nفِ\nشُفِ\nشُفِّ");
        aVar8.f4451b = context.getString(R.string.lesson_s, "7");
        arrayList.add(aVar8);
        return arrayList;
    }
}
