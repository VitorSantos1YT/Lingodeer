package xm;

import com.lingo.lingoskill.object.KOCharZhuyin;
import fz.e;
import java.util.ArrayList;
import java.util.List;
import oz.q;
import ry.m;
import rz.b0;
import vy.d;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f56111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, d dVar, int i11) {
        super(2, dVar);
        this.f56109a = i11;
        this.f56111c = bVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        switch (this.f56109a) {
            case 0:
                return new a(this.f56111c, dVar, 0);
            case 1:
                return new a(this.f56111c, dVar, 1);
            case 2:
                return new a(this.f56111c, dVar, 2);
            default:
                return new a(this.f56111c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        d dVar = (d) obj2;
        switch (this.f56109a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56109a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f56110b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f56110b = 1;
                c cVarA = b.a(this.f56111c, "ALL\tㅑ\tㅕ\tㅛ\tㅠ\tㅒ\tㅖ\tㄱ\t갸\t겨\t교\t규\t걔\t계\tㄴ\t냐\t녀\t뇨\t뉴\t냬\t녜\tㄷ\t댜\t뎌\t됴\t듀\t댸\t뎨\tㄹ\t랴\t려\t료\t류\t럐\t례\tㅁ\t먀\t며\t묘\t뮤\t먜\t몌\tㅂ\t뱌\t벼\t뵤\t뷰\t뱨\t볘\tㅅ\t샤\t셔\t쇼\t슈\t섀\t셰\tㅇ\t야\t여\t요\t유\t얘\t예\tㅈ\t쟈\t져\t죠\t쥬\t쟤\t졔\tㅊ\t챠\t쳐\t쵸\t츄\t챼\t쳬\tㅋ\t캬\t켜\t쿄\t큐\t컈\t켸\tㅌ\t탸\t텨\t툐\t튜\t턔\t톄\tㅍ\t퍄\t펴\t표\t퓨\t퍠\t폐\tㅎ\t햐\t혀\t효\t휴\t햬\t혜\tㄲ\t꺄\t껴\t꾜\t뀨\t꺠\t꼐\tㄸ\t땨\t뗘\t뚀\t뜌\t떄\t뗴\tㅃ\t뺘\t뼈\t뾰\t쀼\t뺴\t뼤\tㅆ\t쌰\t쎠\t쑈\t쓔\t썌\t쎼\tㅉ\t쨔\t쪄\t쬬\t쮸\t쨰\t쪠", 7);
                return cVarA == aVar ? aVar : cVarA;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f56110b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f56110b = 1;
                c cVarA2 = b.a(this.f56111c, "ALL\tㅘ\tㅙ\tㅚ\tㅝ\tㅞ\tㅟ\tㅢ\tㄱ\t과\t괘\t괴\t궈\t궤\t귀\t긔\tㄴ\t놔\t놰\t뇌\t눠\t눼\t뉘\t늬\tㄷ\t돠\t돼\t되\t둬\t뒈\t뒤\t듸\tㄹ\t롸\t뢔\t뢰\t뤄\t뤠\t뤼\t릐\tㅁ\t뫄\t뫠\t뫼\t뭐\t뭬\t뮈\t믜\tㅂ\t봐\t봬\t뵈\t붜\t붸\t뷔\t븨\tㅅ\t솨\t쇄\t쇠\t숴\t쉐\t쉬\t싀\tㅇ\t와\t왜\t외\t워\t웨\t위\t의\tㅈ\t좌\t좨\t죄\t줘\t줴\t쥐\t즤\tㅊ\t촤\t쵀\t최\t춰\t췌\t취\t츼\tㅋ\t콰\t쾌\t쾨\t쿼\t퀘\t퀴\t킈\tㅌ\t톼\t퇘\t퇴\t퉈\t퉤\t튀\t틔\tㅍ\t퐈\t퐤\t푀\t풔\t풰\t퓌\t픠\tㅎ\t화\t홰\t회\t훠\t훼\t휘\t희\tㄲ\t꽈\t꽤\t꾀\t꿔\t꿰\t뀌\t끠\tㄸ\t똬\t뙈\t뙤\t뚸\t뛔\t뛰\t띄\tㅃ\t뽜\t뽸\t뾔\t뿨\t쀄\t쀠\t쁴\tㅆ\t쏴\t쐐\t쐬\t쒀\t쒜\t쒸\t씌\tㅉ\t쫘\t쫴\t쬐\t쭤\t쮀\t쮜\t쯰", 8);
                return cVarA2 == aVar2 ? aVar2 : cVarA2;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f56110b;
                int i14 = 1;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f56110b = 1;
                this.f56111c.getClass();
                int i15 = 0;
                List listW0 = q.W0("ALL\tㄱ\tㄴ\tㄷ\tㄹ\tㅁ\tㅂ\tㅇ\t아\t악/ag\t안/an\t앋/ad\t알/al\t암/am\t압/ab\t앙/ang\t어\t억/eog\t언/eon\t얻/eod\t얼/eol\t엄/eom\t업/eob\t엉/eong\t오\t옥/og\t온/on\t옫/od\t올/ol\t옴/om\t옵/ob\t옹/ong\t우\t욱/ug\t운/un\t욷/ud\t울/ul\t움/um\t웁/ub\t웅/ung\t으\t윽/eug\t은/eun\t읃/eud\t을/eul\t음/eum\t읍/eub\t응/eung\t이\t익/ig\t인/in\t읻/id\t일/il\t임/im\t입/ib\t잉/ing\t애\t액/aeg\t앤/aen\t앧/aed\t앨/ael\t앰/aem\t앱/aeb\t앵/aeng\t에\t엑/eg\t엔/en\t엗/ed\t엘/el\t엠/em\t엡/eb\t엥/eng", new String[]{"\t"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listW0) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                int i16 = 8;
                List listK0 = m.k0(m.U0(arrayList, 8), 1);
                ArrayList arrayList2 = new ArrayList();
                for (int i17 = 1; i17 < 9; i17++) {
                    arrayList2.add(arrayList.get(i17 * 8));
                }
                ArrayList arrayList3 = new ArrayList();
                int i18 = 1;
                while (i18 < 9) {
                    ArrayList arrayList4 = new ArrayList();
                    int i19 = i14;
                    while (i19 < i16) {
                        int i21 = (i18 * 8) + i19;
                        if (i21 < arrayList.size()) {
                            List listW1 = q.W0((String) arrayList.get(i21), new String[]{"/"}, i15, 6);
                            arrayList4.add(new KOCharZhuyin(0L, (String) listW1.get(i15), listW1.size() == 2 ? (String) listW1.get(i14) : null));
                        }
                        i19++;
                        arrayList = arrayList;
                        i16 = 8;
                        i14 = 1;
                        i15 = 0;
                    }
                    arrayList3.add(arrayList4);
                    i18++;
                    i16 = 8;
                    i14 = 1;
                    i15 = 0;
                }
                c cVar = new c(arrayList2, listK0, arrayList3);
                return cVar == aVar3 ? aVar3 : cVar;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f56110b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f56110b = 1;
                c cVarA3 = b.a(this.f56111c, "ALL\tㅏ\tㅓ\tㅗ\tㅜ\tㅡ\tㅣ\tㅐ\tㅔ\tㄱ\t가\t거\t고\t구\t그\t기\t개\t게\tㄴ\t나\t너\t노\t누\t느\t니\t내\t네\tㄷ\t다\t더\t도\t두\t드\t디\t대\t데\tㄹ\t라\t러\t로\t루\t르\t리\t래\t레\tㅁ\t마\t머\t모\t무\t므\t미\t매\t메\tㅂ\t바\t버\t보\t부\t브\t비\t배\t베\tㅅ\t사\t서\t소\t수\t스\t시\t새\t세\tㅇ\t아\t어\t오\t우\t으\t이\t애\t에\tㅈ\t자\t저\t조\t주\t즈\t지\t재\t제\tㅊ\t차\t처\t초\t추\t츠\t치\t채\t체\tㅋ\t카\t커\t코\t쿠\t크\t키\t캐\t케\tㅌ\t타\t터\t토\t투\t트\t티\t태\t테\tㅍ\t파\t퍼\t포\t푸\t프\t피\t패\t페\tㅎ\t하\t허\t호\t후\t흐\t히\t해\t헤\tㄲ\t까\t꺼\t꼬\t꾸\t끄\t끼\t깨\t께\tㄸ\t따\t떠\t또\t뚜\t뜨\t띠\t때\t떼\tㅃ\t빠\t뻐\t뽀\t뿌\t쁘\t삐\t빼\t뻬\tㅆ\t싸\t써\t쏘\t쑤\t쓰\t씨\t쌔\t쎄\tㅉ\t짜\t쩌\t쪼\t쭈\t쯔\t찌\t째\t쩨", 9);
                return cVarA3 == aVar4 ? aVar4 : cVarA3;
        }
    }
}
