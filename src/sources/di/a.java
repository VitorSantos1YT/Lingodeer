package di;

import android.content.Context;
import b7.e0;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ARChar;
import com.lingodeer.R;
import dn.d;
import ff.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import ry.r;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23428a;

    public /* synthetic */ a(int i11) {
        this.f23428a = i11;
    }

    @Override // dn.d
    public final int a() {
        switch (this.f23428a) {
            case 0:
                return 11;
            case 1:
                return 12;
            case 2:
                return 9;
            case 3:
                return 11;
            default:
                return 11;
        }
    }

    @Override // dn.d
    public final Object c(int i11) {
        List listK;
        Collection collectionT;
        switch (this.f23428a) {
            case 0:
                Matcher matcherW = p.w(0, "\t", "compile(...)", "ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ");
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, "ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ", iC, arrayList);
                    } while (matcherW.find());
                    arrayList.add("ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ".subSequence(iC, 1034).toString());
                    listK = arrayList;
                } else {
                    listK = o.K("ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ");
                }
                if (listK.isEmpty()) {
                    collectionT = r.f50854a;
                } else {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            collectionT = r.f50854a;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            collectionT = e0.t(listIterator, 1, listK);
                        }
                    }
                }
                String str = ((String[]) collectionT.toArray(new String[0]))[i11];
                if (wh.a.f55170d == null) {
                    synchronized (wh.a.class) {
                        if (wh.a.f55170d == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            wh.a.f55170d = new wh.a(lingoSkillApplication);
                        }
                        break;
                    }
                }
                m.c(wh.a.f55170d);
                ARChar aRCharA = wh.a.a(str);
                if (aRCharA != null) {
                    return aRCharA;
                }
                ARChar aRChar = new ARChar();
                aRChar.setCharacter(str);
                return aRChar;
            case 1:
                return ((String[]) q.W0("ALL\ta\tă\tâ\te\tê\ti\to\tô\tơ\tu\tư\ti\tai\t  \t  \t  \t  \t  \toi\tôi\tơi\tui\tưi\to\tao\t  \t  \teo\t  \t  \too\t  \t  \t  \t  \tu\tau\t  \tâu\t  \têu\tiu\t  \t  \t  \t  \tưu\ty\tay\t  \tây\t  \t  \t  \t  \t  \t  \tuy\t  \tc\tac\tăc\tâc\tec\têc\t  \toc\tôc\tơc\tuc\tưc\tm\tam\tăm\tâm\tem\têm\tim\tom\tôm\tơm\tum\tưm\tn\tan\tăn\tân\ten\tên\tin\ton\tôn\tơn\tun\tưn\tp\tap\tăp\tâp\tep\têp\tip\top\tôp\tơp\tup\t  \tt\tat\tăt\tât\tet\têt\tit\tot\tôt\tơt\tut\tưt\tng\tang\tăng\tâng\teng\t  \t  \tong\tông\t  \tung\tưng\tnh\tanh\t  \t  \tenh\tênh\tinh\t  \t  \t  \t  \t  \tch\tach\t  \t  \t  \têch\t  \t  \t  \t  \t  \t  ", new String[]{"\t"}, 0, 6).toArray(new String[0]))[i11];
            case 2:
                return ((String[]) q.W0("ALL\tiê\tyê\tuy\tuô\tươ\toa\toă\tuâ\tc\tiêc\t  \t  \tuôc\tươc\toac\toăc\t  \tm\tiêm\tyêm\t  \tuôm\tươm\toam\toăm\t  \tn\tiên\tyên\tuyn\tuôn\tươn\toan\toăn\tuân\tp\tiêp\t  \tuyp\tuôp\tươp\toap\toăp\t  \tt  \tiêt  \t  \tuyt  \tuôt  \tươt  \toat  \toăt  \tuât  \tch\t  \t  \tuych\t  \t  \toach\t  \t  \tnh\t  \t  \tuynh\t  \t  \toanh\t  \t  \tng\tiêng\t  \t  \tuông\tương\toang\toăng\t  ", new String[]{"\t"}, 0, 6).toArray(new String[0]))[i11];
            case 3:
                return ((String[]) q.W0("ALL\tiêu\tyêu\toai\tuây\tuôi\tươi\tươu\tuya\tuyên\tuyêt\tb\tbiêu\t  \t  \t  \tbuôi\tbươi\tbươu\t  \t  \t  \tc\t  \t  \t  \t  \tcuôi\tcươi\t  \t  \t  \t  \td\tdiêu\t  \t  \t  \tduôi\tdươi\t  \t  \tduyên\tduyêt\tđ\tđiêu\t  \tđoai\t  \tđuôi\tđươi\t  \t  \t  \t  \th\thiêu\t  \thoai\t  \t  \t  \thươu\t  \thuyên\thuyêt\tk\tkiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tl\tliêu\t  \tloai\t  \t  \tlươi\t  \t  \t  \t  \tm\tmiêu\t  \t  \t  \tmuôi\tmươi\t  \t  \t  \t  \tn\tniêu\t  \t  \t  \tnuôi\tnươi\t  \t  \t  \t  \tr\triêu\t  \t  \t  \truôi\trươi\t  \t  \t  \t  \tq(u)\t  \t  \t  \tquây\t  \t  \t  \t  \tquyên\tquyêt\ts\tsiêu\t  \tsoai\t  \tsuôi\t  \t  \t  \tsuyên\tsuyêt\tt\ttiêu\t  \ttoai\t  \ttuôi\ttươi\t  \t  \ttuyên\ttuyêt\tx\txiêu\t  \txiao\txoay\txuôi\t  \t  \t  \txuyên\txuyêt\tph\tphiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tth\tthiêu\t  \tthoai\t  \t  \t  \t  \t  \tthuyên\tthuyêt\ttr\ttriêu\t  \t  \t  \ttruôi\t  \t  \t  \ttruyên\t  \tch\tchiêu\t  \tchoai\t  \tchuôi\t  \t  \t  \tchuyên\t  \tnh\tnhiêu\t  \tnhoai\t  \tnhuôi\t  \t  \t  \tnhuyên\t  \tng\t  \t  \tngoai\t  \tnguôi\tngươi\t  \t  \tnguyên\tnguyêt\tngh\tnghiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tgh\tghiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tgi\tgiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tkh\tkhiêu\t  \tkhoai\tkhuây\tkhuôi\t  \tkhươu\tkhuya\tkhuyên\tkhuyêt", new String[]{"\t"}, 0, 6).toArray(new String[0]))[i11];
            default:
                return ((String[]) q.W0("ALL\ta\te\tê\ti\ty\to\tô\tơ\tu\tư\tb\tba\tbe\tbê\tbi\tby\tbo\tbô\tbơ\tbu\tbư\tc\tca\t  \t  \t  \t  \tco\tcô\tcơ\tcu\tcư\td\tda\tde\tdê\tdi\t  \tdo\tdô\tdơ\tdu\tdư\tđ\tđa\tđe\tđê\tđi\t  \tđo\tđô\tđơ\tđu\tđư\tg\tga\t  \t  \t  \t  \tgo\tgô\tgơ\tgu\tgư\th\tha\the\thê\thi\thy\tho\thô\thơ\thu\thư\tk\t  \tke\tkê\tki\tky\t  \t  \t  \t  \t  \tl\tla\tle\tlê\tli\tly\tlo\tlô\tlơ\tlu\tlư\tm\tma\tme\tmê\tmi\tmy\tmo\tmô\tmơ\tmu\tmư\tn\tna\tne\tnê\tni\tny\tno\tnô\tnơ\tnu\tnư\tp\tpa\tpe\tpê\tpi\t  \tpo\tpô\tpơ\tpu\tpư\tr\tra\tre\trê\tri\try\tro\trô\trơ\tru\trư\tq(u)\tqua\tque\tquê\tqui\tquy\t  \t  \tquơ\t  \t  \ts\tsa\tse\tsê\tsi\tsy\tso\tsô\tsơ\tsu\tsư\tt\tta\tte\ttê\tti\tty\tto\ttô\ttơ\ttu\ttư\tv\tva\tve\tvê\tvi\tvy\tvo\tvô\tvơ\tvu\tvư\tx\txa\txe\txê\txi\txy\txo\txô\txơ\txu\txư\tph\tpha\tphe\tphê\tphi\t  \tpho\tphô\tphơ\tphu\tphư\tth\ttha\tthe\tthê\tthi\t  \ttho\tthô\tthơ\tthu\tthư\ttr\ttra\ttre\ttrê\ttri\t  \ttro\ttrô\ttrơ\ttru\ttrư\tch\tcha\tche\tchê\tchi\t  \tcho\tchô\tchơ\tchu\tchư\tnh\tnha\tnhe\tnhê\tnhi\t  \tnho\tnhô\tnhơ\tnhu\tnhư\tng\tnga\t  \t  \t  \t  \tngo\tngô\tngơ\tngu\tngư\tngh\t  \tnghe\tnghê\tnghi\t  \t  \t  \t  \t  \t  \tgh\t  \tghe\tghê\tghi\t  \t  \t  \t  \t  \t  \tgi\tgia\tgie\tgiê\tgi\t  \tgio\tgiô\tgiơ\tgiu\tgiư\tkh\tkha\tkhe\tkhê\tkhi\t  \tkho\tkhô\tkhơ\tkhu\tkhư", new String[]{"\t"}, 0, 6).toArray(new String[0]))[i11];
        }
    }

    @Override // dn.d
    public final Object d(int i11, int i12) {
        List listK;
        Collection collectionT;
        switch (this.f23428a) {
            case 0:
                int i13 = (i11 * 11) + i12;
                Matcher matcherW = p.w(0, "\t", "compile(...)", "ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ");
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, "ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ", iC, arrayList);
                    } while (matcherW.find());
                    arrayList.add("ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ".subSequence(iC, 1034).toString());
                    listK = arrayList;
                } else {
                    listK = o.K("ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ");
                }
                if (listK.isEmpty()) {
                    collectionT = r.f50854a;
                } else {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            collectionT = r.f50854a;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            collectionT = e0.t(listIterator, 1, listK);
                        }
                    }
                }
                String str = ((String[]) collectionT.toArray(new String[0]))[i13];
                if (wh.a.f55170d == null) {
                    synchronized (wh.a.class) {
                        if (wh.a.f55170d == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            wh.a.f55170d = new wh.a(lingoSkillApplication);
                        }
                        break;
                    }
                }
                m.c(wh.a.f55170d);
                ARChar aRCharA = wh.a.a(str);
                if (aRCharA != null) {
                    return aRCharA;
                }
                ARChar aRChar = new ARChar();
                aRChar.setCharacter(str);
                return aRChar;
            case 1:
                String str2 = ((String[]) q.W0("ALL\ta\tă\tâ\te\tê\ti\to\tô\tơ\tu\tư\ti\tai\t  \t  \t  \t  \t  \toi\tôi\tơi\tui\tưi\to\tao\t  \t  \teo\t  \t  \too\t  \t  \t  \t  \tu\tau\t  \tâu\t  \têu\tiu\t  \t  \t  \t  \tưu\ty\tay\t  \tây\t  \t  \t  \t  \t  \t  \tuy\t  \tc\tac\tăc\tâc\tec\têc\t  \toc\tôc\tơc\tuc\tưc\tm\tam\tăm\tâm\tem\têm\tim\tom\tôm\tơm\tum\tưm\tn\tan\tăn\tân\ten\tên\tin\ton\tôn\tơn\tun\tưn\tp\tap\tăp\tâp\tep\têp\tip\top\tôp\tơp\tup\t  \tt\tat\tăt\tât\tet\têt\tit\tot\tôt\tơt\tut\tưt\tng\tang\tăng\tâng\teng\t  \t  \tong\tông\t  \tung\tưng\tnh\tanh\t  \t  \tenh\tênh\tinh\t  \t  \t  \t  \t  \tch\tach\t  \t  \t  \têch\t  \t  \t  \t  \t  \t  ", new String[]{"\t"}, 0, 6).toArray(new String[0]))[(i11 * 12) + i12];
                pq.a aVar = new pq.a();
                aVar.f46983a = str2;
                return aVar;
            case 2:
                String str3 = ((String[]) q.W0("ALL\tiê\tyê\tuy\tuô\tươ\toa\toă\tuâ\tc\tiêc\t  \t  \tuôc\tươc\toac\toăc\t  \tm\tiêm\tyêm\t  \tuôm\tươm\toam\toăm\t  \tn\tiên\tyên\tuyn\tuôn\tươn\toan\toăn\tuân\tp\tiêp\t  \tuyp\tuôp\tươp\toap\toăp\t  \tt  \tiêt  \t  \tuyt  \tuôt  \tươt  \toat  \toăt  \tuât  \tch\t  \t  \tuych\t  \t  \toach\t  \t  \tnh\t  \t  \tuynh\t  \t  \toanh\t  \t  \tng\tiêng\t  \t  \tuông\tương\toang\toăng\t  ", new String[]{"\t"}, 0, 6).toArray(new String[0]))[(i11 * 9) + i12];
                pq.a aVar2 = new pq.a();
                aVar2.f46983a = str3;
                return aVar2;
            case 3:
                String str4 = ((String[]) q.W0("ALL\tiêu\tyêu\toai\tuây\tuôi\tươi\tươu\tuya\tuyên\tuyêt\tb\tbiêu\t  \t  \t  \tbuôi\tbươi\tbươu\t  \t  \t  \tc\t  \t  \t  \t  \tcuôi\tcươi\t  \t  \t  \t  \td\tdiêu\t  \t  \t  \tduôi\tdươi\t  \t  \tduyên\tduyêt\tđ\tđiêu\t  \tđoai\t  \tđuôi\tđươi\t  \t  \t  \t  \th\thiêu\t  \thoai\t  \t  \t  \thươu\t  \thuyên\thuyêt\tk\tkiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tl\tliêu\t  \tloai\t  \t  \tlươi\t  \t  \t  \t  \tm\tmiêu\t  \t  \t  \tmuôi\tmươi\t  \t  \t  \t  \tn\tniêu\t  \t  \t  \tnuôi\tnươi\t  \t  \t  \t  \tr\triêu\t  \t  \t  \truôi\trươi\t  \t  \t  \t  \tq(u)\t  \t  \t  \tquây\t  \t  \t  \t  \tquyên\tquyêt\ts\tsiêu\t  \tsoai\t  \tsuôi\t  \t  \t  \tsuyên\tsuyêt\tt\ttiêu\t  \ttoai\t  \ttuôi\ttươi\t  \t  \ttuyên\ttuyêt\tx\txiêu\t  \txiao\txoay\txuôi\t  \t  \t  \txuyên\txuyêt\tph\tphiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tth\tthiêu\t  \tthoai\t  \t  \t  \t  \t  \tthuyên\tthuyêt\ttr\ttriêu\t  \t  \t  \ttruôi\t  \t  \t  \ttruyên\t  \tch\tchiêu\t  \tchoai\t  \tchuôi\t  \t  \t  \tchuyên\t  \tnh\tnhiêu\t  \tnhoai\t  \tnhuôi\t  \t  \t  \tnhuyên\t  \tng\t  \t  \tngoai\t  \tnguôi\tngươi\t  \t  \tnguyên\tnguyêt\tngh\tnghiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tgh\tghiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tgi\tgiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tkh\tkhiêu\t  \tkhoai\tkhuây\tkhuôi\t  \tkhươu\tkhuya\tkhuyên\tkhuyêt", new String[]{"\t"}, 0, 6).toArray(new String[0]))[(i11 * 11) + i12];
                pq.a aVar3 = new pq.a();
                aVar3.f46983a = str4;
                return aVar3;
            default:
                String str5 = ((String[]) q.W0("ALL\ta\te\tê\ti\ty\to\tô\tơ\tu\tư\tb\tba\tbe\tbê\tbi\tby\tbo\tbô\tbơ\tbu\tbư\tc\tca\t  \t  \t  \t  \tco\tcô\tcơ\tcu\tcư\td\tda\tde\tdê\tdi\t  \tdo\tdô\tdơ\tdu\tdư\tđ\tđa\tđe\tđê\tđi\t  \tđo\tđô\tđơ\tđu\tđư\tg\tga\t  \t  \t  \t  \tgo\tgô\tgơ\tgu\tgư\th\tha\the\thê\thi\thy\tho\thô\thơ\thu\thư\tk\t  \tke\tkê\tki\tky\t  \t  \t  \t  \t  \tl\tla\tle\tlê\tli\tly\tlo\tlô\tlơ\tlu\tlư\tm\tma\tme\tmê\tmi\tmy\tmo\tmô\tmơ\tmu\tmư\tn\tna\tne\tnê\tni\tny\tno\tnô\tnơ\tnu\tnư\tp\tpa\tpe\tpê\tpi\t  \tpo\tpô\tpơ\tpu\tpư\tr\tra\tre\trê\tri\try\tro\trô\trơ\tru\trư\tq(u)\tqua\tque\tquê\tqui\tquy\t  \t  \tquơ\t  \t  \ts\tsa\tse\tsê\tsi\tsy\tso\tsô\tsơ\tsu\tsư\tt\tta\tte\ttê\tti\tty\tto\ttô\ttơ\ttu\ttư\tv\tva\tve\tvê\tvi\tvy\tvo\tvô\tvơ\tvu\tvư\tx\txa\txe\txê\txi\txy\txo\txô\txơ\txu\txư\tph\tpha\tphe\tphê\tphi\t  \tpho\tphô\tphơ\tphu\tphư\tth\ttha\tthe\tthê\tthi\t  \ttho\tthô\tthơ\tthu\tthư\ttr\ttra\ttre\ttrê\ttri\t  \ttro\ttrô\ttrơ\ttru\ttrư\tch\tcha\tche\tchê\tchi\t  \tcho\tchô\tchơ\tchu\tchư\tnh\tnha\tnhe\tnhê\tnhi\t  \tnho\tnhô\tnhơ\tnhu\tnhư\tng\tnga\t  \t  \t  \t  \tngo\tngô\tngơ\tngu\tngư\tngh\t  \tnghe\tnghê\tnghi\t  \t  \t  \t  \t  \t  \tgh\t  \tghe\tghê\tghi\t  \t  \t  \t  \t  \t  \tgi\tgia\tgie\tgiê\tgi\t  \tgio\tgiô\tgiơ\tgiu\tgiư\tkh\tkha\tkhe\tkhê\tkhi\t  \tkho\tkhô\tkhơ\tkhu\tkhư", new String[]{"\t"}, 0, 6).toArray(new String[0]))[(i11 * 11) + i12];
                pq.a aVar4 = new pq.a();
                aVar4.f46983a = str5;
                return aVar4;
        }
    }

    @Override // dn.d
    public final int f() {
        switch (this.f23428a) {
            case 0:
                return 29;
            case 1:
                return 13;
            case 2:
                return 9;
            case 3:
                return 25;
            default:
                return 28;
        }
    }

    @Override // dn.d
    public final Object b(int i11) {
        List listK;
        Collection collectionT;
        switch (this.f23428a) {
            case 0:
                Matcher matcherW = p.w(0, "\t", "compile(...)", "ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ");
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, "ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ", iC, arrayList);
                    } while (matcherW.find());
                    arrayList.add("ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ".subSequence(iC, 1034).toString());
                    listK = arrayList;
                } else {
                    listK = o.K("ALL\tْ\tَ\tِ\tُ\tـَا\tـِي\tـُو\tً\tٍ\tٌ\tا\tأْ\tأَ\tإِ\tأُ\tآ\tئِي\tأُو\tأً\tإٍ\tأٌ\tب\tبْ\tبَ\tبِ\tبُ\tبَا\tبِي\tبُو\tبًا\tبٍ\tبٌ\tت\tتْ\tتَ\tتِ\tتُ\tتَا\tتِي\tتُو\tتًا\tتٍ\tتٌ\tث\tثْ\tثَ\tثِ\tثُ\tثَا\tثِي\tثُو\tثًا\tثٍ\tثٌ\tج\tجْ\tجَ\tجِ\tجُ\tجَا\tجِي\tجُو\tجًا\tجٍ\tجٌ\tح\tحْ\tحَ\tحِ\tحُ\tحَا\tحِي\tحُو\tحًا\tحٍ\tحٌ\tخ\tخْ\tخَ\tخِ\tخُ\tخَا\tخِي\tخُو\tخًا\tخٍ\tخٌ\tد\tدْ\tدَ\tدِ\tدُ\tدَا\tدِي\tدُو\tدًا\tدٍ\tدٌ\tذ\tذْ\tذَ\tذِ\tذُ\tذَا\tذِي\tذُو\tذًا\tذٍ\tذٌ\tر\tرْ\tرَ\tرِ\tرُ\tرَا\tرِي\tرُو\tرًا\tرٍ\tرٌ\tز\tزْ\tزَ\tزِ\tزُ\tزَا\tزِي\tزُو\tزًا\tزٍ\tزٌ\tس\tسْ\tسَ\tسِ\tسُ\tسَا\tسِي\tسُو\tسًا\tسٍ\tسٌ\tش\tشْ\tشَ\tشِ\tشُ\tشَا\tشِي\tشُو\tشًا\tشٍ\tشٌ\tص\tصْ\tصَ\tصِ\tصُ\tصَا\tصِي\tصُو\tصًا\tصٍ\tصٌ\tض\tضْ\tضَ\tضِ\tضُ\tضَا\tضِي\tضُو\tضًا\tضٍ\tضٌ\tط\tطْ\tطَ\tطِ\tطُ\tطَا\tطِي\tطُو\tطًا\tطٍ\tطٌ\tظ\tظْ\tظَ\tظِ\tظُ\tظَا\tظِي\tظُو\tظًا\tظٍ\tظٌ\tع\tعْ\tعَ\tعِ\tعُ\tعَا\tعِي\tعُو\tعًا\tعٍ\tعٌ\tغ\tغْ\tغَ\tغِ\tغُ\tغَا\tغِي\tغُو\tغًا\tغٍ\tغٌ\tف\tفْ\tفَ\tفِ\tفُ\tفَا\tفِي\tفُو\tفًا\tفٍ\tفٌ\tق\tقْ\tقَ\tقِ\tقُ\tقَا\tقِي\tقُو\tقًا\tقٍ\tقٌ\tك\tكْ\tكَ\tكِ\tكُ\tكَا\tكِي\tكُو\tكًا\tكٍ\tكٌ\tل\tلْ\tلَ\tلِ\tلُ\tلَا\tلِي\tلُو\tلًا\tلٍ\tلٌ\tم\tمْ\tمَ\tمِ\tمُ\tمَا\tمِي\tمُو\tمًا\tمٍ\tمٌ\tن\tنْ\tنَ\tنِ\tنُ\tنَا\tنِي\tنُو\tنًا\tنٍ\tنٌ\tه\tهْ\tهَ\tهِ\tهُ\tهَا\tهِي\tهُو\tهًا\tهٍ\tهٌ\tو\tوْ\tوَ\tوِ\tوُ\tوَا\tوِي\tوُو\tوًا\tوٍ\tوٌ\tي\tيْ\tيَ\tيِ\tيُ\tيَا\tيِي\tيُو\tيًا\tيٍ\tيٌ");
                }
                if (listK.isEmpty()) {
                    collectionT = r.f50854a;
                } else {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            collectionT = r.f50854a;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            collectionT = e0.t(listIterator, 1, listK);
                        }
                    }
                }
                String str = ((String[]) collectionT.toArray(new String[0]))[i11 * 11];
                if (wh.a.f55170d == null) {
                    synchronized (wh.a.class) {
                        if (wh.a.f55170d == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            wh.a.f55170d = new wh.a(lingoSkillApplication);
                        }
                        break;
                    }
                }
                m.c(wh.a.f55170d);
                ARChar aRCharA = wh.a.a(str);
                if (aRCharA != null) {
                    return aRCharA;
                }
                ARChar aRChar = new ARChar();
                aRChar.setCharacter(str);
                return aRChar;
            case 1:
                return ((String[]) q.W0("ALL\ta\tă\tâ\te\tê\ti\to\tô\tơ\tu\tư\ti\tai\t  \t  \t  \t  \t  \toi\tôi\tơi\tui\tưi\to\tao\t  \t  \teo\t  \t  \too\t  \t  \t  \t  \tu\tau\t  \tâu\t  \têu\tiu\t  \t  \t  \t  \tưu\ty\tay\t  \tây\t  \t  \t  \t  \t  \t  \tuy\t  \tc\tac\tăc\tâc\tec\têc\t  \toc\tôc\tơc\tuc\tưc\tm\tam\tăm\tâm\tem\têm\tim\tom\tôm\tơm\tum\tưm\tn\tan\tăn\tân\ten\tên\tin\ton\tôn\tơn\tun\tưn\tp\tap\tăp\tâp\tep\têp\tip\top\tôp\tơp\tup\t  \tt\tat\tăt\tât\tet\têt\tit\tot\tôt\tơt\tut\tưt\tng\tang\tăng\tâng\teng\t  \t  \tong\tông\t  \tung\tưng\tnh\tanh\t  \t  \tenh\tênh\tinh\t  \t  \t  \t  \t  \tch\tach\t  \t  \t  \têch\t  \t  \t  \t  \t  \t  ", new String[]{ualZoVVCQs.OxGPIAXwjmGkcM}, 0, 6).toArray(new String[0]))[i11 * 12];
            case 2:
                return ((String[]) q.W0("ALL\tiê\tyê\tuy\tuô\tươ\toa\toă\tuâ\tc\tiêc\t  \t  \tuôc\tươc\toac\toăc\t  \tm\tiêm\tyêm\t  \tuôm\tươm\toam\toăm\t  \tn\tiên\tyên\tuyn\tuôn\tươn\toan\toăn\tuân\tp\tiêp\t  \tuyp\tuôp\tươp\toap\toăp\t  \tt  \tiêt  \t  \tuyt  \tuôt  \tươt  \toat  \toăt  \tuât  \tch\t  \t  \tuych\t  \t  \toach\t  \t  \tnh\t  \t  \tuynh\t  \t  \toanh\t  \t  \tng\tiêng\t  \t  \tuông\tương\toang\toăng\t  ", new String[]{"\t"}, 0, 6).toArray(new String[0]))[i11 * 9];
            case 3:
                return ((String[]) q.W0("ALL\tiêu\tyêu\toai\tuây\tuôi\tươi\tươu\tuya\tuyên\tuyêt\tb\tbiêu\t  \t  \t  \tbuôi\tbươi\tbươu\t  \t  \t  \tc\t  \t  \t  \t  \tcuôi\tcươi\t  \t  \t  \t  \td\tdiêu\t  \t  \t  \tduôi\tdươi\t  \t  \tduyên\tduyêt\tđ\tđiêu\t  \tđoai\t  \tđuôi\tđươi\t  \t  \t  \t  \th\thiêu\t  \thoai\t  \t  \t  \thươu\t  \thuyên\thuyêt\tk\tkiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tl\tliêu\t  \tloai\t  \t  \tlươi\t  \t  \t  \t  \tm\tmiêu\t  \t  \t  \tmuôi\tmươi\t  \t  \t  \t  \tn\tniêu\t  \t  \t  \tnuôi\tnươi\t  \t  \t  \t  \tr\triêu\t  \t  \t  \truôi\trươi\t  \t  \t  \t  \tq(u)\t  \t  \t  \tquây\t  \t  \t  \t  \tquyên\tquyêt\ts\tsiêu\t  \tsoai\t  \tsuôi\t  \t  \t  \tsuyên\tsuyêt\tt\ttiêu\t  \ttoai\t  \ttuôi\ttươi\t  \t  \ttuyên\ttuyêt\tx\txiêu\t  \txiao\txoay\txuôi\t  \t  \t  \txuyên\txuyêt\tph\tphiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tth\tthiêu\t  \tthoai\t  \t  \t  \t  \t  \tthuyên\tthuyêt\ttr\ttriêu\t  \t  \t  \ttruôi\t  \t  \t  \ttruyên\t  \tch\tchiêu\t  \tchoai\t  \tchuôi\t  \t  \t  \tchuyên\t  \tnh\tnhiêu\t  \tnhoai\t  \tnhuôi\t  \t  \t  \tnhuyên\t  \tng\t  \t  \tngoai\t  \tnguôi\tngươi\t  \t  \tnguyên\tnguyêt\tngh\tnghiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tgh\tghiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tgi\tgiêu\t  \t  \t  \t  \t  \t  \t  \t  \t  \tkh\tkhiêu\t  \tkhoai\tkhuây\tkhuôi\t  \tkhươu\tkhuya\tkhuyên\tkhuyêt", new String[]{"\t"}, 0, 6).toArray(new String[0]))[i11 * 11];
            default:
                return ((String[]) q.W0("ALL\ta\te\tê\ti\ty\to\tô\tơ\tu\tư\tb\tba\tbe\tbê\tbi\tby\tbo\tbô\tbơ\tbu\tbư\tc\tca\t  \t  \t  \t  \tco\tcô\tcơ\tcu\tcư\td\tda\tde\tdê\tdi\t  \tdo\tdô\tdơ\tdu\tdư\tđ\tđa\tđe\tđê\tđi\t  \tđo\tđô\tđơ\tđu\tđư\tg\tga\t  \t  \t  \t  \tgo\tgô\tgơ\tgu\tgư\th\tha\the\thê\thi\thy\tho\thô\thơ\thu\thư\tk\t  \tke\tkê\tki\tky\t  \t  \t  \t  \t  \tl\tla\tle\tlê\tli\tly\tlo\tlô\tlơ\tlu\tlư\tm\tma\tme\tmê\tmi\tmy\tmo\tmô\tmơ\tmu\tmư\tn\tna\tne\tnê\tni\tny\tno\tnô\tnơ\tnu\tnư\tp\tpa\tpe\tpê\tpi\t  \tpo\tpô\tpơ\tpu\tpư\tr\tra\tre\trê\tri\try\tro\trô\trơ\tru\trư\tq(u)\tqua\tque\tquê\tqui\tquy\t  \t  \tquơ\t  \t  \ts\tsa\tse\tsê\tsi\tsy\tso\tsô\tsơ\tsu\tsư\tt\tta\tte\ttê\tti\tty\tto\ttô\ttơ\ttu\ttư\tv\tva\tve\tvê\tvi\tvy\tvo\tvô\tvơ\tvu\tvư\tx\txa\txe\txê\txi\txy\txo\txô\txơ\txu\txư\tph\tpha\tphe\tphê\tphi\t  \tpho\tphô\tphơ\tphu\tphư\tth\ttha\tthe\tthê\tthi\t  \ttho\tthô\tthơ\tthu\tthư\ttr\ttra\ttre\ttrê\ttri\t  \ttro\ttrô\ttrơ\ttru\ttrư\tch\tcha\tche\tchê\tchi\t  \tcho\tchô\tchơ\tchu\tchư\tnh\tnha\tnhe\tnhê\tnhi\t  \tnho\tnhô\tnhơ\tnhu\tnhư\tng\tnga\t  \t  \t  \t  \tngo\tngô\tngơ\tngu\tngư\tngh\t  \tnghe\tnghê\tnghi\t  \t  \t  \t  \t  \t  \tgh\t  \tghe\tghê\tghi\t  \t  \t  \t  \t  \t  \tgi\tgia\tgie\tgiê\tgi\t  \tgio\tgiô\tgiơ\tgiu\tgiư\tkh\tkha\tkhe\tkhê\tkhi\t  \tkho\tkhô\tkhơ\tkhu\tkhư", new String[]{"\t"}, 0, 6).toArray(new String[0]))[i11 * 11];
        }
    }

    @Override // dn.d
    public final String e(Context context) {
        switch (this.f23428a) {
            case 0:
                m.f(context, "context");
                break;
            case 1:
                m.f(context, "context");
                break;
            case 2:
                m.f(context, "context");
                break;
            case 3:
                m.f(context, tcppUUQxZjFdy.UPr);
                break;
            default:
                m.f(context, "context");
                break;
        }
        return h.y(context, R.string.all);
    }
}
