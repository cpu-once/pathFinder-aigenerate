1. 기초 공사 및 스캐폴딩 (Foundation)
[ ] 모놀레포 설정: /frontend, /backend, /agents를 관리할 워크스페이스(Turborepo 등) 구축.

[ ] 공통 설정: - [ ] 글로벌 .gitignore (node_modules, build, .env 등 필터링).

[ ] Docker Secrets 또는 환경 변수 관리 전략 수립.

[ ] 문서화: - [ ] 기술 스택별 역할 정의서 작성 (Spring Boot, React 등).

[ ] GitHub Actions CI/CD 워크플로우 다이어그램 초안.

2. 설계 및 모델링 (Design & Modeling)
[ ] API 규격 정의: - [ ] YAML 기반 OpenAPI(Swagger) 스펙 정의.

[ ] Orval을 이용한 프론트엔드 타입/클라이언트 자동 생성 (shared 폴더).

[ ] 초기 스키마용 SQL DDL 추출.(Graph, PostgreSQL, MySql) -> DDL create

[ ] 데이터 아키텍처: - [ ] RDB: PostgreSQL 기반 BCNF 준수 모델링 (메타데이터).

[ ] Graph: Neo4j 기반 관계형 위상 모델링 (현장/이슈 관계).

3. 코드형 인프라 (IaC)
[ ] 컨테이너화: - [ ] 프론트엔드 멀티 스테이지 빌드 (Vite + Nginx).

[ ] 백엔드 WAS 도커 스크립팅 (JRE 최적화).

[ ] DB(PostgreSQL/Neo4j) 초기화 스크립트 포함 이미지 빌드.

[ ] 오케스트레이션: - [ ] 로컬 개발용 docker-compose.yml 작성.

[ ] 운영환경용 K8s 매니페스트(Deployment, Service) 작성.

[ ] GitOps: - [ ] ArgoCD 또는 Flux를 통한 /deployment 폴더 동기화 설정.

4. AI 에이전트 및 인간 개입 (HITL)
[ ] AI 통합: - [ ] Gemini/Claude API 연동 (ai-proposer).

[ ] 프롬프트 버전 관리 시스템 구축.

[ ] HITL 워크플로우: - [ ] AI 제안에 대한 인간 승인/수정 UI 개발.

[ ] 인간 승인 후 상태 변경을 위한 @TransactionalEventListener 구현.
[ ] 기성 실행직전 까지 제안은 여러번 있을 수 있다.

[ ] "AI 제안 vs 인간 수정" 이력을 추적하는 감사 로그(Audit Log) 시스템.
