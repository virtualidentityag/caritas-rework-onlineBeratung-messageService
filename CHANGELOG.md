# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

## 3.0.0 (2024-06-18)


### ⚠ BREAKING CHANGES

* creating a new database for messageservice is required

### Features

* [VIC-795] added fork auto sync config ([4d15566](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4d1556650ffbba9bf3ee53c5fb21f10869ae2105))
* adapt documentation ([e48e117](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e48e1174a2ba28da82af21144b08ce5cbc0b36a4))
* adapt new database for messageservice ([e60c87a](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e60c87af3607a61f92b673cea2646f2f827ee21e))
* adapt new keycloak version ([5dc10ab](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/5dc10ab280c8ba8594706fd39a10ae08ebd0e2d0))
* add api authorization hint and rc systemuser id in properties ([af779bd](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/af779bd504a52b213b7bf8dbfa1408d4265cdecd))
* add authorization headers for api client ([b88eb89](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b88eb896aaeb1546e410e3852a9706f370177f2c))
* add endpoint to delete a message, optionally an attachment ([f05dbbb](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f05dbbb94c01f192ce54f7e7a333f3f66000f80e))
* add fromConsultantId to reassignment ([46b9425](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/46b94259fd4e9fe73252ad10ad02804f77785196))
* add manual parameter validation ([7eb7100](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/7eb71000511dd9fe3c1fb04154f4ce02093c6e1c))
* add org column to message draft table ([0db932a](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0db932a7f839fce735c0617e152638fadaa06381))
* add required authorities for alias only message ([2f7be59](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2f7be590397a3ee37ecec2cb1c12d8fb77f0da0d))
* add t (type) to messages in api documentation ([cccab8a](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/cccab8a6c7e0d8a3132e065db1931e4ad970a2f3))
* added action trigger ([9de042a](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/9de042a5aafcf5df1ed8b437dea78c00bbf2722b))
* added call to post a further steps message ([2a87bb9](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2a87bb97d12916642f4125e926cdd7a69b6926e0))
* added csrf whitelist property ([0034f53](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0034f53c27dc70d85f8112a797781c2b6b0341a9))
* added message type to alias ([fdf8ee6](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fdf8ee6892791ee5e7d55a5f4abaf5df416bda34))
* added new alias message type ([f3d07cb](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f3d07cb8c3350f5953add5836f93d4aec3db4636))
* avoid messages with protected types ([2210767](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2210767a91275049ecc520c016e93d49f51ad855))
* bring actuator and healtcheck ([bfe8c74](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/bfe8c74592b105c79c1e4657dbf49b88808cfe7a))
* bring actuator and healtcheck ([35dd910](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/35dd9106e9c0d7db16833841478d44170297a8d0))
* bring actuator and healtcheck ([648ddb4](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/648ddb486d35ddbb5ebcc0a7c61db5c082f35660))
* bring actuator and healtcheck ([0cd801e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0cd801e081dd894a092481bfdb5585f4c21c0665))
* check on writing to a feedback chat if provided group id is valid ([8291bb2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8291bb2e8596e4490f674ed7b4a6aded52f0141d))
* create patch-message endpoint ([63b97d5](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/63b97d547ea805e985e5333e30ab990e699e8f5d))
* db migration - add t to draft messages ([a0c709f](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a0c709f0d3dc6e4faf1d335a97c975c898fdaa66))
* define new api andpoints for draft messages ([fb39ee2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fb39ee2cc664dfdd79f7269b3fab1bbc657319ca))
* delete attachment ([6f43213](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/6f43213d9fdd8f6bc47dabccaf01b7e4b06790b0))
* delete draft when message has been send ([0195342](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/01953428eed44088be61d40b34667d01bbbd228f))
* delete message ([f0af02e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f0af02e74cecf54115726b9f0751a4c88476144e))
* delete message ([18e918e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/18e918eeb7986d3a3763e9b740a30380256afaa6))
* enable single domain multitenancy mode (disable subdomain tenant validation for that mode) ([905db53](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/905db53b6ade9bfe036ed1693b88423219a959bf))
* exclude messages by technical user ([822fa8c](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/822fa8cfc521489277deeb21b514934abced7562))
* exclude messages equal since date ([a2d1d29](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a2d1d292a24a37190e1ecf320e2b15d235ccf8f0))
* exclude messages older than since date ([9433f9b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/9433f9bb4d39fef7f5ed9f9f54fda5d9843cdcdd))
* extend logging for better analysis ([faadc60](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/faadc60d16d4833bc709fa057fa29c0eaeb35c0c))
* find full single message for patching ([7f4a4f1](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/7f4a4f101f08ef9ac1a37d2e943cfcbe15915c91))
* find message by ID ([d3e29cf](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/d3e29cf5bf40f0bd5df9afc771459f6c3e4c2e55))
* forbid negative offset or count ([59914c4](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/59914c49dc4048da54237c6cd10ff311119db5ca))
* generalised further steps call to accept any message type ([0c587fa](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0c587faa61e377c14f2dbbe7c0a0238883ac427f))
* generate user service api client ([04486e0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/04486e0d586825d05c337c8645e5ca0eb0d427dd))
* identify user-muted message ([6710ef3](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/6710ef333f4b35b03baefa266a22e9bb2523d70f))
* implementation of statistic trigger and tests ([fb998de](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fb998dec1d31970261caa301309f484b7fab21a2))
* implementation own log methods for statistics events ([e05c705](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e05c705a6aa7970dde737155d2939dccbd27c895))
* improve dev process ([9f8008a](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/9f8008a98e7ce840abafbe4a4f0ea3dfebea6b73))
* improve dev processes ([c32bd4c](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c32bd4c189b0c94698e007a3403cffeec61b1cc7))
* Initial Commit ([9083810](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/90838106445c029f43afc05307b8816888b0be7f))
* integrate anonymous authority ([ea2cb45](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/ea2cb45f6f89907167cd277ae68912fe14d98d16))
* integrate live event trigger ([ef5b276](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/ef5b276ff2ebf968baf539f63b970ba91e4c78b6))
* integrate mail trigger for reassignments and extend system message model ([e41f48e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e41f48e7853f10e76ff4cda4a625d515133a93a1))
* introduce e2ee message type for rocket chat messages ([4fbf015](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4fbf0155a67952e6d4722ebb7b950cb819917b09))
* introduce response type for sending messages ([020a06d](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/020a06dd4cd619e349be24c10f7a1ed713be0df0))
* make alias args easily extendable ([93460e0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/93460e05b4170d6fdf3de8ce369176f6d329a9fd))
* make attachment removal mandatory ([bdf43f0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/bdf43f0a2db214e23ad93d9d90b558fb2a8042b2))
* make attachment removal mandatory ([44f3b4b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/44f3b4b7b4917c0911d6f3637170df71b53c95df))
* message type for lost masterkey ([4128de9](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4128de9ac0d03102097c682b65dcfb7358a2b4a9))
* new eventtypes for videocalls ([a8d1450](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a8d145062fd408def03cf44f759b832c0a4df218))
* new message format ([4dc0c15](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4dc0c15658a696e8989585c4992acd6ca595726b))
* new statisticsservice.yaml with changes in create message statistics event ([63c7265](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/63c7265649644a73f7a785fe5a5635ee03b258e3))
* new statisticsservice.yaml with changes in create message statistics event ([3ddfd15](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/3ddfd15fc8aa9383f0d5bc3acf20eb00f97a64fb))
* omit backend encryption of e2e messages ([68c6055](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/68c605534f0aaf60e27e0b30ae77ae8d189714bb))
* optimizations ([e1b60b1](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e1b60b1dcb793171c0d0a3f2cd3dd780eb27b2f4))
* paginate message stream ([2249752](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2249752555f0e807c634262a691f5d6bd5891343))
* prevent live event trigger for rocket chat system user ([55ae8d8](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/55ae8d87fddd96613ad5f21c3810cd8f525e3000))
* provide controller endpoint to retrieve saved draft message ([fa3820e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fa3820ee39822fedde35def34084566700109d3e))
* provide controller endpoint to save draft messages ([2668490](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/266849009490b35d2580455ab0da84e132c23dab))
* provide ghcr registry ([f2cbe7d](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f2cbe7d5c17aeb6e3648f6e057d0828fa45aacc9))
* provide new endpoint for hinttexts, extend alias object ([b132691](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b1326911157279f92bbcdbf39021afb9962ae068))
* provide service method to search for draft message ([524d916](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/524d9161e00428aa40b839c043d8fb12944c7bb6))
* provide service to save, overwrite and delete draft messages ([f8f7988](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f8f79887d38fe7239bbd52a5fb2c9c906de3e433))
* remove fallback message for e2e ([bb8661c](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/bb8661cc0152eb776e8e6086ef8366c0a49c1e22))
* remove unnecessary content declarations ([936735d](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/936735d4a8d43cba47b2ab8e6470b6bbc7f82a63))
* remove unused role authorization mapping ([641fbe2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/641fbe2a209675bbf97341be4bc7b931b144d0dc))
* restrict release action to relase starting branches ([47925c6](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/47925c6bfe75897e19c0026001fb155826d93308))
* restructure and extend alias object for video information ([e0b3ca2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e0b3ca2125fb83216161a6c75d544f7d7cdd83c8))
* save reassign-consultant message ([8d77143](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8d771435a06edd550f849fc2d57f0571e19e0130))
* send new message mail when master key lost alias is triggered ([81c364a](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/81c364a89ce3db7acaf13639362c4094fb7012a8))
* send original message to rocket chat ([2f8e5ff](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2f8e5fff3c57c3544aabd0bd9e8d2d3ad05bbdc5))
* seperate changelog configurations ([4a2fcee](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4a2fcee56d60b354a431f0e4acd9a742b98e5474))
* set user-muted message type ([78a207e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/78a207e51daa513dbc1bd3e7bb7cd1877d1d1658))
* statistic events for messages including adviceseeker ([2f67904](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2f679044cfe60ba5c328d5bb6d86107604c97a54))
* switched java version for docker build, github actions and maven build ([50cafbc](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/50cafbca0b05730a9ef406e92c08288f6274d2b9))
* update api client ([1d0935c](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/1d0935c05bf9ef812eeecb3c078c006f1d5d00ab))
* update api client ([68c59b4](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/68c59b40376e7de4a6e3421148371efd905f2463))
* update api client ([f39efe0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f39efe0a772fa5b0430c365e633437dc6bc7231f))
* update keycloak to 11.0.2 ([8d9aa25](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8d9aa257768c9fd11dbd4fcb605b299c5ade2768))
* update of statisticsservice.yaml ([c512da7](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c512da720349fe40ee511f7d22e4060a359fb896))
* update of statisticsservice.yaml and corresponding changes ([0afd784](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0afd784abb45ba8247dda7cbd432d0eaebd71c02))
* update reassignment-consultant event ([49e17a2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/49e17a296d90cd9df0b969baff642ac5dd6fbfc4))
* update spring boot and dependencies ([ea09118](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/ea09118bbdd8624c20775b079339904a90e9096e))
* update swagger to openapi and define api models ([9cb3290](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/9cb3290e6b9d11b401b1219aabeae1ee96fc5f38))
* updated docker workflow with proper tagging ([a646b19](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a646b19647e0b6105e71f88ee47a922cd9857ef4))
* updated dockerImage.yml ([bfa61ab](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/bfa61abb188e1162234ca0f4fd3e6f807c7ab2e0))
* updated service api descriptions ([c2693e3](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c2693e3cb3324ebb743efaa32d26760ef604b759))
* upgrade keycloak to the latest version ([6bcd9c1](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/6bcd9c12143ea814fe392e9a56e529d5c8fe28ac))


