package bp;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import com.adjust.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOSyllableIntroductionActivity;
import com.lingo.lingoskill.object.CharGroup;
import com.lingo.lingoskill.object.HwCharGroup;
import com.lingo.lingoskill.object.HwCharGroupDao;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingo.lingoskill.object.TravelPhraseDao;
import com.lingo.lingoskill.object.UnitFinishStatus;
import com.lingo.lingoskill.object.UnitFinishStatusDao;
import com.lingo.lingoskill.ui.base.PicTestIndexActivity;
import com.lingodeer.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.DaoException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g4 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4603b;

    public /* synthetic */ g4(Context context, ip.a aVar) {
        this.f4602a = 8;
        this.f4603b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileInputStream fileInputStreamOpenFileInput;
        Object next;
        FileInputStream fileInputStream = null;
        ConfigContainer configContainerA = null;
        int i11 = 0;
        switch (this.f4602a) {
            case 0:
                String[] strArr = (String[]) this.f4603b;
                int length = strArr.length;
                while (i11 < length) {
                    String str = strArr[i11];
                    xt.b.a().getClass();
                    xt.a.a(str);
                    i11++;
                }
                return Boolean.TRUE;
            case 1:
                PicTestIndexActivity picTestIndexActivity = (PicTestIndexActivity) this.f4603b;
                int i12 = PicTestIndexActivity.R;
                xt.a aVarA = xt.b.a();
                String strE = xt.b.a().e();
                aVarA.getClass();
                xt.a.a(strE);
                com.bumptech.glide.c.c(picTestIndexActivity).a();
                return Boolean.TRUE;
            case 2:
                TravelCategory travelCategory = (TravelCategory) this.f4603b;
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            dj.b.f23431e = new dj.b(lingoSkillApplication);
                        }
                    }
                }
                dj.b bVar = dj.b.f23431e;
                kotlin.jvm.internal.m.c(bVar);
                long categoryId = travelCategory.getCategoryId();
                k10.g gVarQueryBuilder = bVar.c().queryBuilder();
                gVarQueryBuilder.f(TravelPhraseDao.Properties.CID.b(Long.valueOf(categoryId)), new k10.h[0]);
                org.greenrobot.greendao.a aVar = gVarQueryBuilder.f37854e;
                String tablename = aVar.getTablename();
                int i13 = j10.c.f35524a;
                StringBuilder sb2 = new StringBuilder(ep.a.g("SELECT COUNT(*) FROM \"", tablename, "\" T "));
                gVarQueryBuilder.a(sb2);
                k10.d dVar = (k10.d) new k10.c(aVar, sb2.toString(), k10.a.b(gVarQueryBuilder.f37852c.toArray()), 0, (byte) 0).b();
                dVar.a();
                Cursor cursorD = dVar.f37840a.getDatabase().d(dVar.f37842c, dVar.f37843d);
                try {
                    if (!cursorD.moveToNext()) {
                        throw new DaoException("No result for count");
                    }
                    if (!cursorD.isLast()) {
                        throw new DaoException("Unexpected row count: " + cursorD.getCount());
                    }
                    if (cursorD.getColumnCount() == 1) {
                        long j11 = cursorD.getLong(0);
                        cursorD.close();
                        return Long.valueOf(j11);
                    }
                    throw new DaoException("Unexpected column count: " + cursorD.getColumnCount());
                } catch (Throwable th2) {
                    cursorD.close();
                    throw th2;
                }
            case 3:
                return ((RemoteConfigComponent) this.f4603b).b();
            case 4:
                ConfigStorageClient configStorageClient = (ConfigStorageClient) this.f4603b;
                synchronized (configStorageClient) {
                    try {
                        try {
                            fileInputStreamOpenFileInput = configStorageClient.f20772a.openFileInput(configStorageClient.f20773b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                configContainerA = ConfigContainer.a(new JSONObject(new String(bArr, Constants.ENCODING)));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileInputStream = fileInputStreamOpenFileInput;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                return configContainerA;
            case 5:
                ArrayList arrayList = (ArrayList) this.f4603b;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TravelPhrase travelPhrase = (TravelPhrase) obj;
                    qy.q qVar = fv.b.f28186a;
                    String strQ = fv.b.Q(travelPhrase.getCID(), travelPhrase.getID());
                    String strM = defpackage.e.m(xt.b.a().n(), strQ);
                    String strR = fv.b.R(travelPhrase.getCID(), travelPhrase.getID());
                    if (!com.google.android.material.datepicker.d.D(strM)) {
                        w4.c.w(strR, 7L, strQ, arrayList2);
                    }
                }
                return arrayList2;
            case 6:
                KOSyllableIntroductionActivity kOSyllableIntroductionActivity = (KOSyllableIntroductionActivity) this.f4603b;
                int i14 = KOSyllableIntroductionActivity.W;
                HashMap map = new HashMap();
                for (String str2 : kOSyllableIntroductionActivity.S) {
                    qy.q qVar2 = fv.b.f28186a;
                    se.p.V();
                    String strA = wm.a.a(str2);
                    kotlin.jvm.internal.m.c(strA);
                    String strA2 = fv.b.a(strA, null, null);
                    se.p.V();
                    String strA3 = wm.a.a(str2);
                    kotlin.jvm.internal.m.c(strA3);
                    map.put(strA2, fv.b.e(strA3));
                }
                for (String str3 : kOSyllableIntroductionActivity.T) {
                    qy.q qVar3 = fv.b.f28186a;
                    se.p.V();
                    String strA4 = wm.a.a(str3);
                    kotlin.jvm.internal.m.c(strA4);
                    String strA5 = fv.b.a(strA4, null, null);
                    se.p.V();
                    String strA6 = wm.a.a(str3);
                    kotlin.jvm.internal.m.c(strA6);
                    map.put(strA5, fv.b.e(strA6));
                }
                for (String str4 : kOSyllableIntroductionActivity.U) {
                    qy.q qVar4 = fv.b.f28186a;
                    se.p.V();
                    String strA7 = wm.a.a(str4);
                    kotlin.jvm.internal.m.c(strA7);
                    String strA8 = fv.b.a(strA7, null, null);
                    se.p.V();
                    String strA9 = wm.a.a(str4);
                    kotlin.jvm.internal.m.c(strA9);
                    map.put(strA8, fv.b.e(strA9));
                }
                String[] strArr2 = kOSyllableIntroductionActivity.V;
                int length2 = strArr2.length;
                while (i11 < length2) {
                    String str5 = strArr2[i11];
                    qy.q qVar5 = fv.b.f28186a;
                    se.p.V();
                    String strA10 = wm.a.a(str5);
                    kotlin.jvm.internal.m.c(strA10);
                    String strA11 = fv.b.a(strA10, null, null);
                    se.p.V();
                    String strA12 = wm.a.a(str5);
                    kotlin.jvm.internal.m.c(strA12);
                    map.put(strA11, fv.b.e(strA12));
                    i11++;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : map.entrySet()) {
                    kotlin.jvm.internal.m.e(obj2, "next(...)");
                    Map.Entry entry = (Map.Entry) obj2;
                    if (!new File(xt.b.a().b() + entry.getKey()).exists()) {
                        Object value = entry.getValue();
                        kotlin.jvm.internal.m.e(value, "<get-value>(...)");
                        Object key = entry.getKey();
                        kotlin.jvm.internal.m.e(key, "<get-key>(...)");
                        fv.a aVar2 = new fv.a(0L, (String) value, (String) key);
                        Iterator it = arrayList3.iterator();
                        kotlin.jvm.internal.m.e(it, "iterator(...)");
                        do {
                            if (!it.hasNext()) {
                                arrayList3.add(aVar2);
                            }
                            next = it.next();
                            kotlin.jvm.internal.m.e(next, "next(...)");
                            break;
                        } while (!((fv.a) next).equals(aVar2));
                    }
                }
                return arrayList3;
            case 7:
                im.a aVar3 = (im.a) this.f4603b;
                return aVar3.b(aVar3.a());
            case 8:
                Context context = (Context) this.f4603b;
                ArrayList arrayList4 = new ArrayList();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (!ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    if (oi.c.f44924t == null) {
                        synchronized (oi.c.class) {
                            if (oi.c.f44924t == null) {
                                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication3);
                                oi.c.f44924t = new oi.c(lingoSkillApplication3);
                            }
                        }
                    }
                    oi.c cVar = oi.c.f44924t;
                    kotlin.jvm.internal.m.c(cVar);
                    Object value2 = ((qy.q) cVar.f44929e).getValue();
                    kotlin.jvm.internal.m.e(value2, "getValue(...)");
                    k10.g gVarQueryBuilder2 = ((HwCharGroupDao) value2).queryBuilder();
                    gVarQueryBuilder2.e(" ASC", HwCharGroupDao.Properties.PartGroupId);
                    List<HwCharGroup> listD = gVarQueryBuilder2.d();
                    kotlin.jvm.internal.m.e(listD, "list(...)");
                    for (HwCharGroup hwCharGroup : listD) {
                        CharGroup charGroup = new CharGroup();
                        LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                        String partGroupList = cf.x.n().isSChinese ? hwCharGroup.getPartGroupList() : hwCharGroup.getTPartGroupList();
                        String partGroupName = cf.x.n().isSChinese ? hwCharGroup.getPartGroupName() : hwCharGroup.getTPartGroupName();
                        charGroup.setIndex(hwCharGroup.getPartGroupIndex());
                        charGroup.setName(context.getString(R.string.group_s, partGroupName));
                        ArrayList arrayList5 = new ArrayList();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(partGroupList);
                        List listW0 = oz.q.W0(partGroupList, new String[]{";"}, 0, 6);
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj3 : listW0) {
                            if (((String) obj3).length() > 0) {
                                arrayList6.add(obj3);
                            }
                        }
                        int size2 = arrayList6.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj4 = arrayList6.get(i15);
                            i15++;
                            String str6 = (String) obj4;
                            if (oi.c.f44924t == null) {
                                synchronized (oi.c.class) {
                                    if (oi.c.f44924t == null) {
                                        LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                                        kotlin.jvm.internal.m.c(lingoSkillApplication5);
                                        oi.c.f44924t = new oi.c(lingoSkillApplication5);
                                    }
                                }
                            }
                            oi.c cVar2 = oi.c.f44924t;
                            kotlin.jvm.internal.m.c(cVar2);
                            HwCharacter hwCharacter = (HwCharacter) cVar2.g().load(Long.valueOf(Long.parseLong(str6)));
                            if (hwCharacter != null) {
                                arrayList5.add(Long.valueOf(hwCharacter.getCharId()));
                                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                                if (cf.x.n().isSChinese) {
                                    sb3.append(hwCharacter.getCharacter() + " ");
                                } else {
                                    sb3.append(hwCharacter.getTCharacter() + " ");
                                }
                            }
                            break;
                        }
                        charGroup.setIds(arrayList5);
                        charGroup.setDesc(sb3.toString());
                        arrayList4.add(charGroup);
                    }
                    break;
                } else {
                    if (dm.c.f23488f == null) {
                        synchronized (dm.c.class) {
                            if (dm.c.f23488f == null) {
                                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication7);
                                dm.c.f23488f = new dm.c(lingoSkillApplication7);
                            }
                        }
                    }
                    dm.c cVar3 = dm.c.f23488f;
                    kotlin.jvm.internal.m.c(cVar3);
                    List<Object> listLoadAll = cVar3.f().loadAll();
                    int i16 = 0;
                    while (i16 < 10) {
                        CharGroup charGroup2 = new CharGroup();
                        charGroup2.setIndex(i16);
                        ArrayList arrayList7 = new ArrayList();
                        StringBuilder sb4 = new StringBuilder();
                        for (int i17 = 0; i17 < 10; i17++) {
                            HwCharacter hwCharacter2 = (HwCharacter) listLoadAll.get((i16 * 10) + i17);
                            arrayList7.add(Long.valueOf(hwCharacter2.getCharId()));
                            sb4.append(hwCharacter2.getCharacter() + " ");
                        }
                        i16++;
                        charGroup2.setName(context.getString(R.string.group_s, String.valueOf(i16)));
                        charGroup2.setIds(arrayList7);
                        charGroup2.setDesc(sb4.toString());
                        arrayList4.add(charGroup2);
                    }
                    break;
                }
                return arrayList4;
            case 9:
                jp.w0 w0Var = (jp.w0) this.f4603b;
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                String strK = b7.e0.k(w0Var.P, bq.m.r(cf.x.n().keyLanguage), "-");
                Object objLoad = ue.f.y().f34460u.load(strK);
                UnitFinishStatus unitFinishStatus = (UnitFinishStatus) objLoad;
                if (unitFinishStatus == null) {
                    UnitFinishStatusDao unitFinishStatusDao = ue.f.y().f34460u;
                    UnitFinishStatus unitFinishStatus2 = new UnitFinishStatus();
                    unitFinishStatus2.setId(strK);
                    unitFinishStatus2.setTipsReading(Boolean.TRUE);
                    unitFinishStatusDao.insertOrReplace(unitFinishStatus2);
                } else {
                    UnitFinishStatusDao unitFinishStatusDao2 = ue.f.y().f34460u;
                    unitFinishStatus.setTipsReading(Boolean.TRUE);
                    unitFinishStatusDao2.insertOrReplace(unitFinishStatus);
                }
                return objLoad;
            case 10:
                WorkDatabase workDatabase = (WorkDatabase) ((o20.w) this.f4603b).f44617b;
                Long lJ = workDatabase.A().j("next_alarm_manager_id");
                int iLongValue = lJ != null ? (int) lJ.longValue() : 0;
                workDatabase.A().k(new ob.d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 11:
                pi.h hVar = (pi.h) this.f4603b;
                if (oi.c.f44924t == null) {
                    synchronized (oi.c.class) {
                        if (oi.c.f44924t == null) {
                            LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication9);
                            oi.c.f44924t = new oi.c(lingoSkillApplication9);
                        }
                        break;
                    }
                }
                oi.c cVar4 = oi.c.f44924t;
                kotlin.jvm.internal.m.c(cVar4);
                k10.g gVarQueryBuilder3 = cVar4.g().queryBuilder();
                gVarQueryBuilder3.f(HwCharacterDao.Properties.CharId.b(Long.valueOf(hVar.S)), new k10.h[0]);
                gVarQueryBuilder3.f37855f = 1;
                return (HwCharacter) gVarQueryBuilder3.d().get(0);
            default:
                List list = (List) this.f4603b;
                ArrayList arrayList8 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    List listG = ((hi.a) it2.next()).g();
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj5 : listG) {
                        if (!new File(((fv.a) obj5).f28184c).exists()) {
                            arrayList9.add(obj5);
                        }
                    }
                    int size3 = arrayList9.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj6 = arrayList9.get(i18);
                        i18++;
                        fv.a aVar4 = (fv.a) obj6;
                        if (!arrayList8.contains(aVar4)) {
                            arrayList8.add(aVar4);
                        }
                    }
                }
                return arrayList8;
        }
    }

    public /* synthetic */ g4(Object obj, int i11) {
        this.f4602a = i11;
        this.f4603b = obj;
    }
}
