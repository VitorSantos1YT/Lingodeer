package ep;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import bp.t3;
import bq.r;
import cf.x;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.OtherSubLanguageExpandableItem;
import com.lingodeer.R;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.UCrop;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import l1.h1;
import mf.sOm.txBUGYhC;
import nz.g;
import nz.n;
import oz.q;
import rz.e0;
import vt.k0;
import vt.n0;
import vt.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewModel {
    public final MutableLiveData H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f25719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f25720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f25721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f25722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f25723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25724f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f25725t;

    public c(q0 languageHistoryRepository, n0 n0Var, k0 k0Var) {
        m.f(languageHistoryRepository, "languageHistoryRepository");
        this.f25719a = languageHistoryRepository;
        this.f25720b = n0Var;
        this.f25721c = k0Var;
        this.f25722d = new h1(-1);
        this.f25723e = new h1(-1);
        this.f25725t = Locale.getDefault().getLanguage();
        this.H = new MutableLiveData();
    }

    public static ArrayList f(ArrayList arrayList, boolean z11) {
        Integer language;
        int iIntValue;
        if (z11) {
            return new ArrayList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MultiItemEntity multiItemEntity = (MultiItemEntity) obj;
            LanguageExpandableItem2 languageExpandableItem2 = multiItemEntity instanceof LanguageExpandableItem2 ? (LanguageExpandableItem2) multiItemEntity : null;
            if (languageExpandableItem2 == null || (language = languageExpandableItem2.getLanguage()) == null || ((iIntValue = language.intValue()) != 5 && iIntValue != 15)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ry.m.X0(arrayList2, arrayList3);
        return arrayList3;
    }

    public static String i(Context context, int i11) {
        return r(R.string.ls_section_header, context, s(i11));
    }

    public static String o(Context context, int i11, int i12) {
        String strS = s(i12);
        int i13 = R.string.ls_travel_desc;
        switch (i11) {
            case 0:
                i13 = R.string.ls_cn_1_desc;
                break;
            case 1:
                i13 = R.string.ls_jp_1_desc;
                break;
            case 2:
                i13 = R.string.ls_kr_1_desc;
                break;
            case 3:
            case 9:
            case 23:
            case Service.METRICS_FIELD_NUMBER /* 24 */:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case Service.BILLING_FIELD_NUMBER /* 26 */:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 50:
            default:
                i13 = R.string.ls_en_desc;
                break;
            case 4:
                i13 = R.string.ls_es_1_desc;
                break;
            case 5:
                i13 = R.string.ls_fr_1_desc;
                break;
            case 6:
                i13 = R.string.ls_de_1_desc;
                break;
            case 7:
                i13 = R.string.ls_vt_desc;
                break;
            case 8:
                i13 = R.string.ls_pt_1_desc;
                break;
            case 10:
                i13 = R.string.ls_ru_1_desc;
                break;
            case 11:
                i13 = R.string.ls_cn_2_desc;
                break;
            case 12:
                i13 = R.string.ls_jp_2_desc;
                break;
            case 13:
                i13 = R.string.ls_kr_2_desc;
                break;
            case 14:
                i13 = R.string.ls_es_2_desc;
                break;
            case 15:
                i13 = R.string.ls_fr_2_desc;
                break;
            case 16:
                i13 = R.string.ls_de_2_desc;
                break;
            case 17:
                i13 = R.string.ls_pt_2_desc;
                break;
            case 18:
                i13 = R.string.ls_idn_desc;
                break;
            case 19:
                i13 = R.string.ls_pol_desc;
                break;
            case 20:
                i13 = R.string.ls_it_1_desc;
                break;
            case 21:
                i13 = R.string.ls_tur_desc;
                break;
            case 22:
                i13 = R.string.ls_ru_2_desc;
                break;
            case 30:
                i13 = R.string.ls_jp_fluent_desc;
                break;
            case 31:
                i13 = R.string.ls_kr_fluent_desc;
                break;
            case Consts.SP /* 32 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case 37:
            case 38:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 43:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 52:
            case 56:
            case 59:
            case 60:
            case 62:
            case 64:
            case 66:
            case 67:
            case 68:
            case 70:
                break;
            case 33:
                i13 = R.string.ls_jp_kanji_desc;
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                i13 = R.string.ls_cn_kanji_desc;
                break;
            case 35:
                i13 = R.string.ls_cn_fluent_desc;
                break;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                i13 = R.string.ls_it_2_desc;
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                i13 = R.string.ls_fr_fluent_desc;
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                String strS2 = s(i12);
                if (strS2.equals("ko") || strS2.equals("pt")) {
                    i13 = R.string.ls_en_sc_desc;
                }
                break;
            case 47:
                i13 = R.string.ls_esus_1_desc;
                break;
            case 48:
                i13 = R.string.ls_esus_2_desc;
                break;
            case 49:
                i13 = R.string.ls_enes_desc;
                break;
            case 51:
                i13 = R.string.ls_ar_1_desc;
                break;
            case 53:
                i13 = R.string.ls_frus_1_desc;
                break;
            case 54:
                i13 = R.string.ls_frus_2_desc;
                break;
            case 55:
                i13 = R.string.ls_ar_2_desc;
                break;
            case 57:
                i13 = R.string.ls_thai_desc;
                break;
            case 58:
                i13 = R.string.ls_es_fluent_desc;
                break;
            case 61:
                i13 = R.string.ls_hindi_desc;
                break;
            case 63:
                i13 = R.string.ls_ukr_desc;
                break;
            case 65:
                i13 = R.string.ls_grk_desc;
                break;
            case UCrop.REQUEST_CROP /* 69 */:
                i13 = R.string.ls_mal_desc;
                break;
        }
        return r(i13, context, strS);
    }

    public static String p(Context context, int i11, int i12) {
        int i13;
        String strS = s(i12);
        switch (i11) {
            case 0:
                i13 = R.string.ls_cn_1_title;
                break;
            case 1:
                i13 = R.string.ls_jp_1_title;
                break;
            case 2:
                i13 = R.string.ls_kr_1_title;
                break;
            case 3:
            case 9:
            case 23:
            case Service.METRICS_FIELD_NUMBER /* 24 */:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case Service.BILLING_FIELD_NUMBER /* 26 */:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 50:
            default:
                i13 = R.string.ls_en_title;
                break;
            case 4:
                i13 = R.string.ls_es_1_title;
                break;
            case 5:
                i13 = R.string.ls_fr_1_title;
                break;
            case 6:
                i13 = R.string.ls_de_1_title;
                break;
            case 7:
                i13 = R.string.ls_vt_title;
                break;
            case 8:
                i13 = R.string.ls_pt_1_title;
                break;
            case 10:
                i13 = R.string.ls_ru_1_title;
                break;
            case 11:
                i13 = R.string.ls_cn_2_title;
                break;
            case 12:
                i13 = R.string.ls_jp_2_title;
                break;
            case 13:
                i13 = R.string.ls_kr_2_title;
                break;
            case 14:
                i13 = R.string.ls_es_2_title;
                break;
            case 15:
                i13 = R.string.ls_fr_2_title;
                break;
            case 16:
                i13 = R.string.ls_de_2_title;
                break;
            case 17:
                i13 = R.string.ls_pt_2_title;
                break;
            case 18:
                i13 = R.string.ls_idn_title;
                break;
            case 19:
                i13 = R.string.ls_pol_title;
                break;
            case 20:
                i13 = R.string.ls_it_1_title;
                break;
            case 21:
                i13 = R.string.ls_tur_title;
                break;
            case 22:
                i13 = R.string.ls_ru_2_title;
                break;
            case 30:
                i13 = R.string.ls_jp_fluent_title;
                break;
            case 31:
                i13 = R.string.ls_kr_fluent_title;
                break;
            case Consts.SP /* 32 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case 37:
            case 38:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 52:
            case 56:
            case 59:
            case 60:
            case 62:
            case 64:
            case 66:
            case 67:
            case 68:
            case 70:
                i13 = R.string.ls_travel_title;
                break;
            case 33:
                i13 = R.string.ls_jp_kanji_title;
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                i13 = R.string.ls_cn_kanji_title;
                break;
            case 35:
                i13 = R.string.ls_cn_fluent_title;
                break;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                i13 = R.string.ls_it_2_title;
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                i13 = R.string.ls_fr_fluent_title;
                break;
            case 47:
                i13 = R.string.ls_esus_1_title;
                break;
            case 48:
                i13 = R.string.ls_esus_2_title;
                break;
            case 49:
                i13 = R.string.ls_enes_title;
                break;
            case 51:
                i13 = R.string.ls_ar_1_title;
                break;
            case 53:
                i13 = R.string.ls_frus_1_title;
                break;
            case 54:
                i13 = R.string.ls_frus_2_title;
                break;
            case 55:
                i13 = R.string.ls_ar_2_title;
                break;
            case 57:
                i13 = R.string.ls_thai_title;
                break;
            case 58:
                i13 = R.string.ls_es_fluent_title;
                break;
            case 61:
                i13 = R.string.ls_hindi_title;
                break;
            case 63:
                i13 = R.string.ls_ukr_title;
                break;
            case 65:
                i13 = R.string.ls_grk_title;
                break;
            case UCrop.REQUEST_CROP /* 69 */:
                i13 = R.string.ls_mal_title;
                break;
        }
        return r(i13, context, strS);
    }

    public final LanguageExpandableItem2 a(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.arabic), 51);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(51, 3, p(context, 51, 3));
        List listP = a.p(languageItem, o(context, 51, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(55, 3, p(context, 55, 3));
        List listP2 = a.p(languageItem2, o(context, 55, 3), listP, languageItem2, otherSubLanguageExpandableItem);
        LanguageItem languageItem3 = new LanguageItem(52, 3, p(context, 52, 3));
        languageItem3.setDescription(o(context, 52, 3));
        listP2.add(languageItem3);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(51, 9, p(context, 51, 9));
        List listP3 = a.p(languageItem4, o(context, 51, 9), listQ2, languageItem4, otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(55, 9, p(context, 55, 9));
        List listP4 = a.p(languageItem5, o(context, 55, 9), listP3, languageItem5, otherSubLanguageExpandableItem2);
        LanguageItem languageItem6 = new LanguageItem(52, 9, p(context, 52, 9));
        languageItem6.setDescription(o(context, 52, 9));
        listP4.add(languageItem6);
        if (m.a(this.f25725t, "zh")) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem2);
        } else {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x07d5  */
    public final LanguageExpandableItem2 b(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.chinese), 0);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        ArrayList arrayList2 = new ArrayList();
        LanguageItem languageItem = new LanguageItem(0, 3, p(context, 0, 3));
        languageItem.setDescription(o(context, 0, 3));
        arrayList2.add(languageItem);
        LanguageItem languageItem2 = new LanguageItem(11, 3, p(context, 11, 3));
        languageItem2.setDescription(o(context, 11, 3));
        arrayList2.add(languageItem2);
        LanguageItem languageItem3 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem3.setDescription(o(context, 35, 3));
        arrayList2.add(languageItem3);
        LanguageItem languageItem4 = new LanguageItem(32, 3, p(context, 32, 3));
        languageItem4.setDescription(o(context, 32, 3));
        arrayList2.add(languageItem4);
        LanguageItem languageItem5 = new LanguageItem(34, 3, p(context, 34, 3));
        languageItem5.setDescription(o(context, 34, 3));
        arrayList2.add(languageItem5);
        otherSubLanguageExpandableItem.setSubItems(arrayList2);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 4));
        ArrayList arrayList3 = new ArrayList();
        LanguageItem languageItem6 = new LanguageItem(0, 4, p(context, 0, 4));
        languageItem6.setDescription(o(context, 0, 4));
        arrayList3.add(languageItem6);
        LanguageItem languageItem7 = new LanguageItem(11, 4, p(context, 11, 4));
        languageItem7.setDescription(o(context, 11, 4));
        arrayList3.add(languageItem7);
        LanguageItem languageItem8 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem8.setDescription(o(context, 35, 3));
        arrayList3.add(languageItem8);
        LanguageItem languageItem9 = new LanguageItem(32, 4, p(context, 32, 4));
        languageItem9.setDescription(o(context, 32, 4));
        arrayList3.add(languageItem9);
        LanguageItem languageItem10 = new LanguageItem(34, 4, p(context, 34, 4));
        languageItem10.setDescription(o(context, 34, 4));
        arrayList3.add(languageItem10);
        otherSubLanguageExpandableItem2.setSubItems(arrayList3);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 5));
        ArrayList arrayList4 = new ArrayList();
        LanguageItem languageItem11 = new LanguageItem(0, 5, p(context, 0, 5));
        languageItem11.setDescription(o(context, 0, 5));
        arrayList4.add(languageItem11);
        LanguageItem languageItem12 = new LanguageItem(11, 5, p(context, 11, 5));
        languageItem12.setDescription(o(context, 11, 5));
        arrayList4.add(languageItem12);
        LanguageItem languageItem13 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem13.setDescription(o(context, 35, 3));
        arrayList4.add(languageItem13);
        LanguageItem languageItem14 = new LanguageItem(32, 5, p(context, 32, 5));
        languageItem14.setDescription(o(context, 32, 5));
        arrayList4.add(languageItem14);
        LanguageItem languageItem15 = new LanguageItem(34, 5, p(context, 34, 5));
        languageItem15.setDescription(o(context, 34, 5));
        arrayList4.add(languageItem15);
        otherSubLanguageExpandableItem3.setSubItems(arrayList4);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem4 = new OtherSubLanguageExpandableItem(i(context, 6));
        ArrayList arrayList5 = new ArrayList();
        LanguageItem languageItem16 = new LanguageItem(0, 6, p(context, 0, 6));
        languageItem16.setDescription(o(context, 0, 6));
        arrayList5.add(languageItem16);
        LanguageItem languageItem17 = new LanguageItem(11, 6, p(context, 11, 6));
        languageItem17.setDescription(o(context, 11, 6));
        arrayList5.add(languageItem17);
        LanguageItem languageItem18 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem18.setDescription(o(context, 35, 3));
        arrayList5.add(languageItem18);
        LanguageItem languageItem19 = new LanguageItem(32, 6, p(context, 32, 6));
        languageItem19.setDescription(o(context, 32, 6));
        arrayList5.add(languageItem19);
        LanguageItem languageItem20 = new LanguageItem(34, 6, p(context, 34, 6));
        languageItem20.setDescription(o(context, 34, 6));
        arrayList5.add(languageItem20);
        otherSubLanguageExpandableItem4.setSubItems(arrayList5);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem5 = new OtherSubLanguageExpandableItem(i(context, 1));
        ArrayList arrayList6 = new ArrayList();
        LanguageItem languageItem21 = new LanguageItem(0, 1, p(context, 0, 1));
        languageItem21.setDescription(o(context, 0, 1));
        arrayList6.add(languageItem21);
        LanguageItem languageItem22 = new LanguageItem(11, 1, p(context, 11, 1));
        languageItem22.setDescription(o(context, 11, 1));
        arrayList6.add(languageItem22);
        LanguageItem languageItem23 = new LanguageItem(35, 1, p(context, 35, 1));
        languageItem23.setDescription(o(context, 35, 1));
        arrayList6.add(languageItem23);
        LanguageItem languageItem24 = new LanguageItem(32, 1, p(context, 32, 1));
        languageItem24.setDescription(o(context, 32, 1));
        arrayList6.add(languageItem24);
        LanguageItem languageItem25 = new LanguageItem(34, 1, p(context, 34, 1));
        languageItem25.setDescription(o(context, 34, 1));
        arrayList6.add(languageItem25);
        otherSubLanguageExpandableItem5.setSubItems(arrayList6);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem6 = new OtherSubLanguageExpandableItem(i(context, 2));
        ArrayList arrayList7 = new ArrayList();
        LanguageItem languageItem26 = new LanguageItem(0, 2, p(context, 0, 2));
        languageItem26.setDescription(o(context, 0, 2));
        arrayList7.add(languageItem26);
        LanguageItem languageItem27 = new LanguageItem(11, 2, p(context, 11, 2));
        languageItem27.setDescription(o(context, 11, 2));
        arrayList7.add(languageItem27);
        LanguageItem languageItem28 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem28.setDescription(o(context, 35, 3));
        arrayList7.add(languageItem28);
        LanguageItem languageItem29 = new LanguageItem(32, 2, p(context, 32, 2));
        languageItem29.setDescription(o(context, 32, 2));
        arrayList7.add(languageItem29);
        LanguageItem languageItem30 = new LanguageItem(34, 2, p(context, 34, 2));
        languageItem30.setDescription(o(context, 34, 2));
        arrayList7.add(languageItem30);
        otherSubLanguageExpandableItem6.setSubItems(arrayList7);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem7 = new OtherSubLanguageExpandableItem(i(context, 7));
        ArrayList arrayList8 = new ArrayList();
        LanguageItem languageItem31 = new LanguageItem(0, 7, p(context, 0, 7));
        languageItem31.setDescription(o(context, 0, 7));
        arrayList8.add(languageItem31);
        LanguageItem languageItem32 = new LanguageItem(11, 7, p(context, 11, 7));
        languageItem32.setDescription(o(context, 11, 7));
        arrayList8.add(languageItem32);
        LanguageItem languageItem33 = new LanguageItem(35, 7, p(context, 35, 7));
        languageItem33.setDescription(o(context, 35, 7));
        arrayList8.add(languageItem33);
        LanguageItem languageItem34 = new LanguageItem(32, 7, p(context, 32, 7));
        languageItem34.setDescription(o(context, 32, 7));
        arrayList8.add(languageItem34);
        LanguageItem languageItem35 = new LanguageItem(34, 7, p(context, 34, 7));
        languageItem35.setDescription(o(context, 34, 7));
        arrayList8.add(languageItem35);
        otherSubLanguageExpandableItem7.setSubItems(arrayList8);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem8 = new OtherSubLanguageExpandableItem(i(context, 8));
        ArrayList arrayList9 = new ArrayList();
        LanguageItem languageItem36 = new LanguageItem(0, 8, p(context, 0, 8));
        languageItem36.setDescription(o(context, 0, 8));
        arrayList9.add(languageItem36);
        LanguageItem languageItem37 = new LanguageItem(11, 8, p(context, 11, 8));
        languageItem37.setDescription(o(context, 11, 8));
        arrayList9.add(languageItem37);
        LanguageItem languageItem38 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem38.setDescription(o(context, 35, 3));
        arrayList9.add(languageItem38);
        LanguageItem languageItem39 = new LanguageItem(32, 8, p(context, 32, 8));
        languageItem39.setDescription(o(context, 32, 8));
        arrayList9.add(languageItem39);
        LanguageItem languageItem40 = new LanguageItem(34, 8, p(context, 34, 8));
        languageItem40.setDescription(o(context, 34, 8));
        arrayList9.add(languageItem40);
        otherSubLanguageExpandableItem8.setSubItems(arrayList9);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem9 = new OtherSubLanguageExpandableItem(i(context, 10));
        ArrayList arrayList10 = new ArrayList();
        LanguageItem languageItem41 = new LanguageItem(0, 10, p(context, 0, 10));
        languageItem41.setDescription(o(context, 0, 10));
        arrayList10.add(languageItem41);
        LanguageItem languageItem42 = new LanguageItem(11, 10, p(context, 11, 10));
        languageItem42.setDescription(o(context, 11, 10));
        arrayList10.add(languageItem42);
        LanguageItem languageItem43 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem43.setDescription(o(context, 35, 3));
        arrayList10.add(languageItem43);
        LanguageItem languageItem44 = new LanguageItem(32, 10, p(context, 32, 10));
        languageItem44.setDescription(o(context, 32, 10));
        arrayList10.add(languageItem44);
        LanguageItem languageItem45 = new LanguageItem(34, 10, p(context, 34, 10));
        languageItem45.setDescription(o(context, 34, 10));
        arrayList10.add(languageItem45);
        otherSubLanguageExpandableItem9.setSubItems(arrayList10);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem10 = new OtherSubLanguageExpandableItem(i(context, 18));
        ArrayList arrayList11 = new ArrayList();
        LanguageItem languageItem46 = new LanguageItem(0, 18, p(context, 0, 18));
        languageItem46.setDescription(o(context, 0, 18));
        arrayList11.add(languageItem46);
        LanguageItem languageItem47 = new LanguageItem(11, 3, p(context, 11, 3));
        languageItem47.setDescription(o(context, 11, 3));
        arrayList11.add(languageItem47);
        LanguageItem languageItem48 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem48.setDescription(o(context, 35, 3));
        arrayList11.add(languageItem48);
        LanguageItem languageItem49 = new LanguageItem(32, 18, p(context, 32, 18));
        languageItem49.setDescription(o(context, 32, 18));
        arrayList11.add(languageItem49);
        LanguageItem languageItem50 = new LanguageItem(34, 18, p(context, 34, 18));
        languageItem50.setDescription(o(context, 34, 18));
        arrayList11.add(languageItem50);
        otherSubLanguageExpandableItem10.setSubItems(arrayList11);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem11 = new OtherSubLanguageExpandableItem(i(context, 20));
        ArrayList arrayList12 = new ArrayList();
        LanguageItem languageItem51 = new LanguageItem(0, 20, p(context, 0, 20));
        languageItem51.setDescription(o(context, 0, 20));
        arrayList12.add(languageItem51);
        LanguageItem languageItem52 = new LanguageItem(11, 20, p(context, 11, 20));
        languageItem52.setDescription(o(context, 11, 20));
        arrayList12.add(languageItem52);
        LanguageItem languageItem53 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem53.setDescription(o(context, 35, 3));
        arrayList12.add(languageItem53);
        LanguageItem languageItem54 = new LanguageItem(32, 20, p(context, 32, 20));
        languageItem54.setDescription(o(context, 32, 20));
        arrayList12.add(languageItem54);
        LanguageItem languageItem55 = new LanguageItem(34, 20, p(context, 34, 20));
        languageItem55.setDescription(o(context, 34, 20));
        arrayList12.add(languageItem55);
        otherSubLanguageExpandableItem11.setSubItems(arrayList12);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem12 = new OtherSubLanguageExpandableItem(i(context, 21));
        ArrayList arrayList13 = new ArrayList();
        LanguageItem languageItem56 = new LanguageItem(0, 21, p(context, 0, 21));
        languageItem56.setDescription(o(context, 0, 21));
        arrayList13.add(languageItem56);
        LanguageItem languageItem57 = new LanguageItem(11, 3, p(context, 11, 3));
        languageItem57.setDescription(o(context, 11, 3));
        arrayList13.add(languageItem57);
        LanguageItem languageItem58 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem58.setDescription(o(context, 35, 3));
        arrayList13.add(languageItem58);
        LanguageItem languageItem59 = new LanguageItem(32, 3, p(context, 32, 3));
        languageItem59.setDescription(o(context, 32, 3));
        arrayList13.add(languageItem59);
        LanguageItem languageItem60 = new LanguageItem(34, 3, p(context, 34, 3));
        languageItem60.setDescription(o(context, 34, 3));
        arrayList13.add(languageItem60);
        otherSubLanguageExpandableItem12.setSubItems(arrayList13);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem13 = new OtherSubLanguageExpandableItem(i(context, 57));
        ArrayList arrayList14 = new ArrayList();
        LanguageItem languageItem61 = new LanguageItem(0, 57, p(context, 0, 57));
        languageItem61.setDescription(o(context, 0, 57));
        arrayList14.add(languageItem61);
        LanguageItem languageItem62 = new LanguageItem(11, 57, p(context, 11, 57));
        languageItem62.setDescription(o(context, 11, 57));
        arrayList14.add(languageItem62);
        LanguageItem languageItem63 = new LanguageItem(35, 3, p(context, 35, 3));
        languageItem63.setDescription(o(context, 35, 3));
        arrayList14.add(languageItem63);
        LanguageItem languageItem64 = new LanguageItem(32, 3, p(context, 32, 3));
        languageItem64.setDescription(o(context, 32, 3));
        arrayList14.add(languageItem64);
        LanguageItem languageItem65 = new LanguageItem(34, 57, p(context, 34, 57));
        languageItem65.setDescription(o(context, 34, 57));
        arrayList14.add(languageItem65);
        otherSubLanguageExpandableItem13.setSubItems(arrayList14);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem14 = new OtherSubLanguageExpandableItem(i(context, 51));
        ArrayList arrayList15 = new ArrayList();
        LanguageItem languageItem66 = new LanguageItem(0, 51, p(context, 0, 51));
        languageItem66.setDescription(o(context, 0, 51));
        arrayList15.add(languageItem66);
        LanguageItem languageItem67 = new LanguageItem(34, 51, p(context, 34, 51));
        languageItem67.setDescription(o(context, 34, 51));
        arrayList15.add(languageItem67);
        otherSubLanguageExpandableItem14.setSubItems(arrayList15);
        String str2 = this.f25725t;
        if (str2 != null) {
            switch (str2) {
                case "ar":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem14.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem14);
                    break;
                case "de":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem4.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem4);
                    break;
                case "es":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem2);
                    break;
                case "fr":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem3);
                    break;
                case "in":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem10.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem10);
                    break;
                case "it":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem11.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem11);
                    break;
                case "ja":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem5.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem5);
                    break;
                case "ko":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem6.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem6);
                    break;
                case "pt":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem8.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem8);
                    break;
                case "ru":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem9.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem9);
                    break;
                case "th":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem13.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem13);
                    break;
                case "tr":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem12.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem12);
                    break;
                case "vi":
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem7.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem7);
                    break;
                default:
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem);
                    break;
            }
        } else {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0242  */
    public final LanguageExpandableItem2 c(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.german), 6);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(6, 3, p(context, 6, 3));
        List listP = a.p(languageItem, o(context, 6, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(16, 3, p(context, 16, 3));
        List listP2 = a.p(languageItem2, o(context, 16, 3), listP, languageItem2, otherSubLanguageExpandableItem);
        LanguageItem languageItem3 = new LanguageItem(43, 3, p(context, 43, 3));
        languageItem3.setDescription(o(context, 43, 3));
        listP2.add(languageItem3);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(6, 9, p(context, 6, 9));
        List listP3 = a.p(languageItem4, o(context, 6, 9), listQ2, languageItem4, otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(16, 9, p(context, 16, 9));
        List listP4 = a.p(languageItem5, o(context, 16, 9), listP3, languageItem5, otherSubLanguageExpandableItem2);
        LanguageItem languageItem6 = new LanguageItem(43, 9, p(context, 43, 9));
        languageItem6.setDescription(o(context, 43, 9));
        listP4.add(languageItem6);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 1));
        List listQ3 = a.q(otherSubLanguageExpandableItem3);
        LanguageItem languageItem7 = new LanguageItem(6, 1, p(context, 6, 1));
        List listP5 = a.p(languageItem7, o(context, 6, 1), listQ3, languageItem7, otherSubLanguageExpandableItem3);
        LanguageItem languageItem8 = new LanguageItem(16, 1, p(context, 16, 1));
        List listP6 = a.p(languageItem8, o(context, 16, 1), listP5, languageItem8, otherSubLanguageExpandableItem3);
        LanguageItem languageItem9 = new LanguageItem(43, 1, p(context, 43, 1));
        languageItem9.setDescription(o(context, 43, 1));
        listP6.add(languageItem9);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem4 = new OtherSubLanguageExpandableItem(i(context, 2));
        List listQ4 = a.q(otherSubLanguageExpandableItem4);
        LanguageItem languageItem10 = new LanguageItem(6, 2, p(context, 6, 2));
        List listP7 = a.p(languageItem10, o(context, 6, 2), listQ4, languageItem10, otherSubLanguageExpandableItem4);
        LanguageItem languageItem11 = new LanguageItem(16, 2, p(context, 16, 2));
        List listP8 = a.p(languageItem11, o(context, 16, 2), listP7, languageItem11, otherSubLanguageExpandableItem4);
        LanguageItem languageItem12 = new LanguageItem(43, 2, p(context, 43, 2));
        languageItem12.setDescription(o(context, 43, 2));
        listP8.add(languageItem12);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem5 = new OtherSubLanguageExpandableItem(i(context, 5));
        List listQ5 = a.q(otherSubLanguageExpandableItem5);
        LanguageItem languageItem13 = new LanguageItem(6, 3, p(context, 6, 3));
        List listP9 = a.p(languageItem13, o(context, 6, 3), listQ5, languageItem13, otherSubLanguageExpandableItem5);
        LanguageItem languageItem14 = new LanguageItem(16, 3, p(context, 16, 3));
        List listP10 = a.p(languageItem14, o(context, 16, 3), listP9, languageItem14, otherSubLanguageExpandableItem5);
        LanguageItem languageItem15 = new LanguageItem(43, 5, p(context, 43, 5));
        languageItem15.setDescription(o(context, 43, 5));
        listP10.add(languageItem15);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem6 = new OtherSubLanguageExpandableItem(i(context, 21));
        List listQ6 = a.q(otherSubLanguageExpandableItem6);
        LanguageItem languageItem16 = new LanguageItem(6, 21, p(context, 6, 21));
        List listP11 = a.p(languageItem16, o(context, 6, 21), listQ6, languageItem16, otherSubLanguageExpandableItem6);
        LanguageItem languageItem17 = new LanguageItem(16, 21, p(context, 16, 21));
        List listP12 = a.p(languageItem17, o(context, 16, 21), listP11, languageItem17, otherSubLanguageExpandableItem6);
        LanguageItem languageItem18 = new LanguageItem(43, 21, p(context, 43, 21));
        languageItem18.setDescription(o(context, 43, 21));
        listP12.add(languageItem18);
        String str2 = this.f25725t;
        if (str2 == null) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        } else {
            int iHashCode = str2.hashCode();
            if (iHashCode != 3276) {
                if (iHashCode != 3383) {
                    if (iHashCode != 3428) {
                        if (iHashCode != 3710) {
                            if (iHashCode == 3886 && str2.equals("zh")) {
                                arrayList = new ArrayList();
                                otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
                                arrayList.add(otherSubLanguageExpandableItem2);
                            } else {
                                arrayList = new ArrayList();
                                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                arrayList.add(otherSubLanguageExpandableItem);
                            }
                        } else if (str2.equals("tr")) {
                            arrayList = new ArrayList();
                            otherSubLanguageExpandableItem6.setCanExpand(Boolean.FALSE);
                            arrayList.add(otherSubLanguageExpandableItem6);
                        } else {
                            arrayList = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList.add(otherSubLanguageExpandableItem);
                        }
                    } else if (str2.equals("ko")) {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem4.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem4);
                    } else {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem);
                    }
                } else if (str2.equals("ja")) {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem3);
                } else {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem);
                }
            } else if (str2.equals("fr")) {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem5.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem5);
            } else {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem);
            }
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageItem g(Context context, String str, int i11, int i12) {
        Object next;
        m.f(context, "context");
        q(-1, context, str);
        Iterable iterable = (List) this.H.getValue();
        if (iterable == null) {
            iterable = ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof LanguageExpandableItem2) {
                arrayList.add(obj);
            }
        }
        g gVar = new g(n.R(n.T(ry.m.g0(arrayList), new dv.e(14)), b.f25718a));
        while (gVar.hasNext()) {
            next = gVar.next();
            LanguageItem languageItem = (LanguageItem) next;
            if (languageItem.getKeyLanguage() == i11 && languageItem.getLocate() == i12) {
                return (LanguageItem) next;
            }
        }
        next = null;
        return (LanguageItem) next;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x015f  */
    public final LanguageExpandableItem2 h(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.french_normal), 5);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(5, 3, p(context, 5, 3));
        List listP = a.p(languageItem, o(context, 5, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(15, 3, p(context, 15, 3));
        languageItem2.setDescription(o(context, 15, 3));
        listP.add(languageItem2);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem3 = new LanguageItem(5, 9, p(context, 5, 9));
        List listP2 = a.p(languageItem3, o(context, 5, 9), listQ2, languageItem3, otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(15, 9, p(context, 15, 9));
        List listP3 = a.p(languageItem4, o(context, 15, 9), listP2, languageItem4, otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(36, 9, p(context, 36, 9));
        languageItem5.setDescription(o(context, 36, 9));
        listP3.add(languageItem5);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 2));
        List listQ3 = a.q(otherSubLanguageExpandableItem3);
        LanguageItem languageItem6 = new LanguageItem(5, 2, p(context, 5, 2));
        List listP4 = a.p(languageItem6, o(context, 5, 2), listQ3, languageItem6, otherSubLanguageExpandableItem3);
        LanguageItem languageItem7 = new LanguageItem(15, 2, p(context, 15, 2));
        languageItem7.setDescription(o(context, 15, 2));
        listP4.add(languageItem7);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem4 = new OtherSubLanguageExpandableItem(i(context, 1));
        List listQ4 = a.q(otherSubLanguageExpandableItem4);
        LanguageItem languageItem8 = new LanguageItem(5, 1, p(context, 5, 1));
        List listP5 = a.p(languageItem8, o(context, 5, 1), listQ4, languageItem8, otherSubLanguageExpandableItem4);
        LanguageItem languageItem9 = new LanguageItem(15, 1, p(context, 15, 1));
        List listP6 = a.p(languageItem9, o(context, 15, 1), listP5, languageItem9, otherSubLanguageExpandableItem4);
        LanguageItem languageItem10 = new LanguageItem(36, 1, p(context, 36, 1));
        languageItem10.setDescription(o(context, 36, 1));
        listP6.add(languageItem10);
        String str2 = this.f25725t;
        if (str2 == null) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        } else {
            int iHashCode = str2.hashCode();
            if (iHashCode != 3383) {
                if (iHashCode != 3428) {
                    if (iHashCode == 3886 && str2.equals("zh")) {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem2);
                    } else {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem);
                    }
                } else if (str2.equals("ko")) {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem3);
                } else {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem);
                }
            } else if (str2.equals("ja")) {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem4.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem4);
            } else {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem);
            }
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 j(Context context) {
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.grk), 65);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(65, 3, p(context, 65, 3));
        List listP = a.p(languageItem, o(context, 65, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(66, 3, p(context, 66, 3));
        languageItem2.setDescription(o(context, 66, 3));
        listP.add(languageItem2);
        ArrayList arrayList = new ArrayList();
        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
        arrayList.add(otherSubLanguageExpandableItem);
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 k(Context context) {
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.hindi), 61);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(61, 3, p(context, 61, 3));
        languageItem.setDescription(o(context, 61, 3));
        listQ.add(languageItem);
        ArrayList arrayList = new ArrayList();
        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
        arrayList.add(otherSubLanguageExpandableItem);
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 l(Context context) {
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.indonesia), 18);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(18, 3, p(context, 18, 3));
        List listP = a.p(languageItem, o(context, 18, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(67, 3, p(context, 67, 3));
        languageItem2.setDescription(o(context, 67, 3));
        listP.add(languageItem2);
        ArrayList arrayList = new ArrayList();
        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
        arrayList.add(otherSubLanguageExpandableItem);
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 m(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.italy), 20);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(20, 3, p(context, 20, 3));
        List listP = a.p(languageItem, o(context, 20, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(40, 3, p(context, 40, 3));
        List listP2 = a.p(languageItem2, o(context, 40, 3), listP, languageItem2, otherSubLanguageExpandableItem);
        LanguageItem languageItem3 = new LanguageItem(45, 3, p(context, 45, 3));
        languageItem3.setDescription(o(context, 45, 3));
        listP2.add(languageItem3);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(20, 3, p(context, 20, 3));
        List listP3 = a.p(languageItem4, o(context, 20, 3), listQ2, languageItem4, otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(40, 3, p(context, 40, 3));
        List listP4 = a.p(languageItem5, o(context, 40, 3), listP3, languageItem5, otherSubLanguageExpandableItem2);
        LanguageItem languageItem6 = new LanguageItem(45, 9, p(context, 45, 9));
        languageItem6.setDescription(o(context, 45, 9));
        listP4.add(languageItem6);
        if (m.a(this.f25725t, "zh")) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem2);
        } else {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0519  */
    public final LanguageExpandableItem2 n(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.korean), 2);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(2, 3, p(context, 2, 3));
        List listP = a.p(languageItem, o(context, 2, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(13, 3, p(context, 13, 3));
        List listP2 = a.p(languageItem2, o(context, 13, 3), listP, languageItem2, otherSubLanguageExpandableItem);
        LanguageItem languageItem3 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP3 = a.p(languageItem3, o(context, 31, 3), listP2, languageItem3, otherSubLanguageExpandableItem);
        LanguageItem languageItem4 = new LanguageItem(38, 3, p(context, 38, 3));
        languageItem4.setDescription(o(context, 38, 3));
        listP3.add(languageItem4);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 4));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(2, 4, p(context, 2, 4));
        List listP4 = a.p(languageItem5, o(context, 2, 4), listQ2, languageItem5, otherSubLanguageExpandableItem2);
        LanguageItem languageItem6 = new LanguageItem(13, 4, p(context, 13, 4));
        List listP5 = a.p(languageItem6, o(context, 13, 4), listP4, languageItem6, otherSubLanguageExpandableItem2);
        LanguageItem languageItem7 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP6 = a.p(languageItem7, o(context, 31, 3), listP5, languageItem7, otherSubLanguageExpandableItem2);
        LanguageItem languageItem8 = new LanguageItem(38, 3, p(context, 38, 3));
        languageItem8.setDescription(o(context, 38, 3));
        listP6.add(languageItem8);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 5));
        List listQ3 = a.q(otherSubLanguageExpandableItem3);
        LanguageItem languageItem9 = new LanguageItem(2, 5, p(context, 2, 5));
        List listP7 = a.p(languageItem9, o(context, 2, 5), listQ3, languageItem9, otherSubLanguageExpandableItem3);
        LanguageItem languageItem10 = new LanguageItem(13, 5, p(context, 13, 5));
        List listP8 = a.p(languageItem10, o(context, 13, 5), listP7, languageItem10, otherSubLanguageExpandableItem3);
        LanguageItem languageItem11 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP9 = a.p(languageItem11, o(context, 31, 3), listP8, languageItem11, otherSubLanguageExpandableItem3);
        LanguageItem languageItem12 = new LanguageItem(38, 5, p(context, 38, 5));
        languageItem12.setDescription(o(context, 38, 5));
        listP9.add(languageItem12);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem4 = new OtherSubLanguageExpandableItem(i(context, 6));
        List listQ4 = a.q(otherSubLanguageExpandableItem4);
        LanguageItem languageItem13 = new LanguageItem(2, 6, p(context, 2, 6));
        List listP10 = a.p(languageItem13, o(context, 2, 6), listQ4, languageItem13, otherSubLanguageExpandableItem4);
        LanguageItem languageItem14 = new LanguageItem(13, 6, p(context, 13, 6));
        List listP11 = a.p(languageItem14, o(context, 13, 6), listP10, languageItem14, otherSubLanguageExpandableItem4);
        LanguageItem languageItem15 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP12 = a.p(languageItem15, o(context, 31, 3), listP11, languageItem15, otherSubLanguageExpandableItem4);
        LanguageItem languageItem16 = new LanguageItem(38, 6, p(context, 38, 6));
        languageItem16.setDescription(o(context, 38, 6));
        listP12.add(languageItem16);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem5 = new OtherSubLanguageExpandableItem(i(context, 1));
        List listQ5 = a.q(otherSubLanguageExpandableItem5);
        LanguageItem languageItem17 = new LanguageItem(2, 1, p(context, 2, 1));
        List listP13 = a.p(languageItem17, o(context, 2, 1), listQ5, languageItem17, otherSubLanguageExpandableItem5);
        LanguageItem languageItem18 = new LanguageItem(13, 1, p(context, 13, 1));
        List listP14 = a.p(languageItem18, o(context, 13, 1), listP13, languageItem18, otherSubLanguageExpandableItem5);
        LanguageItem languageItem19 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP15 = a.p(languageItem19, o(context, 31, 3), listP14, languageItem19, otherSubLanguageExpandableItem5);
        LanguageItem languageItem20 = new LanguageItem(38, 1, p(context, 38, 1));
        languageItem20.setDescription(o(context, 38, 1));
        listP15.add(languageItem20);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem6 = new OtherSubLanguageExpandableItem(i(context, 7));
        List listQ6 = a.q(otherSubLanguageExpandableItem6);
        LanguageItem languageItem21 = new LanguageItem(2, 7, p(context, 2, 7));
        List listP16 = a.p(languageItem21, o(context, 2, 7), listQ6, languageItem21, otherSubLanguageExpandableItem6);
        LanguageItem languageItem22 = new LanguageItem(13, 3, p(context, 13, 3));
        List listP17 = a.p(languageItem22, o(context, 13, 3), listP16, languageItem22, otherSubLanguageExpandableItem6);
        LanguageItem languageItem23 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP18 = a.p(languageItem23, o(context, 31, 3), listP17, languageItem23, otherSubLanguageExpandableItem6);
        LanguageItem languageItem24 = new LanguageItem(38, 3, p(context, 38, 3));
        languageItem24.setDescription(o(context, 38, 3));
        listP18.add(languageItem24);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem7 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ7 = a.q(otherSubLanguageExpandableItem7);
        LanguageItem languageItem25 = new LanguageItem(2, 9, p(context, 2, 9));
        List listP19 = a.p(languageItem25, o(context, 2, 9), listQ7, languageItem25, otherSubLanguageExpandableItem7);
        LanguageItem languageItem26 = new LanguageItem(13, 9, p(context, 13, 9));
        List listP20 = a.p(languageItem26, o(context, 13, 9), listP19, languageItem26, otherSubLanguageExpandableItem7);
        LanguageItem languageItem27 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP21 = a.p(languageItem27, o(context, 31, 3), listP20, languageItem27, otherSubLanguageExpandableItem7);
        LanguageItem languageItem28 = new LanguageItem(38, 9, p(context, 38, 9));
        languageItem28.setDescription(o(context, 38, 9));
        listP21.add(languageItem28);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem8 = new OtherSubLanguageExpandableItem(i(context, 8));
        List listQ8 = a.q(otherSubLanguageExpandableItem8);
        LanguageItem languageItem29 = new LanguageItem(2, 8, p(context, 2, 8));
        List listP22 = a.p(languageItem29, o(context, 2, 8), listQ8, languageItem29, otherSubLanguageExpandableItem8);
        LanguageItem languageItem30 = new LanguageItem(13, 3, p(context, 13, 3));
        List listP23 = a.p(languageItem30, o(context, 13, 3), listP22, languageItem30, otherSubLanguageExpandableItem8);
        LanguageItem languageItem31 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP24 = a.p(languageItem31, o(context, 31, 3), listP23, languageItem31, otherSubLanguageExpandableItem8);
        LanguageItem languageItem32 = new LanguageItem(38, 3, p(context, 38, 3));
        languageItem32.setDescription(o(context, 38, 3));
        listP24.add(languageItem32);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem9 = new OtherSubLanguageExpandableItem(i(context, 10));
        List listQ9 = a.q(otherSubLanguageExpandableItem9);
        LanguageItem languageItem33 = new LanguageItem(2, 10, p(context, 2, 10));
        List listP25 = a.p(languageItem33, o(context, 2, 10), listQ9, languageItem33, otherSubLanguageExpandableItem9);
        LanguageItem languageItem34 = new LanguageItem(13, 3, p(context, 13, 3));
        List listP26 = a.p(languageItem34, o(context, 13, 3), listP25, languageItem34, otherSubLanguageExpandableItem9);
        LanguageItem languageItem35 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP27 = a.p(languageItem35, o(context, 31, 3), listP26, languageItem35, otherSubLanguageExpandableItem9);
        LanguageItem languageItem36 = new LanguageItem(38, 3, p(context, 38, 3));
        languageItem36.setDescription(o(context, 38, 3));
        listP27.add(languageItem36);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem10 = new OtherSubLanguageExpandableItem(i(context, 18));
        List listQ10 = a.q(otherSubLanguageExpandableItem10);
        LanguageItem languageItem37 = new LanguageItem(2, 18, p(context, 2, 18));
        List listP28 = a.p(languageItem37, o(context, 2, 18), listQ10, languageItem37, otherSubLanguageExpandableItem10);
        LanguageItem languageItem38 = new LanguageItem(13, 3, p(context, 13, 3));
        List listP29 = a.p(languageItem38, o(context, 13, 3), listP28, languageItem38, otherSubLanguageExpandableItem10);
        LanguageItem languageItem39 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP30 = a.p(languageItem39, o(context, 31, 3), listP29, languageItem39, otherSubLanguageExpandableItem10);
        LanguageItem languageItem40 = new LanguageItem(38, 3, p(context, 38, 3));
        languageItem40.setDescription(o(context, 38, 3));
        listP30.add(languageItem40);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem11 = new OtherSubLanguageExpandableItem(i(context, 20));
        List listQ11 = a.q(otherSubLanguageExpandableItem11);
        LanguageItem languageItem41 = new LanguageItem(2, 20, p(context, 2, 20));
        List listP31 = a.p(languageItem41, o(context, 2, 20), listQ11, languageItem41, otherSubLanguageExpandableItem11);
        LanguageItem languageItem42 = new LanguageItem(13, 20, p(context, 13, 20));
        List listP32 = a.p(languageItem42, o(context, 13, 20), listP31, languageItem42, otherSubLanguageExpandableItem11);
        LanguageItem languageItem43 = new LanguageItem(31, 3, p(context, 31, 3));
        List listP33 = a.p(languageItem43, o(context, 31, 3), listP32, languageItem43, otherSubLanguageExpandableItem11);
        LanguageItem languageItem44 = new LanguageItem(38, 3, p(context, 38, 3));
        languageItem44.setDescription(o(context, 38, 3));
        listP33.add(languageItem44);
        String str2 = this.f25725t;
        if (str2 == null) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        } else {
            int iHashCode = str2.hashCode();
            if (iHashCode != 3201) {
                if (iHashCode != 3246) {
                    if (iHashCode != 3276) {
                        if (iHashCode != 3365) {
                            if (iHashCode != 3371) {
                                if (iHashCode != 3383) {
                                    if (iHashCode != 3588) {
                                        if (iHashCode != 3651) {
                                            if (iHashCode != 3763) {
                                                if (iHashCode == 3886 && str2.equals("zh")) {
                                                    arrayList = new ArrayList();
                                                    otherSubLanguageExpandableItem7.setCanExpand(Boolean.FALSE);
                                                    arrayList.add(otherSubLanguageExpandableItem7);
                                                } else {
                                                    arrayList = new ArrayList();
                                                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                                    arrayList.add(otherSubLanguageExpandableItem);
                                                }
                                            } else if (str2.equals("vi")) {
                                                arrayList = new ArrayList();
                                                otherSubLanguageExpandableItem6.setCanExpand(Boolean.FALSE);
                                                arrayList.add(otherSubLanguageExpandableItem6);
                                            } else {
                                                arrayList = new ArrayList();
                                                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                                arrayList.add(otherSubLanguageExpandableItem);
                                            }
                                        } else if (str2.equals("ru")) {
                                            arrayList = new ArrayList();
                                            otherSubLanguageExpandableItem9.setCanExpand(Boolean.FALSE);
                                            arrayList.add(otherSubLanguageExpandableItem9);
                                        } else {
                                            arrayList = new ArrayList();
                                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                            arrayList.add(otherSubLanguageExpandableItem);
                                        }
                                    } else if (str2.equals("pt")) {
                                        arrayList = new ArrayList();
                                        otherSubLanguageExpandableItem8.setCanExpand(Boolean.FALSE);
                                        arrayList.add(otherSubLanguageExpandableItem8);
                                    } else {
                                        arrayList = new ArrayList();
                                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                        arrayList.add(otherSubLanguageExpandableItem);
                                    }
                                } else if (str2.equals("ja")) {
                                    arrayList = new ArrayList();
                                    otherSubLanguageExpandableItem5.setCanExpand(Boolean.FALSE);
                                    arrayList.add(otherSubLanguageExpandableItem5);
                                } else {
                                    arrayList = new ArrayList();
                                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                    arrayList.add(otherSubLanguageExpandableItem);
                                }
                            } else if (str2.equals("it")) {
                                arrayList = new ArrayList();
                                otherSubLanguageExpandableItem11.setCanExpand(Boolean.FALSE);
                                arrayList.add(otherSubLanguageExpandableItem11);
                            } else {
                                arrayList = new ArrayList();
                                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                arrayList.add(otherSubLanguageExpandableItem);
                            }
                        } else if (str2.equals("in")) {
                            arrayList = new ArrayList();
                            otherSubLanguageExpandableItem10.setCanExpand(Boolean.FALSE);
                            arrayList.add(otherSubLanguageExpandableItem10);
                        } else {
                            arrayList = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList.add(otherSubLanguageExpandableItem);
                        }
                    } else if (str2.equals("fr")) {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem3);
                    } else {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem);
                    }
                } else if (str2.equals("es")) {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem2);
                } else {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem);
                }
            } else if (str2.equals("de")) {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem4.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem4);
            } else {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem);
            }
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x0c24 A[PHI: r12
      0x0c24: PHI (r12v56 java.lang.Object) = (r12v55 java.lang.Object), (r12v57 java.lang.Object) binds: [B:117:0x0c42, B:113:0x0c22] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0f94  */
    /* JADX WARN: Code duplicated, block: B:326:0x12dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x12a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0646  */
    public final void q(int i11, Context context, String locateLanguage) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        ArrayList arrayList;
        String str;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        String str2;
        String str3;
        Object obj12;
        int i12;
        MultiItemEntity multiItemEntity;
        int i13;
        Integer language;
        MultiItemEntity multiItemEntity2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj13;
        Object obj14;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        m.f(context, "context");
        m.f(locateLanguage, "locateLanguage");
        this.f25725t = locateLanguage;
        ArrayList arrayList7 = new ArrayList();
        Object obj15 = "fr";
        String str4 = "tr";
        if (locateLanguage.equals("ja")) {
            obj = "ko";
            obj2 = "pt";
            obj3 = "es";
            obj4 = "in";
            obj5 = "de";
            obj6 = "it";
            arrayList = arrayList7;
            str = "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem";
        } else {
            int[] iArr = r.f4959a;
            obj5 = "de";
            String str5 = this.f25725t;
            LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str5, "deviceLanguage", context, str5, R.string.japanese), 1);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
            List listQ = a.q(otherSubLanguageExpandableItem);
            LanguageItem languageItem = new LanguageItem(1, 3, p(context, 1, 3));
            List listP = a.p(languageItem, o(context, 1, 3), listQ, languageItem, otherSubLanguageExpandableItem);
            LanguageItem languageItem2 = new LanguageItem(12, 3, p(context, 12, 3));
            List listP2 = a.p(languageItem2, o(context, 12, 3), listP, languageItem2, otherSubLanguageExpandableItem);
            LanguageItem languageItem3 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP3 = a.p(languageItem3, o(context, 30, 3), listP2, languageItem3, otherSubLanguageExpandableItem);
            LanguageItem languageItem4 = new LanguageItem(37, 3, p(context, 37, 3));
            List listP4 = a.p(languageItem4, o(context, 37, 3), listP3, languageItem4, otherSubLanguageExpandableItem);
            LanguageItem languageItem5 = new LanguageItem(33, 3, p(context, 33, 3));
            languageItem5.setDescription(o(context, 33, 3));
            listP4.add(languageItem5);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 4));
            List listQ2 = a.q(otherSubLanguageExpandableItem2);
            LanguageItem languageItem6 = new LanguageItem(1, 4, p(context, 1, 4));
            List listP5 = a.p(languageItem6, o(context, 1, 4), listQ2, languageItem6, otherSubLanguageExpandableItem2);
            LanguageItem languageItem7 = new LanguageItem(12, 4, p(context, 12, 4));
            List listP6 = a.p(languageItem7, o(context, 12, 4), listP5, languageItem7, otherSubLanguageExpandableItem2);
            LanguageItem languageItem8 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP7 = a.p(languageItem8, o(context, 30, 3), listP6, languageItem8, otherSubLanguageExpandableItem2);
            LanguageItem languageItem9 = new LanguageItem(37, 4, p(context, 37, 4));
            List listP8 = a.p(languageItem9, o(context, 37, 4), listP7, languageItem9, otherSubLanguageExpandableItem2);
            LanguageItem languageItem10 = new LanguageItem(33, 4, p(context, 33, 4));
            languageItem10.setDescription(o(context, 33, 4));
            listP8.add(languageItem10);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 5));
            List listQ3 = a.q(otherSubLanguageExpandableItem3);
            LanguageItem languageItem11 = new LanguageItem(1, 5, p(context, 1, 5));
            List listP9 = a.p(languageItem11, o(context, 1, 5), listQ3, languageItem11, otherSubLanguageExpandableItem3);
            LanguageItem languageItem12 = new LanguageItem(12, 5, p(context, 12, 5));
            List listP10 = a.p(languageItem12, o(context, 12, 5), listP9, languageItem12, otherSubLanguageExpandableItem3);
            LanguageItem languageItem13 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP11 = a.p(languageItem13, o(context, 30, 3), listP10, languageItem13, otherSubLanguageExpandableItem3);
            LanguageItem languageItem14 = new LanguageItem(37, 5, p(context, 37, 5));
            List listP12 = a.p(languageItem14, o(context, 37, 5), listP11, languageItem14, otherSubLanguageExpandableItem3);
            LanguageItem languageItem15 = new LanguageItem(33, 5, p(context, 33, 5));
            languageItem15.setDescription(o(context, 33, 5));
            listP12.add(languageItem15);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem4 = new OtherSubLanguageExpandableItem(i(context, 6));
            List listQ4 = a.q(otherSubLanguageExpandableItem4);
            LanguageItem languageItem16 = new LanguageItem(1, 6, p(context, 1, 6));
            List listP13 = a.p(languageItem16, o(context, 1, 6), listQ4, languageItem16, otherSubLanguageExpandableItem4);
            LanguageItem languageItem17 = new LanguageItem(12, 6, p(context, 12, 6));
            List listP14 = a.p(languageItem17, o(context, 12, 6), listP13, languageItem17, otherSubLanguageExpandableItem4);
            LanguageItem languageItem18 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP15 = a.p(languageItem18, o(context, 30, 3), listP14, languageItem18, otherSubLanguageExpandableItem4);
            LanguageItem languageItem19 = new LanguageItem(37, 6, p(context, 37, 6));
            List listP16 = a.p(languageItem19, o(context, 37, 6), listP15, languageItem19, otherSubLanguageExpandableItem4);
            LanguageItem languageItem20 = new LanguageItem(33, 6, p(context, 33, 6));
            languageItem20.setDescription(o(context, 33, 6));
            listP16.add(languageItem20);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem5 = new OtherSubLanguageExpandableItem(i(context, 2));
            List listQ5 = a.q(otherSubLanguageExpandableItem5);
            LanguageItem languageItem21 = new LanguageItem(1, 2, p(context, 1, 2));
            List listP17 = a.p(languageItem21, o(context, 1, 2), listQ5, languageItem21, otherSubLanguageExpandableItem5);
            LanguageItem languageItem22 = new LanguageItem(12, 2, p(context, 12, 2));
            List listP18 = a.p(languageItem22, o(context, 12, 2), listP17, languageItem22, otherSubLanguageExpandableItem5);
            LanguageItem languageItem23 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP19 = a.p(languageItem23, o(context, 30, 3), listP18, languageItem23, otherSubLanguageExpandableItem5);
            LanguageItem languageItem24 = new LanguageItem(37, 2, p(context, 37, 2));
            List listP20 = a.p(languageItem24, o(context, 37, 2), listP19, languageItem24, otherSubLanguageExpandableItem5);
            LanguageItem languageItem25 = new LanguageItem(33, 2, p(context, 33, 2));
            languageItem25.setDescription(o(context, 33, 2));
            listP20.add(languageItem25);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem6 = new OtherSubLanguageExpandableItem(i(context, 7));
            List listQ6 = a.q(otherSubLanguageExpandableItem6);
            LanguageItem languageItem26 = new LanguageItem(1, 7, p(context, 1, 7));
            List listP21 = a.p(languageItem26, o(context, 1, 7), listQ6, languageItem26, otherSubLanguageExpandableItem6);
            LanguageItem languageItem27 = new LanguageItem(12, 7, p(context, 12, 7));
            List listP22 = a.p(languageItem27, o(context, 12, 7), listP21, languageItem27, otherSubLanguageExpandableItem6);
            LanguageItem languageItem28 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP23 = a.p(languageItem28, o(context, 30, 3), listP22, languageItem28, otherSubLanguageExpandableItem6);
            LanguageItem languageItem29 = new LanguageItem(37, 7, p(context, 37, 7));
            List listP24 = a.p(languageItem29, o(context, 37, 7), listP23, languageItem29, otherSubLanguageExpandableItem6);
            LanguageItem languageItem30 = new LanguageItem(33, 7, p(context, 33, 7));
            languageItem30.setDescription(o(context, 33, 7));
            listP24.add(languageItem30);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem7 = new OtherSubLanguageExpandableItem(i(context, 9));
            List listQ7 = a.q(otherSubLanguageExpandableItem7);
            LanguageItem languageItem31 = new LanguageItem(1, 9, p(context, 1, 9));
            List listP25 = a.p(languageItem31, o(context, 1, 9), listQ7, languageItem31, otherSubLanguageExpandableItem7);
            LanguageItem languageItem32 = new LanguageItem(12, 9, p(context, 12, 9));
            List listP26 = a.p(languageItem32, o(context, 12, 9), listP25, languageItem32, otherSubLanguageExpandableItem7);
            LanguageItem languageItem33 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP27 = a.p(languageItem33, o(context, 30, 3), listP26, languageItem33, otherSubLanguageExpandableItem7);
            LanguageItem languageItem34 = new LanguageItem(37, 9, p(context, 37, 9));
            List listP28 = a.p(languageItem34, o(context, 37, 9), listP27, languageItem34, otherSubLanguageExpandableItem7);
            LanguageItem languageItem35 = new LanguageItem(33, 3, p(context, 33, 3));
            languageItem35.setDescription(o(context, 33, 3));
            listP28.add(languageItem35);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem8 = new OtherSubLanguageExpandableItem(i(context, 8));
            List listQ8 = a.q(otherSubLanguageExpandableItem8);
            LanguageItem languageItem36 = new LanguageItem(1, 8, p(context, 1, 8));
            List listP29 = a.p(languageItem36, o(context, 1, 8), listQ8, languageItem36, otherSubLanguageExpandableItem8);
            LanguageItem languageItem37 = new LanguageItem(12, 8, p(context, 12, 8));
            List listP30 = a.p(languageItem37, o(context, 12, 8), listP29, languageItem37, otherSubLanguageExpandableItem8);
            LanguageItem languageItem38 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP31 = a.p(languageItem38, o(context, 30, 3), listP30, languageItem38, otherSubLanguageExpandableItem8);
            LanguageItem languageItem39 = new LanguageItem(37, 8, p(context, 37, 8));
            List listP32 = a.p(languageItem39, o(context, 37, 8), listP31, languageItem39, otherSubLanguageExpandableItem8);
            LanguageItem languageItem40 = new LanguageItem(33, 8, p(context, 33, 8));
            languageItem40.setDescription(o(context, 33, 8));
            listP32.add(languageItem40);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem9 = new OtherSubLanguageExpandableItem(i(context, 10));
            List listQ9 = a.q(otherSubLanguageExpandableItem9);
            LanguageItem languageItem41 = new LanguageItem(1, 10, p(context, 1, 10));
            List listP33 = a.p(languageItem41, o(context, 1, 10), listQ9, languageItem41, otherSubLanguageExpandableItem9);
            LanguageItem languageItem42 = new LanguageItem(12, 3, p(context, 12, 3));
            List listP34 = a.p(languageItem42, o(context, 12, 3), listP33, languageItem42, otherSubLanguageExpandableItem9);
            LanguageItem languageItem43 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP35 = a.p(languageItem43, o(context, 30, 3), listP34, languageItem43, otherSubLanguageExpandableItem9);
            LanguageItem languageItem44 = new LanguageItem(37, 3, p(context, 37, 3));
            List listP36 = a.p(languageItem44, o(context, 37, 3), listP35, languageItem44, otherSubLanguageExpandableItem9);
            LanguageItem languageItem45 = new LanguageItem(33, 10, p(context, 33, 10));
            languageItem45.setDescription(o(context, 33, 10));
            listP36.add(languageItem45);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem10 = new OtherSubLanguageExpandableItem(i(context, 18));
            List listQ10 = a.q(otherSubLanguageExpandableItem10);
            LanguageItem languageItem46 = new LanguageItem(1, 18, p(context, 1, 18));
            List listP37 = a.p(languageItem46, o(context, 1, 18), listQ10, languageItem46, otherSubLanguageExpandableItem10);
            LanguageItem languageItem47 = new LanguageItem(12, 3, p(context, 12, 3));
            List listP38 = a.p(languageItem47, o(context, 12, 3), listP37, languageItem47, otherSubLanguageExpandableItem10);
            LanguageItem languageItem48 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP39 = a.p(languageItem48, o(context, 30, 3), listP38, languageItem48, otherSubLanguageExpandableItem10);
            LanguageItem languageItem49 = new LanguageItem(37, 3, p(context, 37, 3));
            List listP40 = a.p(languageItem49, o(context, 37, 3), listP39, languageItem49, otherSubLanguageExpandableItem10);
            LanguageItem languageItem50 = new LanguageItem(33, 3, p(context, 33, 3));
            languageItem50.setDescription(o(context, 33, 3));
            listP40.add(languageItem50);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem11 = new OtherSubLanguageExpandableItem(i(context, 57));
            List listQ11 = a.q(otherSubLanguageExpandableItem11);
            LanguageItem languageItem51 = new LanguageItem(1, 57, p(context, 1, 57));
            List listP41 = a.p(languageItem51, o(context, 1, 57), listQ11, languageItem51, otherSubLanguageExpandableItem11);
            LanguageItem languageItem52 = new LanguageItem(12, 57, p(context, 12, 57));
            List listP42 = a.p(languageItem52, o(context, 12, 57), listP41, languageItem52, otherSubLanguageExpandableItem11);
            LanguageItem languageItem53 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP43 = a.p(languageItem53, o(context, 30, 3), listP42, languageItem53, otherSubLanguageExpandableItem11);
            LanguageItem languageItem54 = new LanguageItem(37, 57, p(context, 37, 57));
            List listP44 = a.p(languageItem54, o(context, 37, 57), listP43, languageItem54, otherSubLanguageExpandableItem11);
            LanguageItem languageItem55 = new LanguageItem(33, 3, p(context, 33, 3));
            languageItem55.setDescription(o(context, 33, 3));
            listP44.add(languageItem55);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem12 = new OtherSubLanguageExpandableItem(i(context, 20));
            List listQ12 = a.q(otherSubLanguageExpandableItem12);
            LanguageItem languageItem56 = new LanguageItem(1, 20, p(context, 1, 20));
            List listP45 = a.p(languageItem56, o(context, 1, 20), listQ12, languageItem56, otherSubLanguageExpandableItem12);
            LanguageItem languageItem57 = new LanguageItem(12, 20, p(context, 12, 20));
            List listP46 = a.p(languageItem57, o(context, 12, 20), listP45, languageItem57, otherSubLanguageExpandableItem12);
            LanguageItem languageItem58 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP47 = a.p(languageItem58, o(context, 30, 3), listP46, languageItem58, otherSubLanguageExpandableItem12);
            LanguageItem languageItem59 = new LanguageItem(37, 20, p(context, 37, 20));
            List listP48 = a.p(languageItem59, o(context, 37, 20), listP47, languageItem59, otherSubLanguageExpandableItem12);
            LanguageItem languageItem60 = new LanguageItem(33, 20, p(context, 33, 20));
            languageItem60.setDescription(o(context, 33, 20));
            listP48.add(languageItem60);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem13 = new OtherSubLanguageExpandableItem(i(context, 21));
            List listQ13 = a.q(otherSubLanguageExpandableItem13);
            LanguageItem languageItem61 = new LanguageItem(1, 21, p(context, 1, 21));
            List listP49 = a.p(languageItem61, o(context, 1, 21), listQ13, languageItem61, otherSubLanguageExpandableItem13);
            LanguageItem languageItem62 = new LanguageItem(12, 21, p(context, 12, 21));
            List listP50 = a.p(languageItem62, o(context, 12, 21), listP49, languageItem62, otherSubLanguageExpandableItem13);
            LanguageItem languageItem63 = new LanguageItem(30, 3, p(context, 30, 3));
            List listP51 = a.p(languageItem63, o(context, 30, 3), listP50, languageItem63, otherSubLanguageExpandableItem13);
            LanguageItem languageItem64 = new LanguageItem(37, 21, p(context, 37, 21));
            List listP52 = a.p(languageItem64, o(context, 37, 21), listP51, languageItem64, otherSubLanguageExpandableItem13);
            LanguageItem languageItem65 = new LanguageItem(33, 3, p(context, 33, 3));
            languageItem65.setDescription(o(context, 33, 3));
            listP52.add(languageItem65);
            String str6 = this.f25725t;
            if (str6 != null) {
                switch (str6.hashCode()) {
                    case 3201:
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        if (str6.equals(obj5)) {
                            arrayList5 = new ArrayList();
                            obj5 = obj5;
                            otherSubLanguageExpandableItem4.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem4);
                        } else {
                            obj5 = obj5;
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem);
                        }
                        break;
                    case 3246:
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        if (str6.equals(obj3)) {
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem2);
                        } else {
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem);
                        }
                        break;
                    case 3276:
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        if (str6.equals(obj15)) {
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem3);
                            obj3 = "es";
                        } else {
                            obj3 = "es";
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem);
                        }
                        break;
                    case 3365:
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        if (str6.equals(obj4)) {
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem10.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem10);
                            obj3 = "es";
                            obj15 = "fr";
                        } else {
                            obj3 = "es";
                            obj15 = "fr";
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem);
                        }
                        break;
                    case 3371:
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        if (str6.equals(obj6)) {
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem12.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem12);
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                        } else {
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem);
                        }
                        break;
                    case 3428:
                        obj = "ko";
                        obj2 = "pt";
                        if (str6.equals(obj)) {
                            ArrayList arrayList8 = new ArrayList();
                            otherSubLanguageExpandableItem5.setCanExpand(Boolean.FALSE);
                            arrayList8.add(otherSubLanguageExpandableItem5);
                            arrayList5 = arrayList8;
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                        } else {
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem);
                        }
                        break;
                    case 3588:
                        obj2 = "pt";
                        if (str6.equals(obj2)) {
                            ArrayList arrayList9 = new ArrayList();
                            otherSubLanguageExpandableItem8.setCanExpand(Boolean.FALSE);
                            arrayList9.add(otherSubLanguageExpandableItem8);
                            arrayList5 = arrayList9;
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            obj = "ko";
                        } else {
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            obj = "ko";
                            arrayList5 = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList5.add(otherSubLanguageExpandableItem);
                        }
                        break;
                    case 3651:
                        if (str6.equals("ru")) {
                            arrayList6 = new ArrayList();
                            otherSubLanguageExpandableItem9.setCanExpand(Boolean.FALSE);
                            arrayList6.add(otherSubLanguageExpandableItem9);
                            arrayList5 = arrayList6;
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            obj = "ko";
                            obj2 = "pt";
                        }
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        arrayList5 = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList5.add(otherSubLanguageExpandableItem);
                        break;
                    case 3700:
                        if (str6.equals("th")) {
                            arrayList6 = new ArrayList();
                            otherSubLanguageExpandableItem11.setCanExpand(Boolean.FALSE);
                            arrayList6.add(otherSubLanguageExpandableItem11);
                            arrayList5 = arrayList6;
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            obj = "ko";
                            obj2 = "pt";
                        }
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        arrayList5 = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList5.add(otherSubLanguageExpandableItem);
                        break;
                    case 3710:
                        if (str6.equals("tr")) {
                            ArrayList arrayList10 = new ArrayList();
                            otherSubLanguageExpandableItem13.setCanExpand(Boolean.FALSE);
                            arrayList10.add(otherSubLanguageExpandableItem13);
                            arrayList5 = arrayList10;
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            obj = "ko";
                            obj2 = "pt";
                        }
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        arrayList5 = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList5.add(otherSubLanguageExpandableItem);
                        break;
                    case 3763:
                        if (str6.equals("vi")) {
                            arrayList6 = new ArrayList();
                            otherSubLanguageExpandableItem6.setCanExpand(Boolean.FALSE);
                            arrayList6.add(otherSubLanguageExpandableItem6);
                            arrayList5 = arrayList6;
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            obj = "ko";
                            obj2 = "pt";
                        }
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        arrayList5 = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList5.add(otherSubLanguageExpandableItem);
                        break;
                    case 3886:
                        if (str6.equals("zh")) {
                            arrayList6 = new ArrayList();
                            otherSubLanguageExpandableItem7.setCanExpand(Boolean.FALSE);
                            arrayList6.add(otherSubLanguageExpandableItem7);
                            arrayList5 = arrayList6;
                            obj3 = "es";
                            obj15 = "fr";
                            obj4 = "in";
                            obj6 = "it";
                            obj = "ko";
                            obj2 = "pt";
                        }
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        arrayList5 = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList5.add(otherSubLanguageExpandableItem);
                        break;
                    default:
                        obj3 = "es";
                        obj15 = "fr";
                        obj4 = "in";
                        obj6 = "it";
                        obj = "ko";
                        obj2 = "pt";
                        arrayList5 = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList5.add(otherSubLanguageExpandableItem);
                        break;
                }
            } else {
                obj3 = "es";
                obj15 = "fr";
                obj4 = "in";
                obj6 = "it";
                obj = "ko";
                obj2 = "pt";
                arrayList5 = new ArrayList();
                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                arrayList5.add(otherSubLanguageExpandableItem);
            }
            Object obj16 = arrayList5.get(0);
            str = "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem";
            m.d(obj16, str);
            languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj16).getSubItems());
            arrayList = arrayList7;
            arrayList.add(languageExpandableItem2);
        }
        String str7 = str;
        if (!locateLanguage.equals(obj)) {
            arrayList.add(n(context));
        }
        if (!locateLanguage.equals("zh")) {
            arrayList.add(b(context));
        }
        String str8 = "pl";
        if (locateLanguage.equals("en")) {
            str4 = "tr";
            obj7 = obj4;
            str8 = "pl";
            obj8 = "ar";
            obj9 = obj5;
            obj10 = obj15;
            obj11 = "ja";
        } else {
            ArrayList arrayList11 = arrayList;
            int[] iArr2 = r.f4959a;
            obj8 = "ar";
            String str9 = this.f25725t;
            Object obj17 = obj3;
            Object obj18 = obj15;
            LanguageExpandableItem2 languageExpandableItem3 = new LanguageExpandableItem2(a.f(str9, "deviceLanguage", context, str9, R.string.english), 3);
            ArrayList arrayList12 = new ArrayList();
            Object obj19 = obj4;
            LanguageItem languageItem66 = new LanguageItem(3, 4, p(context, 3, 4));
            languageItem66.setDescription(o(context, 3, 4));
            arrayList12.add(languageItem66);
            LanguageItem languageItem67 = new LanguageItem(44, 4, p(context, 44, 4));
            languageItem67.setDescription(o(context, 44, 4));
            arrayList12.add(languageItem67);
            ArrayList arrayList13 = new ArrayList();
            LanguageItem languageItem68 = new LanguageItem(3, 5, p(context, 3, 5));
            languageItem68.setDescription(o(context, 3, 5));
            arrayList13.add(languageItem68);
            LanguageItem languageItem69 = new LanguageItem(44, 5, p(context, 44, 5));
            languageItem69.setDescription(o(context, 44, 5));
            arrayList13.add(languageItem69);
            ArrayList arrayList14 = new ArrayList();
            LanguageItem languageItem70 = new LanguageItem(3, 6, p(context, 3, 6));
            languageItem70.setDescription(o(context, 3, 6));
            arrayList14.add(languageItem70);
            LanguageItem languageItem71 = new LanguageItem(44, 6, p(context, 44, 6));
            languageItem71.setDescription(o(context, 44, 6));
            arrayList14.add(languageItem71);
            ArrayList arrayList15 = new ArrayList();
            LanguageItem languageItem72 = new LanguageItem(3, 1, p(context, 3, 1));
            languageItem72.setDescription(o(context, 3, 1));
            arrayList15.add(languageItem72);
            LanguageItem languageItem73 = new LanguageItem(44, 1, p(context, 44, 1));
            languageItem73.setDescription(o(context, 44, 1));
            arrayList15.add(languageItem73);
            ArrayList arrayList16 = new ArrayList();
            LanguageItem languageItem74 = new LanguageItem(3, 2, p(context, 3, 2));
            languageItem74.setDescription(o(context, 3, 2));
            arrayList16.add(languageItem74);
            LanguageItem languageItem75 = new LanguageItem(44, 2, p(context, 44, 2));
            languageItem75.setDescription(o(context, 44, 2));
            arrayList16.add(languageItem75);
            ArrayList arrayList17 = new ArrayList();
            LanguageItem languageItem76 = new LanguageItem(3, 7, p(context, 3, 7));
            languageItem76.setDescription(o(context, 3, 7));
            arrayList17.add(languageItem76);
            LanguageItem languageItem77 = new LanguageItem(44, 7, p(context, 44, 7));
            languageItem77.setDescription(o(context, 44, 7));
            arrayList17.add(languageItem77);
            ArrayList arrayList18 = new ArrayList();
            LanguageItem languageItem78 = new LanguageItem(3, 9, p(context, 3, 9));
            languageItem78.setDescription(o(context, 3, 9));
            arrayList18.add(languageItem78);
            LanguageItem languageItem79 = new LanguageItem(44, 9, p(context, 44, 9));
            languageItem79.setDescription(o(context, 44, 9));
            arrayList18.add(languageItem79);
            ArrayList arrayList19 = new ArrayList();
            LanguageItem languageItem80 = new LanguageItem(3, 8, p(context, 3, 8));
            languageItem80.setDescription(o(context, 3, 8));
            arrayList19.add(languageItem80);
            LanguageItem languageItem81 = new LanguageItem(44, 8, p(context, 44, 8));
            languageItem81.setDescription(o(context, 44, 8));
            arrayList19.add(languageItem81);
            ArrayList arrayList20 = new ArrayList();
            LanguageItem languageItem82 = new LanguageItem(3, 10, p(context, 3, 10));
            languageItem82.setDescription(o(context, 3, 10));
            arrayList20.add(languageItem82);
            LanguageItem languageItem83 = new LanguageItem(44, 10, p(context, 44, 10));
            languageItem83.setDescription(o(context, 44, 10));
            arrayList20.add(languageItem83);
            ArrayList arrayList21 = new ArrayList();
            LanguageItem languageItem84 = new LanguageItem(3, 18, p(context, 3, 18));
            languageItem84.setDescription(o(context, 3, 18));
            arrayList21.add(languageItem84);
            LanguageItem languageItem85 = new LanguageItem(44, 18, p(context, 44, 18));
            languageItem85.setDescription(o(context, 44, 18));
            arrayList21.add(languageItem85);
            ArrayList arrayList22 = new ArrayList();
            LanguageItem languageItem86 = new LanguageItem(3, 19, p(context, 3, 19));
            languageItem86.setDescription(o(context, 3, 19));
            arrayList22.add(languageItem86);
            ArrayList arrayList23 = new ArrayList();
            LanguageItem languageItem87 = new LanguageItem(3, 20, p(context, 3, 20));
            languageItem87.setDescription(o(context, 3, 20));
            arrayList23.add(languageItem87);
            LanguageItem languageItem88 = new LanguageItem(44, 20, p(context, 44, 20));
            languageItem88.setDescription(o(context, 44, 20));
            arrayList23.add(languageItem88);
            ArrayList arrayList24 = new ArrayList();
            LanguageItem languageItem89 = new LanguageItem(3, 21, p(context, 3, 21));
            languageItem89.setDescription(o(context, 3, 21));
            arrayList24.add(languageItem89);
            LanguageItem languageItem90 = new LanguageItem(44, 21, p(context, 44, 21));
            languageItem90.setDescription(o(context, 44, 21));
            arrayList24.add(languageItem90);
            ArrayList arrayList25 = new ArrayList();
            LanguageItem languageItem91 = new LanguageItem(3, 57, p(context, 3, 57));
            languageItem91.setDescription(o(context, 3, 57));
            arrayList25.add(languageItem91);
            ArrayList arrayList26 = new ArrayList();
            LanguageItem languageItem92 = new LanguageItem(3, 51, p(context, 3, 51));
            languageItem92.setDescription(o(context, 3, 51));
            arrayList26.add(languageItem92);
            LanguageItem languageItem93 = new LanguageItem(44, 51, p(context, 44, 51));
            languageItem93.setDescription(o(context, 44, 51));
            arrayList26.add(languageItem93);
            String str10 = this.f25725t;
            if (str10 != null) {
                switch (str10.hashCode()) {
                    case 3121:
                        str8 = "pl";
                        obj11 = "ja";
                        obj9 = obj5;
                        obj8 = obj8;
                        obj3 = obj17;
                        obj10 = obj18;
                        obj7 = obj19;
                        obj13 = !str10.equals(obj8) ? ry.r.f50854a : arrayList26;
                        str4 = "tr";
                        obj14 = obj13;
                        break;
                    case 3201:
                        obj11 = "ja";
                        obj9 = obj5;
                        obj10 = obj18;
                        if (str10.equals(obj9)) {
                            str4 = "tr";
                            obj7 = obj19;
                            str8 = "pl";
                            obj8 = obj8;
                            obj3 = obj17;
                            obj14 = arrayList14;
                        } else {
                            obj7 = obj19;
                            obj3 = obj17;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3246:
                        obj11 = "ja";
                        obj10 = obj18;
                        if (str10.equals(obj17)) {
                            str4 = "tr";
                            obj7 = obj19;
                            str8 = "pl";
                            obj8 = obj8;
                            obj14 = arrayList12;
                            obj3 = obj17;
                            obj9 = obj5;
                        } else {
                            obj7 = obj19;
                            str8 = "pl";
                            obj8 = obj8;
                            obj3 = obj17;
                            obj9 = obj5;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3276:
                        obj11 = "ja";
                        obj10 = obj18;
                        if (str10.equals(obj10)) {
                            str4 = "tr";
                            obj7 = obj19;
                            str8 = "pl";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj14 = arrayList13;
                        } else {
                            obj7 = obj19;
                            obj9 = obj5;
                            obj3 = obj17;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3365:
                        obj11 = "ja";
                        if (str10.equals(obj19)) {
                            str4 = "tr";
                            str8 = "pl";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj10 = obj18;
                            obj14 = arrayList21;
                            obj7 = obj19;
                            obj3 = obj17;
                        } else {
                            str8 = "pl";
                            obj9 = obj5;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj3 = obj17;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3371:
                        obj11 = "ja";
                        if (str10.equals(obj6)) {
                            str4 = "tr";
                            str8 = "pl";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList23;
                        } else {
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3383:
                        obj11 = "ja";
                        if (str10.equals(obj11)) {
                            str4 = "tr";
                            str8 = "pl";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList15;
                        } else {
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3428:
                        if (str10.equals(obj)) {
                            arrayList4 = arrayList16;
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList4;
                        }
                        obj11 = "ja";
                        obj9 = obj5;
                        obj8 = obj8;
                        obj3 = obj17;
                        obj10 = obj18;
                        obj7 = obj19;
                        str4 = "tr";
                        obj14 = obj13;
                        break;
                    case 3580:
                        if (str10.equals("pl")) {
                            str8 = "pl";
                            obj13 = arrayList22;
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                        } else {
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                        }
                        str4 = "tr";
                        obj14 = obj13;
                        break;
                    case 3588:
                        if (str10.equals(obj2)) {
                            arrayList4 = arrayList19;
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList4;
                        }
                        obj11 = "ja";
                        obj9 = obj5;
                        obj8 = obj8;
                        obj3 = obj17;
                        obj10 = obj18;
                        obj7 = obj19;
                        str4 = "tr";
                        obj14 = obj13;
                        break;
                    case 3651:
                        if (str10.equals("ru")) {
                            arrayList4 = arrayList20;
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList4;
                        }
                        obj11 = "ja";
                        obj9 = obj5;
                        obj8 = obj8;
                        obj3 = obj17;
                        obj10 = obj18;
                        obj7 = obj19;
                        str4 = "tr";
                        obj14 = obj13;
                        break;
                    case 3700:
                        if (str10.equals("th")) {
                            str4 = "tr";
                            str8 = "pl";
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList25;
                        } else {
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3710:
                        if (str10.equals("tr")) {
                            str4 = "tr";
                            obj14 = arrayList24;
                            obj11 = "ja";
                            obj9 = obj5;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            str8 = "pl";
                            obj8 = obj8;
                        } else {
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3763:
                        if (str10.equals("vi")) {
                            str4 = "tr";
                            str8 = "pl";
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList17;
                        } else {
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            str4 = "tr";
                            obj14 = obj13;
                        }
                        break;
                    case 3886:
                        if (str10.equals("zh")) {
                            arrayList4 = arrayList18;
                            obj11 = "ja";
                            obj9 = obj5;
                            obj8 = obj8;
                            obj3 = obj17;
                            obj10 = obj18;
                            obj7 = obj19;
                            obj14 = arrayList4;
                        }
                        obj11 = "ja";
                        obj9 = obj5;
                        obj8 = obj8;
                        obj3 = obj17;
                        obj10 = obj18;
                        obj7 = obj19;
                        str4 = "tr";
                        obj14 = obj13;
                        break;
                    default:
                        obj11 = "ja";
                        obj9 = obj5;
                        obj8 = obj8;
                        obj3 = obj17;
                        obj10 = obj18;
                        obj7 = obj19;
                        str4 = "tr";
                        obj14 = obj13;
                        break;
                }
            } else {
                obj11 = "ja";
                obj9 = obj5;
                obj8 = obj8;
                obj3 = obj17;
                obj10 = obj18;
                obj7 = obj19;
                str4 = "tr";
                obj14 = obj13;
            }
            r36.setSubItems(obj14);
            arrayList = arrayList11;
            arrayList.add(languageExpandableItem3);
        }
        if (locateLanguage.equals(obj3)) {
            str2 = str7;
        } else {
            int[] iArr3 = r.f4959a;
            String str11 = this.f25725t;
            LanguageExpandableItem2 languageExpandableItem4 = new LanguageExpandableItem2(a.f(str11, "deviceLanguage", context, str11, R.string.spanish_us), 47);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem14 = new OtherSubLanguageExpandableItem(i(context, 3));
            List listQ14 = a.q(otherSubLanguageExpandableItem14);
            LanguageItem languageItem94 = new LanguageItem(47, 3, p(context, 47, 3));
            List listP53 = a.p(languageItem94, o(context, 47, 3), listQ14, languageItem94, otherSubLanguageExpandableItem14);
            LanguageItem languageItem95 = new LanguageItem(48, 3, p(context, 48, 3));
            List listP54 = a.p(languageItem95, o(context, 48, 3), listP53, languageItem95, otherSubLanguageExpandableItem14);
            LanguageItem languageItem96 = new LanguageItem(58, 3, p(context, 58, 3));
            languageItem96.setDescription(o(context, 58, 3));
            listP54.add(languageItem96);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem15 = new OtherSubLanguageExpandableItem(i(context, 6));
            List listQ15 = a.q(otherSubLanguageExpandableItem15);
            LanguageItem languageItem97 = new LanguageItem(47, 6, p(context, 47, 6));
            List listP55 = a.p(languageItem97, o(context, 47, 6), listQ15, languageItem97, otherSubLanguageExpandableItem15);
            LanguageItem languageItem98 = new LanguageItem(48, 6, p(context, 48, 6));
            List listP56 = a.p(languageItem98, o(context, 48, 6), listP55, languageItem98, otherSubLanguageExpandableItem15);
            LanguageItem languageItem99 = new LanguageItem(58, 3, p(context, 58, 3));
            languageItem99.setDescription(o(context, 58, 3));
            listP56.add(languageItem99);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem16 = new OtherSubLanguageExpandableItem(i(context, 5));
            List listQ16 = a.q(otherSubLanguageExpandableItem16);
            ArrayList arrayList27 = arrayList;
            LanguageItem languageItem100 = new LanguageItem(47, 5, p(context, 47, 5));
            List listP57 = a.p(languageItem100, o(context, 47, 5), listQ16, languageItem100, otherSubLanguageExpandableItem16);
            LanguageItem languageItem101 = new LanguageItem(48, 5, p(context, 48, 5));
            List listP58 = a.p(languageItem101, o(context, 48, 5), listP57, languageItem101, otherSubLanguageExpandableItem16);
            LanguageItem languageItem102 = new LanguageItem(58, 3, p(context, 58, 3));
            languageItem102.setDescription(o(context, 58, 3));
            listP58.add(languageItem102);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem17 = new OtherSubLanguageExpandableItem(i(context, 9));
            List listQ17 = a.q(otherSubLanguageExpandableItem17);
            LanguageItem languageItem103 = new LanguageItem(47, 9, p(context, 47, 9));
            List listP59 = a.p(languageItem103, o(context, 47, 9), listQ17, languageItem103, otherSubLanguageExpandableItem17);
            LanguageItem languageItem104 = new LanguageItem(48, 9, p(context, 48, 9));
            languageItem104.setDescription(o(context, 48, 9));
            listP59.add(languageItem104);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem18 = new OtherSubLanguageExpandableItem(i(context, 1));
            List listQ18 = a.q(otherSubLanguageExpandableItem18);
            LanguageItem languageItem105 = new LanguageItem(47, 1, p(context, 47, 1));
            List listP60 = a.p(languageItem105, o(context, 47, 1), listQ18, languageItem105, otherSubLanguageExpandableItem18);
            LanguageItem languageItem106 = new LanguageItem(48, 3, p(context, 48, 3));
            List listP61 = a.p(languageItem106, o(context, 48, 3), listP60, languageItem106, otherSubLanguageExpandableItem18);
            LanguageItem languageItem107 = new LanguageItem(58, 3, p(context, 58, 3));
            languageItem107.setDescription(o(context, 58, 3));
            listP61.add(languageItem107);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem19 = new OtherSubLanguageExpandableItem(i(context, 2));
            List listQ19 = a.q(otherSubLanguageExpandableItem19);
            LanguageItem languageItem108 = new LanguageItem(47, 2, p(context, 47, 2));
            List listP62 = a.p(languageItem108, o(context, 47, 2), listQ19, languageItem108, otherSubLanguageExpandableItem19);
            LanguageItem languageItem109 = new LanguageItem(48, 3, p(context, 48, 3));
            List listP63 = a.p(languageItem109, o(context, 48, 3), listP62, languageItem109, otherSubLanguageExpandableItem19);
            LanguageItem languageItem110 = new LanguageItem(58, 3, p(context, 58, 3));
            languageItem110.setDescription(o(context, 58, 3));
            listP63.add(languageItem110);
            String str12 = this.f25725t;
            if (str12 == null) {
                arrayList3 = new ArrayList();
                otherSubLanguageExpandableItem14.setCanExpand(Boolean.FALSE);
                arrayList3.add(otherSubLanguageExpandableItem14);
            } else {
                int iHashCode = str12.hashCode();
                if (iHashCode != 3201) {
                    if (iHashCode != 3276) {
                        if (iHashCode != 3383) {
                            if (iHashCode != 3428) {
                                if (iHashCode == 3886 && str12.equals("zh")) {
                                    arrayList3 = new ArrayList();
                                    otherSubLanguageExpandableItem17.setCanExpand(Boolean.FALSE);
                                    arrayList3.add(otherSubLanguageExpandableItem17);
                                } else {
                                    arrayList3 = new ArrayList();
                                    otherSubLanguageExpandableItem14.setCanExpand(Boolean.FALSE);
                                    arrayList3.add(otherSubLanguageExpandableItem14);
                                }
                            } else if (str12.equals(obj)) {
                                arrayList3 = new ArrayList();
                                otherSubLanguageExpandableItem19.setCanExpand(Boolean.FALSE);
                                arrayList3.add(otherSubLanguageExpandableItem19);
                            } else {
                                arrayList3 = new ArrayList();
                                otherSubLanguageExpandableItem14.setCanExpand(Boolean.FALSE);
                                arrayList3.add(otherSubLanguageExpandableItem14);
                            }
                        } else if (str12.equals(obj11)) {
                            arrayList3 = new ArrayList();
                            otherSubLanguageExpandableItem18.setCanExpand(Boolean.FALSE);
                            arrayList3.add(otherSubLanguageExpandableItem18);
                        } else {
                            arrayList3 = new ArrayList();
                            otherSubLanguageExpandableItem14.setCanExpand(Boolean.FALSE);
                            arrayList3.add(otherSubLanguageExpandableItem14);
                        }
                    } else if (str12.equals(obj10)) {
                        arrayList3 = new ArrayList();
                        otherSubLanguageExpandableItem16.setCanExpand(Boolean.FALSE);
                        arrayList3.add(otherSubLanguageExpandableItem16);
                    } else {
                        arrayList3 = new ArrayList();
                        otherSubLanguageExpandableItem14.setCanExpand(Boolean.FALSE);
                        arrayList3.add(otherSubLanguageExpandableItem14);
                    }
                } else if (str12.equals(obj9)) {
                    arrayList3 = new ArrayList();
                    otherSubLanguageExpandableItem15.setCanExpand(Boolean.FALSE);
                    arrayList3.add(otherSubLanguageExpandableItem15);
                } else {
                    arrayList3 = new ArrayList();
                    otherSubLanguageExpandableItem14.setCanExpand(Boolean.FALSE);
                    arrayList3.add(otherSubLanguageExpandableItem14);
                }
            }
            Object obj20 = arrayList3.get(0);
            str2 = str7;
            m.d(obj20, str2);
            languageExpandableItem4.setSubItems(((OtherSubLanguageExpandableItem) obj20).getSubItems());
            arrayList = arrayList27;
            arrayList.add(languageExpandableItem4);
            arrayList.add(d(context));
        }
        if (locateLanguage.equals(obj10)) {
            str3 = r9;
            obj12 = obj8;
        } else {
            int[] iArr4 = r.f4959a;
            String str13 = this.f25725t;
            str3 = r9;
            LanguageExpandableItem2 languageExpandableItem5 = new LanguageExpandableItem2(a.f(str13, str3, context, str13, R.string.french_accelerated), 53);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem20 = new OtherSubLanguageExpandableItem(i(context, 3));
            List listQ20 = a.q(otherSubLanguageExpandableItem20);
            LanguageItem languageItem111 = new LanguageItem(53, 3, p(context, 53, 3));
            List listP64 = a.p(languageItem111, o(context, 53, 3), listQ20, languageItem111, otherSubLanguageExpandableItem20);
            LanguageItem languageItem112 = new LanguageItem(54, 3, p(context, 54, 3));
            List listP65 = a.p(languageItem112, o(context, 54, 3), listP64, languageItem112, otherSubLanguageExpandableItem20);
            LanguageItem languageItem113 = new LanguageItem(42, 3, p(context, 42, 3));
            List listP66 = a.p(languageItem113, o(context, 42, 3), listP65, languageItem113, otherSubLanguageExpandableItem20);
            LanguageItem languageItem114 = new LanguageItem(36, 3, p(context, 36, 3));
            languageItem114.setDescription(o(context, 36, 3));
            listP66.add(languageItem114);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem21 = new OtherSubLanguageExpandableItem(i(context, 6));
            List listQ21 = a.q(otherSubLanguageExpandableItem21);
            LanguageItem languageItem115 = new LanguageItem(53, 6, p(context, 53, 6));
            List listP67 = a.p(languageItem115, o(context, 53, 6), listQ21, languageItem115, otherSubLanguageExpandableItem21);
            LanguageItem languageItem116 = new LanguageItem(54, 6, p(context, 54, 6));
            List listP68 = a.p(languageItem116, o(context, 54, 6), listP67, languageItem116, otherSubLanguageExpandableItem21);
            LanguageItem languageItem117 = new LanguageItem(42, 3, p(context, 42, 3));
            List listP69 = a.p(languageItem117, o(context, 42, 3), listP68, languageItem117, otherSubLanguageExpandableItem21);
            LanguageItem languageItem118 = new LanguageItem(36, 3, p(context, 36, 3));
            languageItem118.setDescription(o(context, 36, 3));
            listP69.add(languageItem118);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem22 = new OtherSubLanguageExpandableItem(i(context, 51));
            List listQ22 = a.q(otherSubLanguageExpandableItem22);
            LanguageItem languageItem119 = new LanguageItem(53, 51, p(context, 53, 51));
            List listP70 = a.p(languageItem119, o(context, 53, 51), listQ22, languageItem119, otherSubLanguageExpandableItem22);
            LanguageItem languageItem120 = new LanguageItem(54, 51, p(context, 54, 51));
            languageItem120.setDescription(o(context, 54, 51));
            listP70.add(languageItem120);
            String str14 = this.f25725t;
            if (m.a(str14, obj9)) {
                arrayList2 = new ArrayList();
                otherSubLanguageExpandableItem21.setCanExpand(Boolean.FALSE);
                arrayList2.add(otherSubLanguageExpandableItem21);
                obj12 = obj8;
            } else {
                obj12 = obj8;
                if (m.a(str14, obj12)) {
                    arrayList2 = new ArrayList();
                    otherSubLanguageExpandableItem22.setCanExpand(Boolean.FALSE);
                    arrayList2.add(otherSubLanguageExpandableItem22);
                } else {
                    arrayList2 = new ArrayList();
                    otherSubLanguageExpandableItem20.setCanExpand(Boolean.FALSE);
                    arrayList2.add(otherSubLanguageExpandableItem20);
                }
            }
            Object obj21 = arrayList2.get(0);
            m.d(obj21, str2);
            languageExpandableItem5.setSubItems(((OtherSubLanguageExpandableItem) obj21).getSubItems());
            arrayList.add(languageExpandableItem5);
            arrayList.add(h(context));
        }
        if (!locateLanguage.equals(obj9)) {
            arrayList.add(c(context));
        }
        if (!locateLanguage.equals("th")) {
            arrayList.add(x(context));
        }
        if (!locateLanguage.equals(obj6)) {
            arrayList.add(m(context));
        }
        if (!locateLanguage.equals("ru")) {
            arrayList.add(w(context));
        }
        if (!locateLanguage.equals(obj12)) {
            arrayList.add(a(context));
        }
        if (!locateLanguage.equals(obj2)) {
            arrayList.add(v(context));
        }
        if (!locateLanguage.equals("vi")) {
            arrayList.add(z(context));
        }
        if (!locateLanguage.equals(str4)) {
            int[] iArr5 = r.f4959a;
            String str15 = this.f25725t;
            LanguageExpandableItem2 languageExpandableItem6 = new LanguageExpandableItem2(a.f(str15, str3, context, str15, R.string.turkish), 21);
            OtherSubLanguageExpandableItem otherSubLanguageExpandableItem23 = new OtherSubLanguageExpandableItem(i(context, 3));
            List listQ23 = a.q(otherSubLanguageExpandableItem23);
            LanguageItem languageItem121 = new LanguageItem(21, 3, p(context, 21, 3));
            List listP71 = a.p(languageItem121, o(context, 21, 3), listQ23, languageItem121, otherSubLanguageExpandableItem23);
            LanguageItem languageItem122 = new LanguageItem(60, 3, p(context, 60, 3));
            languageItem122.setDescription(o(context, 60, 3));
            listP71.add(languageItem122);
            ArrayList arrayList28 = new ArrayList();
            otherSubLanguageExpandableItem23.setCanExpand(Boolean.FALSE);
            arrayList28.add(otherSubLanguageExpandableItem23);
            Object obj22 = arrayList28.get(0);
            m.d(obj22, str2);
            languageExpandableItem6.setSubItems(((OtherSubLanguageExpandableItem) obj22).getSubItems());
            arrayList.add(languageExpandableItem6);
        }
        if (!locateLanguage.equals("hi")) {
            arrayList.add(k(context));
        }
        if (!locateLanguage.equals("gre")) {
            arrayList.add(j(context));
        }
        if (!locateLanguage.equals(obj7)) {
            arrayList.add(l(context));
        }
        arrayList.add(t(context));
        if (!locateLanguage.equals("ukr")) {
            arrayList.add(y(context));
        }
        if (!locateLanguage.equals(str8)) {
            arrayList.add(u(context));
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String keyLanHistory = x.n().keyLanHistory;
        m.e(keyLanHistory, "keyLanHistory");
        List listW0 = q.W0(keyLanHistory, new String[]{";"}, 0, 6);
        ArrayList arrayList29 = new ArrayList();
        for (Object obj23 : listW0) {
            if (!q.K0((String) obj23)) {
                arrayList29.add(obj23);
            }
        }
        int size = arrayList29.size();
        int i14 = 0;
        while (true) {
            Object obj24 = null;
            if (i14 >= size) {
                ArrayList arrayList30 = new ArrayList();
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj25 = arrayList.get(i15);
                    i15++;
                    MultiItemEntity multiItemEntity3 = (MultiItemEntity) obj25;
                    m.d(multiItemEntity3, "null cannot be cast to non-null type com.lingo.lingoskill.object.LanguageExpandableItem2");
                    LanguageExpandableItem2 languageExpandableItem7 = (LanguageExpandableItem2) multiItemEntity3;
                    if (i11 != -1) {
                        Integer language2 = languageExpandableItem7.getLanguage();
                        if (language2 != null && language2.intValue() == i11) {
                            arrayList30.add(obj25);
                        }
                    } else {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (x.n().scLanguage != -1) {
                            i13 = 5;
                            if (x.n().keyLanguage != 5) {
                            }
                            language = languageExpandableItem7.getLanguage();
                            int[] iArr6 = r.f4959a;
                            int iU = bq.m.u(53);
                            if (language != null && language.intValue() == iU) {
                                arrayList30.add(obj25);
                            }
                        } else {
                            i13 = 5;
                        }
                        if (x.n().fluentLanguage != -1 && x.n().keyLanguage == i13) {
                            language = languageExpandableItem7.getLanguage();
                            int[] iArr7 = r.f4959a;
                            int iU2 = bq.m.u(53);
                            if (language != null) {
                                arrayList30.add(obj25);
                            }
                        } else if (x.n().fluentLanguage == -1 || x.n().keyLanguage != 4) {
                            Integer language3 = languageExpandableItem7.getLanguage();
                            int[] iArr8 = r.f4959a;
                            int iU3 = bq.m.u(x.n().keyLanguage);
                            if (language3 != null && language3.intValue() == iU3) {
                                arrayList30.add(obj25);
                            }
                        } else {
                            Integer language4 = languageExpandableItem7.getLanguage();
                            int[] iArr9 = r.f4959a;
                            int iU4 = bq.m.u(47);
                            if (language4 != null && language4.intValue() == iU4) {
                                arrayList30.add(obj25);
                            }
                        }
                    }
                }
                if (arrayList30.isEmpty()) {
                    i12 = 0;
                    multiItemEntity = null;
                } else {
                    i12 = 0;
                    multiItemEntity = (MultiItemEntity) arrayList30.get(0);
                }
                if (multiItemEntity != null) {
                    arrayList.remove(multiItemEntity);
                    arrayList.add(i12, multiItemEntity);
                }
                ArrayList arrayList31 = new ArrayList(arrayList);
                int i16 = this.f25724f + 1;
                this.f25724f = i16;
                n0 n0Var = this.f25720b;
                MutableLiveData mutableLiveData = this.H;
                if (n0Var == null || this.f25721c == null) {
                    mutableLiveData.setValue(arrayList31);
                    return;
                } else {
                    mutableLiveData.setValue(f(arrayList31, false));
                    e0.B(ViewModelKt.getViewModelScope(this), null, null, new t3((Object) this, i16, (Object) arrayList31, (vy.d) (false ? 1 : 0), 4), 3);
                    return;
                }
            }
            Object obj26 = arrayList29.get(i14);
            i14++;
            String str16 = (String) obj26;
            int size3 = arrayList.size();
            int i17 = 0;
            while (i17 < size3) {
                Object obj27 = arrayList.get(i17);
                i17++;
                MultiItemEntity multiItemEntity4 = (MultiItemEntity) obj27;
                m.d(multiItemEntity4, "null cannot be cast to non-null type com.lingo.lingoskill.object.LanguageExpandableItem2");
                Integer language5 = ((LanguageExpandableItem2) multiItemEntity4).getLanguage();
                int i18 = Integer.parseInt(str16);
                if (language5 != null && language5.intValue() == i18) {
                    obj24 = obj27;
                    multiItemEntity2 = (MultiItemEntity) obj24;
                    if (multiItemEntity2 != null) {
                        arrayList.remove(multiItemEntity2);
                        arrayList.add(0, multiItemEntity2);
                    }
                }
            }
            multiItemEntity2 = (MultiItemEntity) obj24;
            if (multiItemEntity2 != null) {
                arrayList.remove(multiItemEntity2);
                arrayList.add(0, multiItemEntity2);
            }
        }
    }

    public final LanguageExpandableItem2 t(Context context) {
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.malay), 69);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(69, 3, p(context, 69, 3));
        List listP = a.p(languageItem, o(context, 69, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(70, 3, p(context, 70, 3));
        languageItem2.setDescription(o(context, 70, 3));
        listP.add(languageItem2);
        ArrayList arrayList = new ArrayList();
        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
        arrayList.add(otherSubLanguageExpandableItem);
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 u(Context context) {
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.polish), 19);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(19, 3, p(context, 19, 3));
        List listP = a.p(languageItem, o(context, 19, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(68, 3, p(context, 68, 3));
        languageItem2.setDescription(o(context, 68, 3));
        listP.add(languageItem2);
        ArrayList arrayList = new ArrayList();
        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
        arrayList.add(otherSubLanguageExpandableItem);
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 v(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.portuguese), 8);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(8, 3, p(context, 8, 3));
        List listP = a.p(languageItem, o(context, 8, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(17, 3, p(context, 17, 3));
        List listP2 = a.p(languageItem2, o(context, 17, 3), listP, languageItem2, otherSubLanguageExpandableItem);
        LanguageItem languageItem3 = new LanguageItem(46, 3, p(context, 46, 3));
        languageItem3.setDescription(o(context, 46, 3));
        listP2.add(languageItem3);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(8, 9, p(context, 8, 9));
        List listP3 = a.p(languageItem4, o(context, 8, 9), listQ2, languageItem4, otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(17, 9, p(context, 17, 9));
        List listP4 = a.p(languageItem5, o(context, 17, 9), listP3, languageItem5, otherSubLanguageExpandableItem2);
        LanguageItem languageItem6 = new LanguageItem(46, 9, p(context, 46, 9));
        languageItem6.setDescription(o(context, 46, 9));
        listP4.add(languageItem6);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 1));
        List listQ3 = a.q(otherSubLanguageExpandableItem3);
        LanguageItem languageItem7 = new LanguageItem(8, 1, p(context, 8, 1));
        List listP5 = a.p(languageItem7, o(context, 8, 1), listQ3, languageItem7, otherSubLanguageExpandableItem3);
        LanguageItem languageItem8 = new LanguageItem(17, 1, p(context, 17, 1));
        List listP6 = a.p(languageItem8, o(context, 17, 1), listP5, languageItem8, otherSubLanguageExpandableItem3);
        LanguageItem languageItem9 = new LanguageItem(46, 1, p(context, 46, 1));
        languageItem9.setDescription(o(context, 46, 1));
        listP6.add(languageItem9);
        String str2 = this.f25725t;
        if (m.a(str2, "zh")) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem2);
        } else if (m.a(str2, "ja")) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem3);
        } else {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0184  */
    public final LanguageExpandableItem2 w(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.russian), 10);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(10, 3, p(context, 10, 3));
        List listP = a.p(languageItem, o(context, 10, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(22, 3, p(context, 22, 3));
        List listP2 = a.p(languageItem2, o(context, 22, 3), listP, languageItem2, otherSubLanguageExpandableItem);
        LanguageItem languageItem3 = new LanguageItem(41, 3, p(context, 41, 3));
        languageItem3.setDescription(o(context, 41, 3));
        listP2.add(languageItem3);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(10, 9, p(context, 10, 9));
        List listP3 = a.p(languageItem4, o(context, 10, 9), listQ2, languageItem4, otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(22, 9, p(context, 22, 9));
        List listP4 = a.p(languageItem5, o(context, 22, 9), listP3, languageItem5, otherSubLanguageExpandableItem2);
        LanguageItem languageItem6 = new LanguageItem(41, 9, p(context, 41, 9));
        languageItem6.setDescription(o(context, 41, 9));
        listP4.add(languageItem6);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 21));
        List listQ3 = a.q(otherSubLanguageExpandableItem3);
        LanguageItem languageItem7 = new LanguageItem(10, 21, p(context, 10, 21));
        List listP5 = a.p(languageItem7, o(context, 10, 21), listQ3, languageItem7, otherSubLanguageExpandableItem3);
        LanguageItem languageItem8 = new LanguageItem(22, 21, p(context, 22, 21));
        List listP6 = a.p(languageItem8, o(context, 22, 21), listP5, languageItem8, otherSubLanguageExpandableItem3);
        LanguageItem languageItem9 = new LanguageItem(41, 21, p(context, 41, 21));
        languageItem9.setDescription(o(context, 41, 21));
        listP6.add(languageItem9);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem4 = new OtherSubLanguageExpandableItem(i(context, 6));
        List listQ4 = a.q(otherSubLanguageExpandableItem4);
        LanguageItem languageItem10 = new LanguageItem(10, 6, p(context, 10, 6));
        List listP7 = a.p(languageItem10, o(context, 10, 6), listQ4, languageItem10, otherSubLanguageExpandableItem4);
        LanguageItem languageItem11 = new LanguageItem(22, 6, p(context, 22, 6));
        List listP8 = a.p(languageItem11, o(context, 22, 6), listP7, languageItem11, otherSubLanguageExpandableItem4);
        LanguageItem languageItem12 = new LanguageItem(41, 3, p(context, 41, 3));
        languageItem12.setDescription(o(context, 41, 3));
        listP8.add(languageItem12);
        String str2 = this.f25725t;
        if (str2 == null) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        } else {
            int iHashCode = str2.hashCode();
            if (iHashCode != 3201) {
                if (iHashCode != 3710) {
                    if (iHashCode == 3886 && str2.equals("zh")) {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem2);
                    } else {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem);
                    }
                } else if (str2.equals("tr")) {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem3);
                } else {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem);
                }
            } else if (str2.equals("de")) {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem4.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem4);
            } else {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem);
            }
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 x(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.thai), 57);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(57, 3, p(context, 57, 3));
        List listP = a.p(languageItem, o(context, 57, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(59, 3, p(context, 59, 3));
        languageItem2.setDescription(o(context, 59, 3));
        listP.add(languageItem2);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem3 = new LanguageItem(57, 9, p(context, 57, 9));
        List listP2 = a.p(languageItem3, o(context, 57, 9), listQ2, languageItem3, otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(59, 9, p(context, 59, 9));
        languageItem4.setDescription(o(context, 59, 9));
        listP2.add(languageItem4);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 1));
        List listQ3 = a.q(otherSubLanguageExpandableItem3);
        LanguageItem languageItem5 = new LanguageItem(57, 1, p(context, 57, 1));
        List listP3 = a.p(languageItem5, o(context, 57, 1), listQ3, languageItem5, otherSubLanguageExpandableItem3);
        LanguageItem languageItem6 = new LanguageItem(59, 1, p(context, 59, 1));
        languageItem6.setDescription(o(context, 59, 1));
        listP3.add(languageItem6);
        String str2 = this.f25725t;
        if (m.a(str2, "ja")) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem3);
        } else if (m.a(str2, "zh")) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem2);
        } else {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 y(Context context) {
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.ukr), 63);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(63, 3, p(context, 63, 3));
        List listP = a.p(languageItem, o(context, 63, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(64, 3, p(context, 64, 3));
        languageItem2.setDescription(o(context, 64, 3));
        listP.add(languageItem2);
        ArrayList arrayList = new ArrayList();
        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
        arrayList.add(otherSubLanguageExpandableItem);
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public final LanguageExpandableItem2 z(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.vietnamese), 7);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(7, 3, p(context, 7, 3));
        List listP = a.p(languageItem, o(context, 7, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(56, 3, p(context, 56, 3));
        languageItem2.setDescription(o(context, 56, 3));
        listP.add(languageItem2);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem3 = new LanguageItem(7, 3, p(context, 7, 3));
        List listP2 = a.p(languageItem3, o(context, 7, 3), listQ2, languageItem3, otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(56, 9, p(context, 56, 9));
        languageItem4.setDescription(o(context, 56, 9));
        listP2.add(languageItem4);
        if (m.a(this.f25725t, "zh")) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem2);
        } else {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }

    public static String r(int i11, Context context, String str) {
        int[] iArr = r.f4959a;
        String string = bq.m.w(context, str).getString(i11);
        m.e(string, txBUGYhC.DmqO);
        return string;
    }

    public static String s(int i11) {
        if (i11 == 51) {
            return "ar";
        }
        if (i11 == 57) {
            return "th";
        }
        if (i11 == 61) {
            return "hi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return xTCJ.BuTtMoMLTVkIF;
        }
        switch (i11) {
            case 1:
                return "ja";
            case 2:
                return "ko";
            case 3:
                return "en";
            case 4:
                return "es";
            case 5:
                return "fr";
            case 6:
                return "de";
            case 7:
                return "vi";
            case 8:
                return "pt";
            case 9:
                return "zh";
            case 10:
                return "ru";
            default:
                switch (i11) {
                    case 18:
                        return "in";
                    case 19:
                        return "pl";
                    case 20:
                        return "it";
                    case 21:
                        return "tr";
                    default:
                        return "en";
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0244  */
    public final LanguageExpandableItem2 d(Context context) {
        ArrayList arrayList;
        int[] iArr = r.f4959a;
        String str = this.f25725t;
        LanguageExpandableItem2 languageExpandableItem2 = new LanguageExpandableItem2(a.f(str, "deviceLanguage", context, str, R.string.spanish), 4);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem = new OtherSubLanguageExpandableItem(i(context, 3));
        List listQ = a.q(otherSubLanguageExpandableItem);
        LanguageItem languageItem = new LanguageItem(4, 3, p(context, 4, 3));
        List listP = a.p(languageItem, o(context, 4, 3), listQ, languageItem, otherSubLanguageExpandableItem);
        LanguageItem languageItem2 = new LanguageItem(14, 3, p(context, 14, 3));
        List listP2 = a.p(languageItem2, o(context, 14, 3), listP, languageItem2, otherSubLanguageExpandableItem);
        LanguageItem languageItem3 = new LanguageItem(39, 3, p(context, 39, 3));
        languageItem3.setDescription(o(context, 39, 3));
        listP2.add(languageItem3);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem2 = new OtherSubLanguageExpandableItem(i(context, 2));
        List listQ2 = a.q(otherSubLanguageExpandableItem2);
        LanguageItem languageItem4 = new LanguageItem(4, 2, p(context, 4, 2));
        List listP3 = a.p(languageItem4, o(context, 4, 2), listQ2, languageItem4, otherSubLanguageExpandableItem2);
        LanguageItem languageItem5 = new LanguageItem(14, 2, p(context, 14, 2));
        List listP4 = a.p(languageItem5, o(context, 14, 2), listP3, languageItem5, otherSubLanguageExpandableItem2);
        LanguageItem languageItem6 = new LanguageItem(39, 2, p(context, 39, 2));
        languageItem6.setDescription(o(context, 39, 2));
        listP4.add(languageItem6);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem3 = new OtherSubLanguageExpandableItem(i(context, 1));
        List listQ3 = a.q(otherSubLanguageExpandableItem3);
        LanguageItem languageItem7 = new LanguageItem(4, 1, p(context, 4, 1));
        List listP5 = a.p(languageItem7, o(context, 4, 1), listQ3, languageItem7, otherSubLanguageExpandableItem3);
        LanguageItem languageItem8 = new LanguageItem(14, 1, p(context, 14, 1));
        List listP6 = a.p(languageItem8, o(context, 14, 1), listP5, languageItem8, otherSubLanguageExpandableItem3);
        LanguageItem languageItem9 = new LanguageItem(39, 1, p(context, 39, 1));
        languageItem9.setDescription(o(context, 39, 1));
        listP6.add(languageItem9);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem4 = new OtherSubLanguageExpandableItem(i(context, 9));
        List listQ4 = a.q(otherSubLanguageExpandableItem4);
        LanguageItem languageItem10 = new LanguageItem(4, 9, p(context, 4, 9));
        List listP7 = a.p(languageItem10, o(context, 4, 9), listQ4, languageItem10, otherSubLanguageExpandableItem4);
        LanguageItem languageItem11 = new LanguageItem(14, 9, p(context, 14, 9));
        List listP8 = a.p(languageItem11, o(context, 14, 9), listP7, languageItem11, otherSubLanguageExpandableItem4);
        LanguageItem languageItem12 = new LanguageItem(39, 9, p(context, 39, 9));
        languageItem12.setDescription(o(context, 39, 9));
        listP8.add(languageItem12);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem5 = new OtherSubLanguageExpandableItem(i(context, 8));
        List listQ5 = a.q(otherSubLanguageExpandableItem5);
        LanguageItem languageItem13 = new LanguageItem(4, 8, p(context, 4, 8));
        List listP9 = a.p(languageItem13, o(context, 4, 8), listQ5, languageItem13, otherSubLanguageExpandableItem5);
        LanguageItem languageItem14 = new LanguageItem(14, 8, p(context, 14, 8));
        List listP10 = a.p(languageItem14, o(context, 14, 8), listP9, languageItem14, otherSubLanguageExpandableItem5);
        LanguageItem languageItem15 = new LanguageItem(39, 3, p(context, 39, 3));
        languageItem15.setDescription(o(context, 39, 3));
        listP10.add(languageItem15);
        OtherSubLanguageExpandableItem otherSubLanguageExpandableItem6 = new OtherSubLanguageExpandableItem(i(context, 57));
        List listQ6 = a.q(otherSubLanguageExpandableItem6);
        LanguageItem languageItem16 = new LanguageItem(4, 57, p(context, 4, 57));
        List listP11 = a.p(languageItem16, o(context, 4, 57), listQ6, languageItem16, otherSubLanguageExpandableItem6);
        LanguageItem languageItem17 = new LanguageItem(14, 57, p(context, 14, 57));
        List listP12 = a.p(languageItem17, o(context, 14, 57), listP11, languageItem17, otherSubLanguageExpandableItem6);
        LanguageItem languageItem18 = new LanguageItem(39, 57, p(context, 39, 57));
        languageItem18.setDescription(o(context, 39, 57));
        listP12.add(languageItem18);
        String str2 = this.f25725t;
        if (str2 == null) {
            arrayList = new ArrayList();
            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
            arrayList.add(otherSubLanguageExpandableItem);
        } else {
            int iHashCode = str2.hashCode();
            if (iHashCode != 3383) {
                if (iHashCode != 3428) {
                    if (iHashCode != 3588) {
                        if (iHashCode != 3700) {
                            if (iHashCode == 3886 && str2.equals("zh")) {
                                arrayList = new ArrayList();
                                otherSubLanguageExpandableItem4.setCanExpand(Boolean.FALSE);
                                arrayList.add(otherSubLanguageExpandableItem4);
                            } else {
                                arrayList = new ArrayList();
                                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                                arrayList.add(otherSubLanguageExpandableItem);
                            }
                        } else if (str2.equals(DytezVyM.SmjvxVAj)) {
                            arrayList = new ArrayList();
                            otherSubLanguageExpandableItem6.setCanExpand(Boolean.FALSE);
                            arrayList.add(otherSubLanguageExpandableItem6);
                        } else {
                            arrayList = new ArrayList();
                            otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                            arrayList.add(otherSubLanguageExpandableItem);
                        }
                    } else if (str2.equals("pt")) {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem5.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem5);
                    } else {
                        arrayList = new ArrayList();
                        otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                        arrayList.add(otherSubLanguageExpandableItem);
                    }
                } else if (str2.equals("ko")) {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem2.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem2);
                } else {
                    arrayList = new ArrayList();
                    otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                    arrayList.add(otherSubLanguageExpandableItem);
                }
            } else if (str2.equals("ja")) {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem3.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem3);
            } else {
                arrayList = new ArrayList();
                otherSubLanguageExpandableItem.setCanExpand(Boolean.FALSE);
                arrayList.add(otherSubLanguageExpandableItem);
            }
        }
        Object obj = arrayList.get(0);
        m.d(obj, "null cannot be cast to non-null type com.lingo.lingoskill.object.OtherSubLanguageExpandableItem");
        languageExpandableItem2.setSubItems(((OtherSubLanguageExpandableItem) obj).getSubItems());
        return languageExpandableItem2;
    }
}