### Bug Fixes

* 401 unauthorized issue if userapi called by adviceseeker ([34272bf](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/34272bff0452d35b9bce690cc13b660bc48da72a))
* add fallback for stringified legacy messages ([b2cbc33](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b2cbc33c70ae74db3c15530c9d9c34da19904817))
* add org to feedback messages ([bb19bf2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/bb19bf2e4522aba833397fd11ceb92aacca45745))
* add property values to fix integration tests ([a92a6d3](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a92a6d32ac6ad5f6ef1b468f47cb320246f45f04))
* add status to work around Rocket.Chat last-message issue ([e676a83](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e676a836ad6cf4bb386e9501b0a83db3a020d531))
* added java doc ([a31f8a7](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a31f8a7c7596ceffbfd71ab31a4314962b081f78))
* added npm install for github release action ([e094b60](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e094b600cc4512e2f107094be174f5fa84cbf581))
* adjust to delete-attachment flag ([069fc04](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/069fc0456372391ffdcdc2a7083a89997bd76d6d))
* align the endpoint for feedback with the regular one ([52d8fc8](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/52d8fc8ab0cd605df153e6b291aac74d366722ac))
* check boolean against null ([c7a4d29](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c7a4d29e445ab571722f93256bc2846a37139987))
* codestyle issue ([67b14bb](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/67b14bb262bc0b0d7bbebb26a57209326175f553))
* concurrency issue when save and delete a draft message in parallel ([5780497](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/57804978bdc0e460bc7354fa0c403fa739278e64))
* consultant access to save-alias-only message ([23168a4](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/23168a43c4577bd3a832c22c8c9b0b5cf1a53552))
* dont need to publish to docker.pkg, skip it to accelerate builds ([cc214b7](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/cc214b79226c3f32ae28a9bbf8aa9658df21f031))
* failing test ([fa14ee7](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fa14ee79cd0c2c3170db44d74642c0a356e3c948))
* failing tests because of protected message type ([f8b2554](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f8b255433dc56f276880db8e492ce09673729562))
* fix critical cves ([f96d052](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f96d052c84f0408affa33305864c00d101315571))
* fix critical cves ([5bc7952](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/5bc7952d8232c58e82cfb3ecc434a0122314890d))
* fix critical cves ([1908f47](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/1908f4770696bb060b79be24c544671f42e5849f))
* fix CVEs ([e7ba9a8](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e7ba9a872ead2a246fe1ab6a16c82e3c9368224c))
* fix CVEs ([4b8e7dd](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4b8e7dd1f30136a978fa655a3f7b036edbbdd99e))
* fix CVEs ([f9ba33c](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f9ba33c1fef4930c0c93e6883de1eb124f0fd537))
* fix CVEs ([0e88492](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0e88492f7c989858b2f7d6f8dd6e9a623f42a600))
* fix CVEs ([670201e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/670201e9aac4823f96023ba46d07d6809efef5bf))
* fix for invalida api client parameter and bad request ([3ad1d61](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/3ad1d612121166b056894ab5baf8832ebde917ed))
* fix mysql incompatibilities ([aac76c8](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/aac76c8a4ca12678940d4765e6d56af1978260db))
* fix mysql incompatibilities ([b0da12c](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b0da12c0ffbe5137f0864fef46fa7ccdc574e68d))
* fix tenant resolution for cross validation for intra service communication ([3722dde](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/3722dde9e1db80ba676e0a72d82a97f4dfcc20ed))
* fixed unit test ([79812c5](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/79812c5ad9f17111ad0f3d33c475d47c1611d4d8))
* force safe log4j version ([a4fdbbd](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a4fdbbd4bd2e9e8dbcf107c5d8b2d512fda6d846))
* live-proxy client ([559267b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/559267b2aabeffb5f379b65a1c0c76d3bf0cb868))
* logservice tests to be independent of logback rule ([87905bc](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/87905bc837c35828b69c8b4bc93a75e35aa230d9))
* make tenant service api client stateless ([e10557b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e10557b22f40c99f82d79f129baf11cb26bbf6fd))
* naming typo, add just build image workflow ([c83e502](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c83e5028674276bcb716c5732e29f4f5f2f4412d))
* naming typo, add just build image workflow ([a570d96](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a570d9650a37d550c90a7def8861828145e8892f))
* naming typo, add just build image workflow ([b7bda5e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b7bda5ef80b5ac0a31b327d74770d9c8d15a9ef6))
* naming typo, add just build image workflow ([9f2ade4](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/9f2ade49b49675b3b6e3ccdf48fe2fd80a0dda01))
* naming typo, add just build image workflow ([99d2268](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/99d2268aeb4c7e28bac94b2c8a2b195bdd2f7dd7))
* NPE for erstanfragen ([1541d6b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/1541d6b8e9c0f52860c13dcd37a79b8943ce42b7))
* NPE for session without user ([a8edec9](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a8edec9a31b2661c54b1895f25cd7beda84aa5e5))
* parsing issue fixed for quoted strings ([111d891](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/111d8910c236dd87fcf2f30fb5df80db04b585c4))
* removed unused field setter ([f98594b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f98594bfede8b50e0404c44edc6a8a015caa4ea1))
* replaced deprecated method ([b994f78](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b994f78e4f13b5c37f54d27f0530a462203047ee))
* send email notifications for async operations by passing tenant context ([4e5180b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4e5180b012ddeaaeb23b66113f4f9d78b0269c5f))
* setup alias message without protected type ([72f6e01](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/72f6e019a26e16a5b1c99d3712e746d9009b1b99))
* store tenantid on message create stats ([f7a594f](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f7a594f7286ea4282d8181fdb4b6e6bd21205879))
* test failure ([97947cb](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/97947cb8431d6f37c2111a4f67195536d8b165ee))
* typo ([b5babea](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b5babea12508b0495d07a302472c2734b617be4d))
* unaware request scope in multiple threads ([8172a9c](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8172a9c6b18a52f498c5b3aa769cfa84d69d1241))
* unaware request scope in multiple threads ([f9ab571](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f9ab5716142b829d31d3f73c6d6d43bf8a029d6c))
* update deprecated logging property ([fbf6143](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fbf614388b342ee4932c87b7de22507734c853b8))
* update forward message and video-call message ([529a53d](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/529a53dc06edcbf015df07c3c9552fe2504841e7))
* update log4j ([8df71df](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8df71df5387db9a307fca2153f3c2da11611de4f))
* update t if draft exists ([91aced6](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/91aced673fa58a0f037465137393d19597e5dd41))
* use escaping for html characters ([8c81091](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8c810915510af666a9de9482803dbf86ea7475f7))
* user client ([6e7b782](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/6e7b782ddf3a545b1add3c3cbb3aa2a4f90d0029))
* widen access to find-message endpoint ([1a0d69d](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/1a0d69d1a3582567aa11c67fb72c76976723b211))

