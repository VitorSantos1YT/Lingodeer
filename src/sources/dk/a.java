package dk;

import b7.e0;
import hh.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import oz.x;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23437a;

    public a() {
        List listK;
        List listT;
        List listK2;
        List listT2;
        HashMap map = new HashMap();
        this.f23437a = map;
        map.clear();
        Pattern patternCompile = Pattern.compile("\n");
        m.e(patternCompile, "compile(...)");
        q.U0(0);
        Matcher matcher = patternCompile.matcher("are not\taren't\nshe had\tshe'd\ncannot\tcan't\nshould not\tshouldn't\ncould not\tcouldn't\nthat is\tthat's\ndid not\tdidn't\nthere is\tthere's\ndo not\tdon't\nthey are\tthey're\ndoes not\tdoesn't\nthey have\tthey've\nhad not\thadn't\nthey will\tthey'll\nhave not\thaven't\nthey would\tthey'd\nhe is\the's\nthey had\tthey'd\nhe has\the's\nwas not\twasn't\nhe will\the'll\nwe are\twe're\nhe would\the'd\nwe have\twe've\nhere is\there's\nwe will\twe'll\nI am\tI'm\nwe would\twe'd\nI have\tI've\nwe had\twe'd\nI will\tI'II\nwere not\tweren't\nI would\tI'd\nwhat is\twhat's\nI had\tI'd\nwhere is\twhere's\nis not\tisn't\nwho is\twho's\nit is\tit's\nwho will\twho'll\nit has\tit's\nwill not\twon't\nit has\tit's\nwould not\twouldn't\nit will\tit'll\nyou are\tyou're\nmust not\tmustn't\nyou have\tyou've\nshe is\tshe's\nyou will\tyou'll\nshe has\tshe's\nyou would\tyou'd\nshe will\tshe'll\nyou had\tyou'd\nshe would\tshe'd");
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, "are not\taren't\nshe had\tshe'd\ncannot\tcan't\nshould not\tshouldn't\ncould not\tcouldn't\nthat is\tthat's\ndid not\tdidn't\nthere is\tthere's\ndo not\tdon't\nthey are\tthey're\ndoes not\tdoesn't\nthey have\tthey've\nhad not\thadn't\nthey will\tthey'll\nhave not\thaven't\nthey would\tthey'd\nhe is\the's\nthey had\tthey'd\nhe has\the's\nwas not\twasn't\nhe will\the'll\nwe are\twe're\nhe would\the'd\nwe have\twe've\nhere is\there's\nwe will\twe'll\nI am\tI'm\nwe would\twe'd\nI have\tI've\nwe had\twe'd\nI will\tI'II\nwere not\tweren't\nI would\tI'd\nwhat is\twhat's\nI had\tI'd\nwhere is\twhere's\nis not\tisn't\nwho is\twho's\nit is\tit's\nwho will\twho'll\nit has\tit's\nwill not\twon't\nit has\tit's\nwould not\twouldn't\nit will\tit'll\nyou are\tyou're\nmust not\tmustn't\nyou have\tyou've\nshe is\tshe's\nyou will\tyou'll\nshe has\tshe's\nyou would\tyou'd\nshe will\tshe'll\nyou had\tyou'd\nshe would\tshe'd", iC, arrayList);
            } while (matcher.find());
            arrayList.add("are not\taren't\nshe had\tshe'd\ncannot\tcan't\nshould not\tshouldn't\ncould not\tcouldn't\nthat is\tthat's\ndid not\tdidn't\nthere is\tthere's\ndo not\tdon't\nthey are\tthey're\ndoes not\tdoesn't\nthey have\tthey've\nhad not\thadn't\nthey will\tthey'll\nhave not\thaven't\nthey would\tthey'd\nhe is\the's\nthey had\tthey'd\nhe has\the's\nwas not\twasn't\nhe will\the'll\nwe are\twe're\nhe would\the'd\nwe have\twe've\nhere is\there's\nwe will\twe'll\nI am\tI'm\nwe would\twe'd\nI have\tI've\nwe had\twe'd\nI will\tI'II\nwere not\tweren't\nI would\tI'd\nwhat is\twhat's\nI had\tI'd\nwhere is\twhere's\nis not\tisn't\nwho is\twho's\nit is\tit's\nwho will\twho'll\nit has\tit's\nwill not\twon't\nit has\tit's\nwould not\twouldn't\nit will\tit'll\nyou are\tyou're\nmust not\tmustn't\nyou have\tyou've\nshe is\tshe's\nyou will\tyou'll\nshe has\tshe's\nyou would\tyou'd\nshe will\tshe'll\nyou had\tyou'd\nshe would\tshe'd".subSequence(iC, 807).toString());
            listK = arrayList;
        } else {
            listK = o.K("are not\taren't\nshe had\tshe'd\ncannot\tcan't\nshould not\tshouldn't\ncould not\tcouldn't\nthat is\tthat's\ndid not\tdidn't\nthere is\tthere's\ndo not\tdon't\nthey are\tthey're\ndoes not\tdoesn't\nthey have\tthey've\nhad not\thadn't\nthey will\tthey'll\nhave not\thaven't\nthey would\tthey'd\nhe is\the's\nthey had\tthey'd\nhe has\the's\nwas not\twasn't\nhe will\the'll\nwe are\twe're\nhe would\the'd\nwe have\twe've\nhere is\there's\nwe will\twe'll\nI am\tI'm\nwe would\twe'd\nI have\tI've\nwe had\twe'd\nI will\tI'II\nwere not\tweren't\nI would\tI'd\nwhat is\twhat's\nI had\tI'd\nwhere is\twhere's\nis not\tisn't\nwho is\twho's\nit is\tit's\nwho will\twho'll\nit has\tit's\nwill not\twon't\nit has\tit's\nwould not\twouldn't\nit will\tit'll\nyou are\tyou're\nmust not\tmustn't\nyou have\tyou've\nshe is\tshe's\nyou will\tyou'll\nshe has\tshe's\nyou would\tyou'd\nshe will\tshe'll\nyou had\tyou'd\nshe would\tshe'd");
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            } else {
                listT = rVar;
                break;
            }
        }
        for (String str : (String[]) listT.toArray(new String[0])) {
            Matcher matcher2 = e0.u(0, "\t", "compile(...)", str, "input").matcher(str);
            if (matcher2.find()) {
                ArrayList arrayList2 = new ArrayList(10);
                int iC2 = 0;
                do {
                    iC2 = p.c(matcher2, str, iC2, arrayList2);
                } while (matcher2.find());
                p.B(iC2, str, arrayList2);
                listK2 = arrayList2;
            } else {
                listK2 = o.K(str.toString());
            }
            if (listK2.isEmpty()) {
                listT2 = rVar;
                break;
                break;
            }
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        listT2 = e0.t(listIterator2, 1, listK2);
                        break;
                    }
                } else {
                    listT2 = rVar;
                    break;
                }
            }
            String[] strArr = (String[]) listT2.toArray(new String[0]);
            HashMap map2 = this.f23437a;
            String strN = p0.n("getDefault(...)", strArr[1], "toLowerCase(...)");
            String str2 = strArr[0];
            Locale locale = Locale.getDefault();
            m.e(locale, "getDefault(...)");
            String lowerCase = str2.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            map2.put(strN, lowerCase);
        }
    }

    public final String a(String str) {
        for (Object obj : this.f23437a.entrySet()) {
            m.e(obj, "next(...)");
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            m.e(key, "<get-key>(...)");
            if (q.v0(str, (CharSequence) key, false)) {
                Object key2 = entry.getKey();
                Object value = entry.getValue();
                Objects.toString(key2);
                Objects.toString(value);
                Object key3 = entry.getKey();
                m.e(key3, "<get-key>(...)");
                Object value2 = entry.getValue();
                m.e(value2, "<get-value>(...)");
                str = x.q0(str, (String) key3, (String) value2);
            }
        }
        return str;
    }
}
