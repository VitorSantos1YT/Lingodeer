package ij;

import android.database.SQLException;
import android.text.TextUtils;
import com.lingo.lingoskill.object.AchievementDao;
import com.lingo.lingoskill.object.AckFavDao;
import com.lingo.lingoskill.object.BillingStatusDao;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.GameWordStatusDao;
import com.lingo.lingoskill.object.KanjiFavDao;
import com.lingo.lingoskill.object.LanCustomInfoDao;
import com.lingo.lingoskill.object.LanguageItemDao;
import com.lingo.lingoskill.object.LanguageTransVersionDao;
import com.lingo.lingoskill.object.LoginHistoryDao;
import com.lingo.lingoskill.object.PdLessonDao;
import com.lingo.lingoskill.object.PdLessonDlVersionDao;
import com.lingo.lingoskill.object.PdLessonFavDao;
import com.lingo.lingoskill.object.PdLessonLearnIndexDao;
import com.lingo.lingoskill.object.PdSentenceDao;
import com.lingo.lingoskill.object.PdTipsDao;
import com.lingo.lingoskill.object.PdTipsFavDao;
import com.lingo.lingoskill.object.PdWordDao;
import com.lingo.lingoskill.object.PdWordFavDao;
import com.lingo.lingoskill.object.ReviewNewDao;
import com.lingo.lingoskill.object.ScFavDao;
import com.lingo.lingoskill.object.ScFavNewDao;
import com.lingo.lingoskill.object.UnitFinishStatusDao;
import fr.j3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends DaoMaster.OpenHelper {
    @Override // org.greenrobot.greendao.database.c
    public final void onUpgrade(org.greenrobot.greendao.database.a aVar, int i11, int i12) {
        int i13;
        boolean z11;
        Class[] clsArr;
        String string;
        super.onUpgrade(aVar, i11, i12);
        Class[] clsArr2 = {LanguageItemDao.class, ScFavDao.class, AchievementDao.class, LanguageTransVersionDao.class, BillingStatusDao.class, LanCustomInfoDao.class, AckFavDao.class, ReviewNewDao.class, PdLessonDao.class, PdWordDao.class, PdSentenceDao.class, PdTipsDao.class, GameWordStatusDao.class, PdLessonFavDao.class, PdWordFavDao.class, PdTipsFavDao.class, PdLessonDlVersionDao.class, PdLessonLearnIndexDao.class, KanjiFavDao.class, ScFavNewDao.class, UnitFinishStatusDao.class, LoginHistoryDao.class};
        j3.f27635b = new WeakReference(new j());
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i13 = 22;
            z11 = true;
            if (i15 >= 22) {
                break;
            }
            j10.a aVar2 = new j10.a(aVar, clsArr2[i15]);
            String str = aVar2.f35515b;
            if (j3.F(aVar, false, str)) {
                try {
                    String strConcat = str.concat("_TEMP");
                    aVar.k("DROP TABLE IF EXISTS " + strConcat + ";");
                    aVar.k("CREATE TEMPORARY TABLE " + strConcat + " AS SELECT * FROM `" + str + "`;");
                    StringBuilder sb2 = new StringBuilder();
                    int i16 = 0;
                    while (true) {
                        String[] strArr = aVar2.f35517d;
                        if (i16 >= strArr.length) {
                            break;
                        }
                        sb2.append(strArr[i16]);
                        sb2.append(",");
                        i16++;
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                } catch (SQLException unused) {
                }
            }
            i15++;
        }
        WeakReference weakReference = j3.f27635b;
        if ((weakReference != null ? (j) weakReference.get() : null) != null) {
            DaoMaster.dropAllTables(aVar, true);
            DaoMaster.createAllTables(aVar, false);
        } else {
            j3.Q(aVar, "dropTable", true, clsArr2);
            j3.Q(aVar, "createTable", false, clsArr2);
        }
        int i17 = 0;
        while (i17 < i13) {
            String str2 = new j10.a(aVar, clsArr2[i17]).f35515b;
            String strConcat2 = str2.concat("_TEMP");
            if (j3.F(aVar, z11, strConcat2)) {
                try {
                    ArrayList arrayListA = jj.b.a(aVar, str2);
                    ArrayList arrayListA2 = jj.b.a(aVar, strConcat2);
                    ArrayList arrayList = new ArrayList(arrayListA.size());
                    ArrayList arrayList2 = new ArrayList(arrayListA.size());
                    int size = arrayListA2.size();
                    while (i14 < size) {
                        Object obj = arrayListA2.get(i14);
                        int i18 = i14 + 1;
                        jj.b bVar = (jj.b) obj;
                        if (arrayListA.contains(bVar)) {
                            String str3 = '`' + bVar.f36410b + '`';
                            arrayList2.add(str3);
                            arrayList.add(str3);
                        }
                        i14 = i18;
                    }
                    int size2 = arrayListA.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj2 = arrayListA.get(i19);
                        i19++;
                        jj.b bVar2 = (jj.b) obj2;
                        if (!bVar2.f36412d || arrayListA2.contains(bVar2)) {
                            clsArr = clsArr2;
                        } else {
                            String str4 = '`' + bVar2.f36410b + '`';
                            arrayList2.add(str4);
                            if (bVar2.f36413e != null) {
                                StringBuilder sb3 = new StringBuilder();
                                clsArr = clsArr2;
                                try {
                                    sb3.append("'");
                                    sb3.append(bVar2.f36413e);
                                    sb3.append("' AS ");
                                    string = sb3.toString();
                                } catch (SQLException unused2) {
                                }
                            } else {
                                clsArr = clsArr2;
                                string = "'' AS ";
                            }
                            arrayList.add(string + str4);
                        }
                        size2 = size2;
                        clsArr2 = clsArr;
                    }
                    clsArr = clsArr2;
                    if (arrayList2.size() != 0) {
                        aVar.k("REPLACE INTO `" + str2 + "` (" + TextUtils.join(",", arrayList2) + ") SELECT " + TextUtils.join(",", arrayList) + " FROM " + strConcat2 + ";");
                    }
                    aVar.k("DROP TABLE " + strConcat2);
                } catch (SQLException unused3) {
                    clsArr = clsArr2;
                }
            } else {
                clsArr = clsArr2;
            }
            i17++;
            clsArr2 = clsArr;
            i14 = 0;
            i13 = 22;
            z11 = true;
        }
    }
}