## [2.5.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v2.4.0...v2.5.0) (2021-12-14)


### Features

* adapt documentation ([e48e117](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e48e1174a2ba28da82af21144b08ce5cbc0b36a4))
* implementation of statistic trigger and tests ([fb998de](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fb998dec1d31970261caa301309f484b7fab21a2))
* implementation own log methods for statistics events ([e05c705](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e05c705a6aa7970dde737155d2939dccbd27c895))
* new message format ([4dc0c15](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4dc0c15658a696e8989585c4992acd6ca595726b))
* new statisticsservice.yaml with changes in create message statistics event ([3ddfd15](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/3ddfd15fc8aa9383f0d5bc3acf20eb00f97a64fb))
* new statisticsservice.yaml with changes in create message statistics event ([63c7265](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/63c7265649644a73f7a785fe5a5635ee03b258e3))
* optimizations ([e1b60b1](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e1b60b1dcb793171c0d0a3f2cd3dd780eb27b2f4))
* remove unused role authorization mapping ([641fbe2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/641fbe2a209675bbf97341be4bc7b931b144d0dc))
* update of statisticsservice.yaml ([c512da7](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c512da720349fe40ee511f7d22e4060a359fb896))
* update of statisticsservice.yaml and corresponding changes ([0afd784](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0afd784abb45ba8247dda7cbd432d0eaebd71c02))
* updated dockerImage.yml ([bfa61ab](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/bfa61abb188e1162234ca0f4fd3e6f807c7ab2e0))
* updated service api descriptions ([c2693e3](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c2693e3cb3324ebb743efaa32d26760ef604b759))


### Bug Fixes

* added java doc ([a31f8a7](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a31f8a7c7596ceffbfd71ab31a4314962b081f78))
* codestyle issue ([67b14bb](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/67b14bb262bc0b0d7bbebb26a57209326175f553))
* fixed unit test ([79812c5](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/79812c5ad9f17111ad0f3d33c475d47c1611d4d8))
* replaced deprecated method ([b994f78](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b994f78e4f13b5c37f54d27f0530a462203047ee))
* test failure ([97947cb](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/97947cb8431d6f37c2111a4f67195536d8b165ee))
* typo ([b5babea](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b5babea12508b0495d07a302472c2734b617be4d))

## [2.4.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v2.3.0...v2.4.0) (2021-06-18)


### Features

* adapt new keycloak version ([5dc10ab](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/5dc10ab280c8ba8594706fd39a10ae08ebd0e2d0))
* add required authorities for alias only message ([2f7be59](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2f7be590397a3ee37ecec2cb1c12d8fb77f0da0d))
* added new alias message type ([f3d07cb](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f3d07cb8c3350f5953add5836f93d4aec3db4636))
* extend logging for better analysis ([faadc60](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/faadc60d16d4833bc709fa057fa29c0eaeb35c0c))
* integrate anonymous authority ([ea2cb45](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/ea2cb45f6f89907167cd277ae68912fe14d98d16))

## [2.3.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v2.2.1...v2.3.0) (2021-04-12)


### Features

* generalised further steps call to accept any message type ([0c587fa](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0c587faa61e377c14f2dbbe7c0a0238883ac427f))
* switched java version for docker build, github actions and maven build ([50cafbc](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/50cafbca0b05730a9ef406e92c08288f6274d2b9))

### [2.2.1](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v2.2.0...v2.2.1) (2021-03-22)


### Bug Fixes

* use escaping for html characters ([8c81091](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8c810915510af666a9de9482803dbf86ea7475f7))

## [2.2.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v2.1.0...v2.2.0) (2021-03-22)


### Features

* added call to post a further steps message ([2a87bb9](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/2a87bb97d12916642f4125e926cdd7a69b6926e0))
* added csrf whitelist property ([0034f53](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/0034f53c27dc70d85f8112a797781c2b6b0341a9))
* added message type to alias ([fdf8ee6](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fdf8ee6892791ee5e7d55a5f4abaf5df416bda34))


### Bug Fixes

* concurrency issue when save and delete a draft message in parallel ([5780497](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/57804978bdc0e460bc7354fa0c403fa739278e64))

## [2.1.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v2.0.0...v2.1.0) (2021-02-08)


### Features

* add api authorization hint and rc systemuser id in properties ([af779bd](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/af779bd504a52b213b7bf8dbfa1408d4265cdecd))
* provide new endpoint for hinttexts, extend alias object ([b132691](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b1326911157279f92bbcdbf39021afb9962ae068))
* restructure and extend alias object for video information ([e0b3ca2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e0b3ca2125fb83216161a6c75d544f7d7cdd83c8))

## [2.0.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v1.3.1...v2.0.0) (2020-11-23)


### ⚠ BREAKING CHANGES

* creating a new database for messageservice is required

### Features

* adapt new database for messageservice ([e60c87a](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e60c87af3607a61f92b673cea2646f2f827ee21e))
* define new api andpoints for draft messages ([fb39ee2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fb39ee2cc664dfdd79f7269b3fab1bbc657319ca))
* delete draft when message has been send ([0195342](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/01953428eed44088be61d40b34667d01bbbd228f))
* prevent live event trigger for rocket chat system user ([55ae8d8](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/55ae8d87fddd96613ad5f21c3810cd8f525e3000))
* provide controller endpoint to retrieve saved draft message ([fa3820e](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fa3820ee39822fedde35def34084566700109d3e))
* provide controller endpoint to save draft messages ([2668490](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/266849009490b35d2580455ab0da84e132c23dab))
* provide service method to search for draft message ([524d916](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/524d9161e00428aa40b839c043d8fb12944c7bb6))
* provide service to save, overwrite and delete draft messages ([f8f7988](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f8f79887d38fe7239bbd52a5fb2c9c906de3e433))
* restrict release action to relase starting branches ([47925c6](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/47925c6bfe75897e19c0026001fb155826d93308))
* seperate changelog configurations ([4a2fcee](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/4a2fcee56d60b354a431f0e4acd9a742b98e5474))
* update keycloak to 11.0.2 ([8d9aa25](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8d9aa257768c9fd11dbd4fcb605b299c5ade2768))
* update spring boot and dependencies ([ea09118](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/ea09118bbdd8624c20775b079339904a90e9096e))


### Bug Fixes

* add property values to fix integration tests ([a92a6d3](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/a92a6d32ac6ad5f6ef1b468f47cb320246f45f04))
* update deprecated logging property ([fbf6143](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/fbf614388b342ee4932c87b7de22507734c853b8))

### [1.3.1](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v1.3.0...v1.3.1) (2020-10-28)

## [1.3.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v1.2.3...v1.3.0) (2020-10-28)


### Features

* add authorization headers for api client ([b88eb89](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/b88eb896aaeb1546e410e3852a9706f370177f2c))
* generate user service api client ([04486e0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/04486e0d586825d05c337c8645e5ca0eb0d427dd))
* integrate live event trigger ([ef5b276](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/ef5b276ff2ebf968baf539f63b970ba91e4c78b6))
* remove unnecessary content declarations ([936735d](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/936735d4a8d43cba47b2ab8e6470b6bbc7f82a63))
* update swagger to openapi and define api models ([9cb3290](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/9cb3290e6b9d11b401b1219aabeae1ee96fc5f38))


### Bug Fixes

* check boolean against null ([c7a4d29](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/c7a4d29e445ab571722f93256bc2846a37139987))

### [1.2.3](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v1.2.2...v1.2.3) (2020-10-12)

### [1.2.2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v1.2.1...v1.2.2) (2020-10-12)

### [1.2.1](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/v1.2.0...v1.2.1) (2020-08-26)

## [1.1.0](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/compare/e094b600cc4512e2f107094be174f5fa84cbf581...v1.1.0) (2020-07-29)


### Bug Fixes

* added npm install for github release action ([e094b60](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e094b600cc4512e2f107094be174f5fa84cbf581))

## 1.2.0 (2020-08-26)


### Features

* check on writing to a feedback chat if provided group id is valid ([8291bb2](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/8291bb2e8596e4490f674ed7b4a6aded52f0141d))
* Initial Commit ([9083810](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/90838106445c029f43afc05307b8816888b0be7f))


### Bug Fixes

* logservice tests to be independent of logback rule ([87905bc](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/87905bc837c35828b69c8b4bc93a75e35aa230d9))
* removed unused field setter ([f98594b](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/f98594bfede8b50e0404c44edc6a8a015caa4ea1))


## 1.1.0 (2020-07-29)


### Features

* Initial Commit ([9083810](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/90838106445c029f43afc05307b8816888b0be7f))


### Bug Fixes

* added npm install for github release action ([e094b60](https://github.com/CaritasDeutschland/caritas-onlineBeratung-messageService/commit/e094b600cc4512e2f107094be174f5fa84cbf581))
